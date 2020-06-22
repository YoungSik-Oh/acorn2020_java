package test.main;

import java.sql.Connection;
import java.sql.DriverManager; // 클레스 /static / getConnection → PreparedStatement 
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * 	JDBC ( Java DataBase Connectivity )
 *  
 *  DataBase 에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 *  
 *   oracle 에 연결하기 위해서는 드라이버 클래스가들어있는 ojdbc6.jar 파일을 
 *   사용할수있도록 설정해야함
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		//DB 연결객체를 담을 진역변수 만들기
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
		//select 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 만들기
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			//실행할 sql 문
			String sql="SELECT num, name, addr FROM member" 
						+ " ORDER BY num ASC";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
			//  resultSet 객체로 받아오기
			rs=pstmt.executeQuery();
	
			while(rs.next()) { // 3번 호출된다.
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				// 출력하기
				System.out.println(num+" | "+ name+" | "+ addr );
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}

}
