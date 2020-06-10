package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mapac.Memberinfo;

public class MainClass06 {
	public static void main(String[] args) {
		//default 생성자를 호출해서 Memberinfo 객체 생성
		Memberinfo m1=new Memberinfo();
		// 필드에 값을 각각 대입하기
		m1.num=1;
		m1.name="김구라";
		m1.addr="노량진";
		
		// int , String, String type 을 인자로 전달하는 생성자
		Memberinfo m2=new Memberinfo(2,"오영식","행신동");
		
		List<Memberinfo> m3 = new ArrayList<>();
		
	}

}
