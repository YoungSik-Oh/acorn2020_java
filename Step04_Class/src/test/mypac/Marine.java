package test.mypac;

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
