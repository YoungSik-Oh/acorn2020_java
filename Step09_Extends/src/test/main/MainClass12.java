package test.main;

import test.extends2.Blood;
import test.extends2.woman;

public class MainClass12 {

	public static void main(String[] args) {
		/*
		 *	프로그래밍의 목적: 독서를 하고 싶다.
		 *	독서를 하는 프로그래밍해보기
		 */
		woman w=new woman(new Blood("rh","b"));
		w.reading();
	}
	
}
