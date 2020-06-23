package test.main;

import java.util.List;
import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 *  Scanner 객체를 이용해서 검색 할 회원 번호는 입력 받고
		 *  입력 받은 번호에 해당되는 정보를 얻어와서
		 *  아래와 같은 형식으로 출력
		 *  
		 *  	만일 1을 입력한 경우
		 *  
		 *  	1 | 김구라 | 노량진
		 *  
		 *   만일 입력한 번호가 없는 경우
		 *   
		 *   9번 회원은 존재 하지 않습니다.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("회원 번호 입력");
		int inputNum=scan.nextInt();
		
		
		//MemberDao 객체를 이용해서 입력 한 회원 정보를 MemberDto 에 담아온다.
		MemberDao dao=MemberDao.getInstance();
		// 입력한 번호에 해당되는 회정 정보가 없으면 null 이 return 된다.
		MemberDto dto=dao.getData(inputNum);
			if(dto == null) {
				System.out.println(inputNum+" 번 회원은 존재 하지 않음");
			}else { 
				System.out.println(dto.getNum()+ " | " + dto.getName() + " | " + dto.getAddr());
			}
		
		
	}

}
