package test.main;

import test.auto.Engine;
import test.auto.SportsCar;
<<<<<<< HEAD
import test.auto.Truck;

public class MainClass08 {
	public static void main(String[] args) {
		//Truck 객체를 생성해서 .drive() .dump() 메소드를 호출해 보세요.
		Truck t1=new Truck(new Engine());
		t1.drive();
		t1.dump();
		
		//SprotsCar 객체를 생성해서 .drive() 메소드를 호출해 보세요.
		SportsCar s1=new SportsCar(new Engine());
		s1.drive();
	}
}




=======
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
>>>>>>> refs/remotes/myorigin/study
