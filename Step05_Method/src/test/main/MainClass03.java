package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {


	public static void main(String[] args) {
		MyObject obj1=new MyObject();
				
		obj1.setNum(1);
		obj1.setName("홍길동");
		obj1.useCar(new Car());
		
		int a=20;
		String b="김구라";
		Car c=new Car();
		
		obj1.setNum(a);
		obj1.setName(b);
		obj1.useCar(c);
	}

}
