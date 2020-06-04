package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass03 {

	public static void main(String[] args) {
		// HandPhone 객체를 생성해서 HandPhone type 지역변수 p1 에 담기
		HandPhone p1 = new HandPhone();
		// 인터넷을 해야한다. 즉 SmartPhone type 객체가 필요하다
		// p1  안에 있는 값을 이용해서 인터넷을 할 수 있을까 ?
		SmartPhone p2= (SmartPhone) p1; // 실행시에 ClassCastException 발생 //  String str=(String) p1 과 같은 경우 이다.. 잘못된 캐스팅 
		// ㄹㅇ 신나네 ㄱㄱ
		p2.doInternet(); // 캐스팅이 잘못되어서 실행하면 오류가 난다.
		

	}

}
