package test.mapac;

public class Car {
	// 필드
	private String name;
	// 생성자 
	public Car(String name) {
		this.name=name;
	}
	
	public void drive() {
		System.out.println(name+"부르응부를");
	}
}
