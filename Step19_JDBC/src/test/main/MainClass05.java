package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  2번 회원의
		 *  이름을 신현호
		 *  주소를 상도동
		 *  으로 수정 하는 코드를 작성해보세요
		 */
		int num=2;
		String name="신현호";
		String addr="상도동";
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
			String sql= "update member"
					+ " set name=?, addr=?"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			System.out.println("수정완료");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				// 안전하게 마무리 작업하기
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {};
		}
	}

}
