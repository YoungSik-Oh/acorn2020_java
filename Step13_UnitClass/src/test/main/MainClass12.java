package test.main;

import java.util.HashSet;

import test.mapac.Car;
/*
 * HashSet 은 Set 인터페이스를 구현한 클래스이다.
 * 
 * 	-순서가 없다.
 * 	-key 값도 없다.
 * 	- 중복을 허용하지 않는다.
 * 	- 어떤 data 를 묶음(집함) 으로 관리하고자 할때 사용한다.
 */

public class MainClass12 {
	public static void main(String[] args) {
		// 정수값을 저장할수있는 HashSet 객체
		HashSet<Integer> setInt=new HashSet<>();
		setInt.add(1);
		setInt.add(2);
		setInt.add(2);
		setInt.add(3);
		setInt.add(3);
		//문자열을 저장할수있는 HashSet의 객체
		HashSet<String> setStr=new HashSet<>();
		setStr.add("kim");
		setStr.add("lee");
		setStr.add("park");
		setStr.add("lee");
		setStr.add("park");
		
		
		//Car 객체를 저장할수 있는 HashSet 읙개체
		HashSet<Car> setCar=new HashSet<>();
		setCar.add(new Car("프라이드"));
		setCar.add(new Car("프라이드"));
		setCar.add(new Car("소나타"));
		setCar.add(new Car("그랜져"));
		Car car1=new Car("하하");
		setCar.add(car1);
		setCar.add(car1);
	} 

}
