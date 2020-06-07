package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		// Zoo 클래스에 있는 getMonkey() method를 호출해서
		// return 되는 값을 m1 이라는 지역변수에 담아보셈
		Zoo z1=new Zoo();
		// inner class type Monkey
		Monkey m1=z1.getMonkey();
		//method call
		m1.say();
		
		// Zoo 클래스에 있는 getTiger() 메소드 호출해서
		// return 되는 t1 이라는 지역 변수에 담기
		Tiger m2=z1.getTiger();
		
		m2.say();
		
		
		
	}

}
