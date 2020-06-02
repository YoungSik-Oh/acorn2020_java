package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	프로그래밍 목적 : 무작위 정수 얻어내고 싶음
		 * 	얻어내서 뭘할지 콘솔창에 출력.
		 */
		
		//Random 객체를 생성해서 참조값을 지역변수에 담기
		Random r=new Random();
		//메소드를 호출하고 리턴되는 값을 지역 변수에 담기
		int a=r.nextInt();
		// 콘솔창에 출력하기
		System.out.println(a);
		/*
		 * 	또 해결해야 하는 문제 : 원하는 범위 내에서 정수값을 얻어내고 싶다.
		 * 	범위는 ? 1~45
		 * 	얻어내서 콘솔창에 출력
		 */
		
		// Random 객체는 이미 생성되어서 r 이라는 지역변수에 담겨있음
		// 다시 생성하지 않고 재 사용
		int lottoNum=r.nextInt(45)+1;
		System.out.println(lottoNum);
		
		
	}
}
