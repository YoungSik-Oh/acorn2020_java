package test.frame4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		setBounds(100,100,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 레이아웃 매니져를 BorderLayout 으로 지정하기 (2행2열)
		setLayout(new BorderLayout(1,4));
		
		JButton btn1=new JButton("button1");
		add(btn1, BorderLayout.NORTH);
		
		JButton btn2=new JButton("button2");
		add(btn2, BorderLayout.WEST);
		
		JButton btn3=new JButton("button3");
		add(btn3, BorderLayout.EAST);
		
		JButton btn4=new JButton("button4");
		add(btn4, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		
			new MyFrame("나의프레임");
		
	}
	
}
