package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	// run 했을 때 실행순서가 시작 되는 틀별한 main method
	public static void main(String[] args) {
		/*
		 *  Weapon 추상클래슬르 상속받은 익명의 local inner class
		 *  의 생성자를 호출해서 Weapon type 의 참조값 얻어내서 지역변수 w1에 담기
		 */
		Weapon w1=new Weapon() {

			@Override// abastract method 이므로 override 해야함 / override 를하여 newWeapon 의 참조값을 얻을 수 있다.
			public void attack() {
				// TODO Auto-generated method stub
				System.out.println("아무나 공격");
				
			}
		};
		Weapon w2=new Weapon() {
			 @Override
			public void attack() {
				// TODO Auto-generated method stub
				 System.out.println("공중공격");
			}
		};
		useWeapon(w1);
		useWeapon(w2);
		useWeapon(new Weapon() {
			@Override
			public void attack() { // 한번 쓰고마는 것 type은 new Weapon 타입
				System.out.println("지상공격");
			}
		});
		
	}
	public static void useWeapon(Weapon w) { // abstract class 이므로 Weapon w1 = new Weapon(); 은 사용 불가 
		w.prepare();
		w.attack();
	}
}
