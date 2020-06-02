package test.main;

import java.util.Scanner;

public class MainClass05 {

	public static void main(String[] args) {
		/*
		 * 	프로그래밍 목적: 키보드로 부터 문자열을 입력 받을 때
		 * 	입력 받아서 콘솔창에 출력
		 */
		
		
		Scanner scan=new Scanner(System.in);
		// 키보드로 입력 받기 위해서는 콘솔창이 열리게 해야함
		System.out.println("입력하시오");
		//Scanner 객체의 메소드를 이용해서 문자열 (String) 입력 받기
		String str=scan.nextLine();
		// 입력 받은 문자열을 콘솔창에 출력
		System.out.println(str);
		str.length();
		System.out.println("main 메소드 종료");
		
	}

}
