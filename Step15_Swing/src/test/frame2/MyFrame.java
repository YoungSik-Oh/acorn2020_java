package test.frame2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 레이아웃 매니져를 FlowLayout 으로 지정한다.
		setLayout(new FlowLayout()); 
		
		JButton btn1=new JButton("button1");
		btn1.setSize(100,30);
		add(btn1);
		
		JButton btn2=new JButton("button2");
		btn2.setSize(100,30);
		add(btn2);
		
		JButton btn3=new JButton("button3");
		btn3.setSize(100,30);
		add(btn3);
		
		JButton btn4=new JButton("button4");
		btn4.setSize(100,30);
		add(btn4);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
			new MyFrame("나의프레임");
		
	}
	
}
