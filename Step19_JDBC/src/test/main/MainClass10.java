package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		// 만약 MemberDao 객체의 참조값이 필요하다면?
//		MemberDao dao=new MemberDao(); // Dao에서 private 으로 선언하였기 때문에 직접 객체 생성 불가하다.
		
		// static 메소드를 이용해서 MemberDao 객체의 참조값을 받아올수 있다.
		MemberDao dao=MemberDao.getInstance(); // 한번만 객체를 생성하고 그 이 후에는 필드에 있는 값을 사용한다. ( 참조값이 같음)
		// 새로추가할 회운의 정보라면
		MemberDto dto=new MemberDto();
		dto.setName("시계");
		dto.setAddr("아무거나");
		//MemberDao 객체의 메소드를 활용해서 저장할수있다.
		dao.insert(dto);
		
		MemberDao dao2= MemberDao.getInstance();
		// 수정할 회원의 정보라면
		MemberDto dto2=new MemberDto();
		dao2.update(dto2);
		
		MemberDao dao3= MemberDao.getInstance();
		dao3.getData(2);
		
		
	}

}
