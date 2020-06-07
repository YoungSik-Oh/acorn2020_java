package test.main;

import test.mypac.Coffee;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// 직접 클래스를 만들고 객체 생성을해서
		// 아래 useWeapon() method 호출
		Weapon c=new Coffee();
		MainClass02.useWeapon(c);
		
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}
