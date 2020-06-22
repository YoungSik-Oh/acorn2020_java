package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 * 	2, 해골 , 행신동 이라는 정보를 
		 *  member table 에 추가
		 */
		int num=2;
		String name="해골";
		String addr= " 행신동";
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
		PreparedStatement pstmt=null;
		try {
			String sql="insert into member"
					+ " (num, name, addr)"
					+ " values (?, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			System.out.println("회원정보 저장");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				// 안정하기 마무리 작업하기
				if(pstmt!=null)pstmt.close();
			}catch(Exception e) {};
		}
			
	}

}
