package test.mypac;
/*
 *  class 명<Generic type>
 *  
 *  - 클래스를 정의할때 Gneric type 을 지정해서 특정 type을 동적으로 지정할수 있다.
 *  
 */
public class FruitBox<t> { // 여러개 타입 사용가능
	//필드
	private t item;
	// 메소드
	public void push(t item) {
		this.item=item;
	}
	public t pull() {
		return item;
	}
}
