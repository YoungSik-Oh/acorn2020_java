package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass06 {

	public static void main(String[] args) {
		// Messenger 클래스의 static 메소드 호출
		Car c1=new Car();
		Messenger.sendMessage("메롱");
		Messenger.getMessage();
		Messenger.useCar(c1);
		

	}

}
