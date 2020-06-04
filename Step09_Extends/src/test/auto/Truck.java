package test.auto;

public class Truck extends Car{

	//Engine 객체를 생성자를 인자로 전달 받는 메소드
	public Truck(Engine engine) {
		// 자식 생성자로 받은 객체를 부모 생성자에 전달해 주어야 부모 객체가 생성된다.
		super(engine); // super()는 부모생성자를 가리킨다. // 부모 클래스에서 engine 객체를 받아내야한다.
		
	}
	
	// 메소드
	public void dump() {
		
		System.out.println("짐을 쏟아내요");
	}
	
}
