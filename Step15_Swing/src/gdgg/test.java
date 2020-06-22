package gdgg;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class test extends JFrame {
	
	public test() {
		setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.YELLOW);
		add(panel, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		test f=new test();
		f.setTitle("계산기");
		f.setBounds(700,300,500,500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
} 
