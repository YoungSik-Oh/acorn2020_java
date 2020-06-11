package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		Map<String,Object> dic =new HashMap<>();
		dic.put("house","집");
		dic.put("phone","전화기");
		dic.put("car","자동차");
		dic.put("pencil","연필");
		dic.put("eraser","지우개");
		/*
		 * 	검색할 단어를 입력하세요 : house
		 * 	
		 * 	house의 뜻은 집입니다.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 단어를 입력하세요 :");
		String msg=scan.nextLine();
		
		String dic1=(String) dic.get(msg);
		
//		boolean is=dic.containsKey(msg);
//		if(is==true) {
//			System.out.println(msg+" 는 "+ dic1 +"입니다.");
//		}else {
//			System.out.println(msg+"에 대한 값이 없습니다.");
//		}
		if(msg==null) {
			System.out.println(msg+"에 대한 값이 없습니다.");
		}else {
			System.out.println(msg+" 의 뜻은 " +dic1+" 입니다");
		}
		
		
	}

}
