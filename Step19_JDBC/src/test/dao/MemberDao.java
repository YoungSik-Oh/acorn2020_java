package test.dao;
	/*
	 * 	DAO ( Data Access Object) 의 약자
	 *	- 만드는 방법
	 *	1. 외부에서 객체 생성하지 못하도록 생성자의 접근 지정자를 private으로 지정
	 * 	2. 자신의 참조값을 저장할수 있는 필드를 private 으로 선언
	 * 	3. 자신의 참조값을 오직 하나만 생성해서 리턴해주는 static 메소드 만들기
	 * 	4. 나머지 기능(select, insert, update, delete) 들은 non static 으로 만들기
	 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	// 자신의 참조값을 저장할 private 필드
	private static MemberDao dao; // 2. ( ? 싱글톤 패턴 ? )
	
	// 외부에서 객체 생성하지 못하도록 한다.
	private MemberDao() {} // 1.
	
	// 참조값을 리턴해주는 메소드
	public static MemberDao getInstance() { // 3.
		if(dao==null) {// 최초 호출되면 null 이므로
			dao=new MemberDao(); // 객체를 생성해서 static 필드에 담는다.
		}
		return dao;
	}
	// 회원 한명의 정보를 리턴해주는 메소드
	public MemberDto getData(int num) {
		MemberDto dto=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql="select num,name,addr"
					+" from member "
					+" where num=? ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new MemberDto();
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
//				System.out.println(dto.getName()+dto.getAddr());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return dto;
	}
	// 회원 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){
		List<MemberDto> list=new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql="select num,name,addr"
					+" from member "
					+" order by num asc ";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String name=rs.getString("name");
				String addr=rs.getString("addr");
				
				MemberDto dto=new MemberDto();
				dto.setNum(num); 
				dto.setName(name);
				dto.setAddr(addr);
				// MemberDto 객체를 List에 누적 시킨다.
				list.add(dto);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//객체를 사용했던 순서 역순으로 닫아준다.
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return list;
		
	}
	// 회원 한명의 정보를 DB에서 삭제하는 메소드
	public boolean delete (int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from member"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			flag=pstmt.executeUpdate();
			System.out.println("회원의 정보를 삭제했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(flag>0) {
				return true;
			}else {
				return false;
			}
		}
	}
	// 회원 정보를 DB에 저장하는 메소드 ( 작업의 성공여부가 boolean 으로 return 된다_)
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
		conn = new DBConnect().getConn();
		String sql=" insert into member"
				+ " (num, name, addr)"
				+ " values( member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			// sql 문을 수행하고 변화된 row 의 갯수를 return 받는다 (1)
			flag=pstmt.executeUpdate();
//			pstmt.executeUpdate();
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
		// public boolean 성공적으로 작업을 끝냈는지 확인방법 
		if(flag>0) { // 만약 flag가 0보다 크면
			return true; // 작업 성공이라는 의미에서 true 값을 return 한다.
		}else {
			return false; // 작업 실패라는 의미에서 false 값을 return 한다. //
		}
	}
	// 회원 정보를 DB에서 수정하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int flag=0;
		try {
			conn=new DBConnect().getConn();
			String sql="update member"
					+ " set name=? , addr=?"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());
			flag=pstmt.executeUpdate();
			System.out.println("수정완료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
		}catch(Exception e) {}
	}// finally;
		if(flag>0) {
			return true;
		}else {
			return false;
		}
	}
}
