package test.auto;

public class Taxi extends Car {

	public Taxi(Engine engine) {
		super(engine);
	}
		
//	public void customer() {
//		System.out.println("안탐");
//	}
	@Override
	public void drive() {
		System.out.println("타쉴? 키로당 오만원");
		super.drive();
	}
}
