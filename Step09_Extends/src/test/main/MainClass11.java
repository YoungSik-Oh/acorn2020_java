package test.main;

import test.extends2.Blood;
import test.extends2.Men;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * 	프로그래밍의 목적 : 영화를 보고 싶다.
		 *  영화를 보는 프로그래밍의 목적을 달성해보시오
		 */
//		Men m=new Men();
		Men m=new Men(new Blood("Rh+","AB")); // Men m = new Men(); 생성자 호출 // 
		m.seeMovie();
		
		Blood b1=new Blood("+", "o");
		Men men2=new Men(b1);
		men2.seeMovie();
		
		new Men(new Blood("-","B")).seeMovie(); // 1번만 사용함
		
	}

}
