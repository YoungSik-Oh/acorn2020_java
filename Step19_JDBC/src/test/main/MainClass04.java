package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	2번 회원의 이름을 스타벅으로 수정하고자 한다.
		 *     
		 */
		String name="스타벅스";
		int num=2;
		Connection conn=null;
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 접속할 DB 의 접속 @아이피 주소 :port  번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			// 객체 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url,"scott","tiger");
			// 예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
			System.out.println("Oracle DB 접속 성공");
		}catch(Exception e){
			e.printStackTrace();
		}
		// 필요한 객체의 참조값을 담을 빈 지역 변수 미리 만들기
		PreparedStatement pstmt=null;
	
		try {
			//실행할 sql 문
			String sql="update member"
					 + " set name=?"
					 + " where num=?";
			// PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			// ? 에 값을 바인딩 해서 미완성의 sql 문을 완성 시킨다.
			pstmt.setString(1, name);
			pstmt.setInt(2, num);
			// 실제로 수정하기
			pstmt.executeUpdate();
			System.out.println("정보 수정완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 안정하기 마무리 작업하기
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {};
		}
	}

}
