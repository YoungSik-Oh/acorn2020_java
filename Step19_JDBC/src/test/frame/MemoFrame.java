package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dao.MemoDao;
import test.dto.MemoDto;

/*
 * 	create table memo
 *  (num number primary key,
 *   content varchar2(30),
 *   regdate date);
 *   
 *   create sequence memo_seq;
 *   
 *   위와 같이 테이블과 시퀀스를 만들고 해당 테이블에 데이터를
 *   select, insert, updatem delete 기능을 수행할수있는 memoFrame 만들기
 *   
 *   조건 
 *   1. num 칼럼은 시퀀스를 이용해서 입력 
 *   2. regdate 칼럼 (등록일) 같은 stsdate 를 이용해서 넣기
 *   3. 수정은 content만 수정 가능하게
 *   4. memoDto, memoDao 를 만들어라 
 * 
 * 
 * 
 */
public class MemoFrame extends JFrame 
							implements ActionListener,PropertyChangeListener {
	JTextField text;
	JTable table;
	DefaultTableModel model;
	
	public MemoFrame() {
		setLayout(new BorderLayout());
		JPanel p=new JPanel();
		
		JLabel label=new JLabel("컨텐츠");
		text=new JTextField(10);
		
		JButton saveBtn=new JButton("저장");
		saveBtn.setActionCommand("save");
		saveBtn.addActionListener(this);
		
		JButton deleteBtn=new JButton("삭제");
		deleteBtn.setActionCommand("del");
		deleteBtn.addActionListener(this);
		
		p.add(label);
		p.add(text);
		p.add(saveBtn);
		p.add(deleteBtn);
		
		add(p, BorderLayout.NORTH);
		
		table=new JTable();
		String[] colNames= {"번호", "컨텐츠", "등록일"};
		model=new DefaultTableModel(colNames,0);
		table.setModel(model);
		JScrollPane scroll=new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		displayMemo();
	}
	// 테이블에 출력하는 메소드
	public void displayMemo() {
		model.setRowCount(0);
		MemoDao dao=MemoDao.getInstance();
		List<MemoDto> list=dao.getList();
		for(int i=0; i < list.size(); i++) {
			MemoDto tmp=list.get(i);
			Object[] row= {tmp.getNum(),tmp.getContent(),tmp.getRegdate()};
			model.addRow(row);
		}
	}
	public static void main(String[] args) {
		MemoFrame f=new MemoFrame();
		f.setBounds(500, 300, 800, 500);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("save")) {
			String saveText=text.getText();
			MemoDto dto=new MemoDto();
			dto.setContent(saveText);
			MemoDao dao=MemoDao.getInstance();
			dao.insert(dto);
			displayMemo();
		}// saveBtn
		else if(command.equals("del")) {
			int selectedRow=table.getSelectedRow();
			if(selectedRow==-1) { // 선택된 row가 없으면 
				return; // 취소해라
			}
			int selection=JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?");
			if(selection != JOptionPane.YES_OPTION) {
				return;
			};
			int num=(int) model.getValueAt(selectedRow, 0);
			MemoDao dao=MemoDao.getInstance();
			dao.delete(num);
			displayMemo();
		}
	}
	// 현재 table cell 수정중인지 여부를 저장할 필드
	boolean isEditing=false;
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		String edited=evt.getPropertyName();
		if(edited.equals("tableCellEditor")) {
			if(isEditing) { // 수정중일때
				int selectedIndex=table.getSelectedRow();
				int num=(int)model.getValueAt(selectedIndex, 0);
				String content=(String)model.getValueAt(selectedIndex, 1);
				//수정할 회원의 정보를 MemoDto 객체에 담고 
				MemoDto dto=new MemoDto(num, content, null);
				//DB에 저장하기 
				MemoDao.getInstance().update(dto);
				isEditing=false;//수정중이 아니라고 표시한다.
			}
			isEditing=true;
		}
	}

}
