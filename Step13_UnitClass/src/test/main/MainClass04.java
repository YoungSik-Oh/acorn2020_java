package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mapac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type 을 저장할수 있는 Array type 객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수 cars 에 담아보세요
		List<Car> cars=new ArrayList<>();
		
		// 2. Car 객체 (3개) 를 생성해서 List 객체에 저장해보세요
		cars.add(new Car("g"));
		cars.add(new Car("gg"));
		cars.add(new Car("ggg"));
		// 3. 반복문 for 문을 이용해서 list 객체에 저장된 모든 Car 객체의 drive() 메소드를 
		//순서대로 호출해보세요
		for(int i=0; i<cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();
			cars.get(i).drive();
					
		}
		System.out.println("확장 for 문");
		for(Car tmp:cars) {
			
			tmp.drive();
		}
	}}

