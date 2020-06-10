package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mapac.Info;

public class MainClass05 {
	public static void main(String[] args) {
		// Info 클래스로 객체를 생성해서 참조값을 info1이라는 지역 변수에 담기
		Info info1=new Info();
		// 필드는 public  으로 선언 되어있기 때문에 직접 접근해서 대입 연산자로 값을 대입 할수있음
		info1.num=1;
		info1.name="오영식";
		info1.addr="용인";
		
		Info info2=new Info();
		info2.num=2;
		info2.name="행골";
		info2.addr="행신";
		
		// 위의 info type 객체의 참조값을 List 객체에 순서대로 담아보시오
		List<Info> list=new ArrayList<>();
		list.add(info1);
		list.add(info2);
		/*
		 * 반복문 for를 이용해서 list 객체에 담긴 정보를 아래와 같은 형식으로 출력해보세요.
		 * 	1 | 김구라 | 노량진
		 *  2 | 해공| 행신
		 */
		for(int i=0; i < list.size(); i++) {
				Info l1=list.get(i);
			System.out.println(l1.num + " | " + l1.name + " | " + l1.addr);
		}
		
	}

}
