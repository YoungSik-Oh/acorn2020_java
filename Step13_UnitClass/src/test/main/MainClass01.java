package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		//String type 을 저장할수 있는 index 로 관리되는 목록(List) 객체 
		ArrayList<String> names=new ArrayList<String>(); //<> generic type 안에는 정의하고싶은 type을 넣는다 // ArrayList type에는 int 사용불가 Integer 저장가능 ... 
																											// 기본 data type 은 불가.. 참조 데이터 타입으로 해야함
		// String type 의 참조값 저장하기
		names.add("해골");
		names.add("메롱");
		names.add("원숭이");
		System.out.println(names);
		//배열의 방의 크기 얻어오기
		int a=names.size();
		//각각의 방에 저장 된 값 불러오기

		String b=names.get(0);
		String c=names.get(1);
		String d=names.get(2);
		
		// 특정 방의 값 수정(덮어쓰기)
		names.set(2, "바보"); // 2번방 수정
		
		// 특정 인덱스  값 삭제 (방 자체를 제거하기
		names.remove(1);// 1번방 삭제
		
		// 모든 방 깨끗이 삭제
		names.clear();
		
		
	}

}
