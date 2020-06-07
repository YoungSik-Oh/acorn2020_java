package test.main;

import test.mypac.Car;
import test.mypac.MyUtil;
import test.mypac.YourUtil;

public class MainClass03 {

	public static void main(String[] args) {
		// Car 객체를 생성후 drive() 메소드 호출
		new Car().drive();
		
		// Car 객체를 생성후 참조값을 car1 이라는 지역변수에 담기
		Car car1=new Car();
		// car1 안에 들어 있는 참조값을 이용해서 drive()메소드 호출
		car1.drive();
		// Car 객체를 생성 후 참조값을 car2라는 지역 변수에 담기
		Car car2=new Car();
		// ca2안에 있는 참조값ㅇ르 이용해서 drive() 메소드 호출
		car2.drive();
		
		// MyUtil 클래스의 send() 라는 static  메소드 호출
		MyUtil.send();
		// YourUtil 클래스의 up() 이라는 static 메소드 호출
		YourUtil.up();
		
		
	}

}

