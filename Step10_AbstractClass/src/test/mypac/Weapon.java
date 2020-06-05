package test.mypac;

/*
 * 	구현 되지(미완성된) 않는 추상 메소드를 멤버로 가지고 있는 클래스는 
 *  abstract 예약어를 붙여서 정의해야함
 */
public abstract class Weapon {
	// 무기 작동을 준비하는 method 
	public void prepare() {
		System.out.println("무기 작동을 준비");
	}
	// 구현되지 않은(미완성된) 추상메소드를 만들때는 abstract 예약어를 붙여서 method 를 정의한다.
	public abstract void attack();
	
}
