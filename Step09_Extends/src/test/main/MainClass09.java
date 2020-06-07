package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.SportsCar;


public class MainClass09 {

	public static void main(String[] args) {
		// 내가 만든 Car 클래스를 상속 받아서 만든 클래스로 객체를 생성해서
		// 아래 useCar() 메소드를 호출해봐라
		Taxi tx=new Taxi(new Engine());
		
		MainClass09.useCar(tx);
	}

	public static void useCar(Car car) {
		car.drive();
	}
}
