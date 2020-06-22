package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass08 {
	
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name="주뎅이";
		String addr="봉천동";
		List<MemberDto> list=new ArrayList<>();
		// 아랴ㅐ의 insert() 메소드를 호출해서 회원 한명의 정보가 추가 되도록 해
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		insert(dto);
	}
	// MemberDto 객체를 인자로 전달 받아서 회원정보를 DB에 저장하는 메소드
	public static void insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		try {
		conn = new DBConnect().getConn();
		String sql=" insert into member"
				+ " (num, name, addr)"
				+ " values( member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.executeUpdate();
			System.out.println("회원정보 추가완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
//				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		
	}
}
