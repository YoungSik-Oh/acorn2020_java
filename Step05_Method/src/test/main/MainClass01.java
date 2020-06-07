package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {



		//myobject 클래스에 정의 된 3개의 메소드를 호출하는 code 작성
		MyObject myobj = new MyObject();
		myobj.walk();
		myobj.getNumber();
		myobj.getGreeting();
		
		int a=myobj.getNumber();
		String b=myobj.getGreeting();
	}
}
