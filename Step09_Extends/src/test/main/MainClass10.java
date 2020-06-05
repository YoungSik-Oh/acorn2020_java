package test.main;

import test.extends2.Blood;

public class MainClass10 {
	public static void main(String[] args) {
		//Blood 객체를 생성해서 참조값 b1 이라는 지역 변수에 담아보세요.
		Blood b1= new Blood("RH+","AB"); // rh+ ab형
		String a=b1.getRh();
		String b=b1.getType();
		System.out.println(a + " " + b);
		
		Blood b2= new Blood("+","A"); // rh+ a 형

		String c=b2.getRh();
		String d=b2.getType();
		System.out.println(c + " " + d  );
	}

}
