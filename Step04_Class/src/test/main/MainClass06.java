package test.main;

import test.mypac.Box;
import test.mypac.Car;
import test.mypac.Member;
import test.mypac.Rect;

public class MainClass06 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 됨");
		Member a=Box.member1;
		Rect b=Box.rect;
		Car c=Box.car;  // 참조값이 들어있음
		c.drive(); // 메소드 호출가능;
		// 아래와 같이 사용할수도있다.
		Box.car.drive();
		
		//a.added(); // a 가 null 이므로 nullPointerException 발생
		//b.getArea(); // b가 null 이므로 nullPointerException 발생
		
	}

}
