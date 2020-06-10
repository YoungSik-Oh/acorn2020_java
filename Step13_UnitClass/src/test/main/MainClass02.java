package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장 할 수 있는 가변 배열 객체 생성 // list는 가변 배열이라고 함
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(10);
		nums.add(100);
		nums.add(500);
		nums.add(1000);
		// 배열의 크기 얻어오기
		int size=nums.size();
		// 특정 인덱스 아이템 얻어오기 (참조)
		int num1=nums.get(0);
		Integer num2=nums.get(1);
		int num3=nums.get(2);
		// 인덱스 수정
		nums.set(1,40);
		//특정 인덱스 삭제 // 그럼 뒤에있는게 앞으로 땡겨온다 
		nums.remove(1);
		// 배열 비우기
		nums.clear();
		
	}

}
