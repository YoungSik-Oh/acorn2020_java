package test.mypac;
/*
 * 접근 지정자
 * 
 * 클래스, 필드, 메소드에 작성함
 * 
 * 1.public 
 * 	- 어디에서나 자유롭게 접근 가능
 * 2. default
 *	- 동일한 package 내에서만 접근 가능 
 *	-package 가 다르면 import 도 불가능
 */

public class Marine {
	// 공격력을 저장하고 있는 static 필드
	public static int attackPower=6;  	// static 영역에 class 와 함께 만들어짐
	// 에너지를 저장하고 있는 non static 필드
	public int energy=40; // heap 영역에 만들어짐 
	
	//움직이는 메소드
	public void move() { // heap 영역에 만들어짐
		System.out.println("마린이 무빙함");
		System.out.println("좌 3 3 우 3 3 ");
		
	}
	// 공격하는 메소드
	public void attack() { // heap 영역에 만들어짐
		System.out.println(Marine.attackPower + "의 공격력으로 공격을함다");
	}
	
	// 현재 에너지를 출력하는 메소드
	public void showEnergy() {
		System.out.println("현재 에너지" + this.energy);
	}

}
