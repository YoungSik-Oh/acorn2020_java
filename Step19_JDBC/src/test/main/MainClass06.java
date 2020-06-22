package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  3번 회원을 삭제하는 code 를 작성
		 */
		int num=3;
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
		PreparedStatement pstmt = null;
		try {
			String sql="delete from member"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("삭제완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 안전하게 마무리 작업하기
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {};
		}
	}
}

