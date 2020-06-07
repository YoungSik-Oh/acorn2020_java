package test.main;

import test.mypac.Member;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 *  1, 김구라, 노량진
		 *  이라는 int, String, String type 값을 
		 *  객체의 필드에 저장하는 프로그래밍을해 보셈
		 *  단 객체를 생성할 클래스의 이름은 member로 작성
		 */
		
		Member member1= new Member();
		member1.num=1;
		member1.name="아이폰";
		member1.addr="애플";
		member1.added();
		// 2, 해골, 행신동 도 새로운 Member 객체를 생성해서 담아보셈
		Member member2= new Member();
		member2.num=2;
		member2.name="갤럭시";
		member2.addr="삼성";
		member2.added();
		
		//Member 객체의 메소드 호출하기
		member1.added();
		member2.added();

}
}