package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass04 {
	public static void main(String[] args) {

		MyObject obj1 = new MyObject();
		Car c1=new Car();
		// useSome() 메소드 호출
		obj1.useSome("그렌졀",c1);
		// doSome() 메소드 호출해보세요
		
		obj1.doSome(new Radio(), new Speaker());
		
	}
}
