package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mapac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		// default 생성자를 이용해서 객체를 생성한 경우
		MemberDto m1=new MemberDto();
		m1.setNum(1); // 필드가 private 이므로 method를 이용해야한다.
		m1.setName("오영식ㅇ");
		m1.setAddr("용인");
		
		// 인자로 필드에 저장할 생성자를 이용해서 객체를 생성한 경우
		MemberDto m2=new MemberDto(2,"해골","행신동"); 
		MemberDto m3=new MemberDto(3,"바보","멍청이"); 
	
		// 위에서 생성한 객체의 참조값을 List 객체에 담아보세요
		List<MemberDto> lm= new ArrayList<>();
		lm.add(m1);
		lm.add(m2);
		lm.add(m3);
		
		/* for 문을 이용해서 list 객체에 담긴 MemberDto 객체를 순서대로 참조해서
		 * 	아래와 같은 형식으로 출력하시오
		 * 	1 | 오영식 | 용인
		 *  2 | 해골 | 행신동
		 */
		for(MemberDto tmp:lm) {
			String a=tmp.getNum()+ " | " + tmp.getName() + " | " + tmp.getAddr();
			System.out.println(a);
		}
		//참조 테스트
		List<MemberDto> a = lm;
		
		MemberDto b = lm.get(0);
		
		int c=lm.get(0).getNum();
		
		String d = lm.get(0).getName();
		
		String e = lm.get(0).getAddr();
		
		int f = lm.get(2).getName().length();
		
		
	
	}

}
