package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame implements ActionListener{
	JTextField inputName,inputAddr;
	DefaultTableModel model;
	JTable table;
	// 생성자
	public MemberFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("이름");
		inputName=new JTextField(10);
		
		
		JLabel label2=new JLabel("주소");
		inputAddr=new JTextField(10);
		
		JButton saveBtn=new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("del");
		deleteBtn.addActionListener(this);
		
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(saveBtn);
		panel.add(deleteBtn);
		
		add(panel, BorderLayout.NORTH);
		
		// 표 형식으로 정보를 출력하기 위한 JTable
		table=new JTable();
		// 칼럼명을 String[] 에 순서대로 준비
		String[] colNames= {"번호", "이름", "주소"};
		// 테이블에 출력할 정보를 가지고 있는 모델 객체
		  model=new DefaultTableModel(colNames,0);
		// 모델을 테이블에 연결한다.
		table.setModel(model);
		// 스크롤이 가능하도록 테이블을 JScrolPane에 감싼다.
		JScrollPane scroll=new JScrollPane(table);
		// JScrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		//JTable에 sample 데이터 출력해보기
	
		
//		Object[] row1= {1,"김구라","노량진"};
//		Object[] row2= {2,"해골","행신동"};
//		model.addRow(row1);
//		model.addRow(row2);
		
		displayMember();
		
	}
	// 테이블에 회원 목록을 출력하는 메소드
	public void displayMember() {
		// row 의 갯수를 강제로 0으로 지정해서 삭제한다.
		model.setRowCount(0);
		MemberDao dao=MemberDao.getInstance();
		List<MemberDto> list=dao.getList();
		for(int i=0; i<list.size(); i++) {
			// MemberDto 객체에 저장된 정보를 Object[] 객체에 순서대로 담는다.
			MemberDto tmp=list.get(i);
			Object[] row= {tmp.getNum(),tmp.getName(),tmp.getAddr()};
			model.addRow(row);
//			System.out.println(tmp.getNum()+ " | " + tmp.getName() + " | " + tmp.getAddr());
		}
	}
	
	//main 메소드
	public static void main(String[] args) {
		MemberFrame f= new MemberFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("save")) {
			// 입력한 문자열을 읽어와서
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 담아서
			MemberDto dto=new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			//MemberDao 객체를 이용해서 DB 에 저장
			MemberDao dao=MemberDao.getInstance();
//			Object[] row1= {dto.getNum(),dto.getName(),dto.getAddr()};
//			model.addRow(row1);
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, name+" 님의 정보 추가했습니다.");
			}else {
				JOptionPane.showConfirmDialog(this, "추가 실패");
			}
			//JTable에 목록 다시 출력하기
			displayMember();
			}
			else if(command.equals("del")) {
				//1. 선택된 row 인덱스를 읽어온다.
			int selectedrow=table.getSelectedRow();
			if(selectedrow==-1) {// 선택된 row가 없다면
				return;// 메소드를 여기서 끝내라
				
			}
			// 2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다(삭제할 회원의 번호) 
			int num=(int)model.getValueAt(selectedrow, 0);
			// 3. memberDao 객체를 이용해서 해당 회원의 번호를 삭제한다.
			MemberDao dao=MemberDao.getInstance();
			dao.delete(num);
			//4. table 에 회원목록 다시 출력하기
			displayMember();
			
		}
	}
}


