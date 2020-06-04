package test.main;

import test.auto.Engine;
import test.auto.SportsCar;
import test.auto.Taxi;
import test.auto.Truck;

public class MainClass08 {

	public static void main(String[] args) {
		// Truck 객체를 생성해서 .drive() .dump() 메소드 호출
		Truck t=new Truck(new Engine());
		t.drive();
		t.dump();
		
		//SportsCar 객체를 생성해서 .drive() 메소드를 호출
		SportsCar s= new SportsCar(new Engine());
		s.drive();
		
		Taxi tx=new Taxi(new Engine());
		tx.drive();
		
	}

}
