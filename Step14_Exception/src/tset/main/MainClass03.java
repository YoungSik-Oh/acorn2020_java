package tset.main;

import java.io.File;
import java.io.IOException;

/*
 * 	RuntimeException 을 상속 받지 않는 Exception은
 * 	반드시 try ~ catch 블럭으로 묵어서 예외 처리를한다.
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드 시작");
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		File f1=new File("c:/acorn2020/myFolder/test.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드 종료");
	}
	
}
