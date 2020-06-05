package test.extends2;

public class person {
	// 필드
	public Blood blood;
	// 생성자
//	public person() {
//
//	}
	public person(Blood blood) {
	this.blood =blood;
	}
	public void walk() {
		System.out.println("걸어염");
	}
	public void study() {
		System.out.println("공부 시작");
	}

}
