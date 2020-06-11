package test.frame1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임
		setLayout(null); // null 로 하면 위치 지정해줘야함 
		
		JButton btn1=new JButton("button1");
		// 버튼의 위치와 크기 한번에 지정하기
		btn1.setLocation(10,10);
		btn1.setSize(100,30);
		add(btn1);
		
		JButton btn2=new JButton("button2");
		btn2.setBounds(120, 10, 100, 30);
		add(btn2);
		
		JButton btn3=new JButton("button3");
		btn3.setBounds(230, 10, 100, 30);
		add(btn3);
		
		JButton btn4=new JButton("button4");
		btn4.setBounds(340, 10, 100, 30);
		add(btn4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
			new MyFrame("나의프레임");
		
	}
	
}
