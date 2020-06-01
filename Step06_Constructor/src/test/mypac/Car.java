package test.mypac;

public class Car {
	// field
	public String name;
	
	//Constructor type 을 전달 받는 생성자
	public Car(String name) { 
		// 생성자의 인자로 전달 받은 값을 필드에 저장하기
		this.name=name;
	}
	//Method
	public void drive() {
		System.out.println(this.name + "Run.");
	}
}
