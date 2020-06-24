package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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

public class MemberFrame extends JFrame 
								implements ActionListener,PropertyChangeListener{
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
		 model=new DefaultTableModel(colNames,0) {
			 // 인자로 전달되는 행(row), 열(colmn) 수정 가능 여부를 리턴하는 메소드
			 @Override
			public boolean isCellEditable(int row, int column) {
				 // 만일 첫번째(0번째) 칼럼이면 수정이 불가 하도록한다.
				 if(column==0) {
					 return false;
				 }
				 return true;
			}
		 };
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
		// 테이블에서 발생하는 이벤트 리스너 등록
//		table.addKeyListener(this);
		table.addPropertyChangeListener(this);
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
			// 실제 삭제할 것인지 확인
			int selection =JOptionPane.showConfirmDialog(this, "선택된 row를 삭제하겠습니까?");
			if(selection != JOptionPane.YES_OPTION) {
				return;
			};
			// 2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다(삭제할 회원의 번호)
			// getValuesAt은 Object type 이므로 (int) casting 해준다
			int num=(int)model.getValueAt(selectedrow, 0);
			// 3. memberDao 객체를 이용해서 해당 회원의 번호를 삭제한다.
			MemberDao dao=MemberDao.getInstance();
			dao.delete(num);
			//4. table 에 회원목록 다시 출력하기
			displayMember();
			
		}
	}
//	@Override
//	public void keyPressed(KeyEvent e) {
//		int code=e.getKeyCode();
//		if(code==KeyEvent.VK_ENTER) {
//			int selectedrow=table.getSelectedRow();
//			String name=(String)model.getValueAt(selectedrow, 0);
//			String addr=(String)model.getValueAt(selectedrow, 0);
//			MemberDto dto=new MemberDto();
//			dto.setName(name);
//			dto.setAddr(addr);
//			MemberDao dao=MemberDao.getInstance();
//			dao.update(dto);
//		}
//	}
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	// 현재 table cell 수정중인지 여부를 저장할 필드
	boolean isEditing=false;
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String what=evt.getPropertyName();
		System.out.println(evt.getPropertyName());
		if(what.equals("tableCellEditor")) {
			if(isEditing) { // 수정중일때
				// 변화된 값을 읽어와서 DB에 반영한다.
				// 수정된 칼럼에 있는 row 전체의 값을 읽어온다.
				int selectedIndex=table.getSelectedRow();
				int num=(int)model.getValueAt(selectedIndex, 0);
				String name=(String)model.getValueAt(selectedIndex, 1);
				String addr=(String)model.getValueAt(selectedIndex, 2);
				// 수정할 회원의 정보를 MemberDto 객체에 담고
				MemberDto dto=new MemberDto(num,name,addr);
				//DB에 저장
				MemberDao.getInstance().update(dto);
				isEditing=false;// 수정중이 아니라고 표시
			}
			isEditing=true; // 수정중이라고 표시
		}
	}
}



