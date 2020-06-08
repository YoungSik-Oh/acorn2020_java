package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	// 필드에 Remocon type
	static Remocon r3=new Remocon() {
	
		@Override
		public void up() {
			System.out.println("물건을 오르락");
		}
		@Override
		public void down() {
			System.out.println("물건을 내리락");
		}
	};
	
	public static void main(String[] args) {
		/*
		 * 	Remocon 인터페이스를 구현한 익명의 local inner 클래스의
		 * 	생성자를 호출해서 
		 *  참조값을 얻어내서 Remocon type 의 지역변수 r1에 대입
		 */
		Remocon r1=new Remocon() { // 객체 옆에 {} 붙이면 익명클래스가 된다
			@Override
			public void up() {
				System.out.println("볼륨을 올림");
			}
			@Override
			public void down() {
				System.out.println("볼륨을 내림");
			} 
		};
		useRemocon(r1);
		useRemocon(new Remocon() { // 익명 클래스이다.
			
			@Override
			public void up() {
				System.out.println("하하");
			}
			
			@Override
			public void down() {
				System.out.println("hoho");
			}
		});
		useRemocon(r3);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
