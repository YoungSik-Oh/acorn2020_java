package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.dto.MemoDto;
import test.util.DBConnect;

public class MemoDao {
	// 싱글톤 패턴
	private static MemoDao dao;
	
	private MemoDao() {}
	
	public static MemoDao getInstance() {
		if(dao==null) {
			dao=new MemoDao();
		}
		return dao;
	}
	// content 1개의 정보를 리턴해주는 메소드
	public MemoDto getData(int num) {
		MemoDto dto = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs= null;
		try {
			conn=new DBConnect().getConn();
			String sql="select num,content,regdate"
				+ " from memo"
				+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dto=new MemoDto();
				dto.setContent(rs.getString("content"));
				dto.setRegdate(rs.getString("regdate"));
//				System.out.println(dto.getNum() + " | " + dto.getContent() + " | " + dto.getRegdate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return dto;
	}
	
	// list return method 
	public List<MemoDto> getList(){
		List<MemoDto> list=new ArrayList<MemoDto>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		conn=new DBConnect().getConn();
		String sql="select num, content,regdate"
				+ " from memo"
				+ " order by num asc";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int num=rs.getInt("num");
				String content=rs.getString("content");
				String regdate=rs.getString("regdate");
				
				MemoDto dto=new MemoDto();
				dto.setNum(num);
				dto.setContent(content);
				dto.setRegdate(regdate);
				list.add(dto);
//				System.out.println(dto.getNum() + dto.getContent() + dto.getRegdate());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		return list;
	}
	// 추가
	public void insert(MemoDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
		String sql="insert into memo"
				+ " values(memo_seq.nextval, ?, sysdate)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			pstmt.executeUpdate();
//			System.out.println("됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {}
		}
	}
	// 삭제
	public void delete(int num) {
		PreparedStatement pstmt=null;
		Connection conn=null;
		try {
		conn=new DBConnect().getConn();
		String sql="delete from memo"
				+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			System.out.println("회원의 정보를 삭제했습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e2) {}
		}
	}
	// 수정
	public void update(MemoDto dto) {
		PreparedStatement pstmt=null;
		Connection conn=null;
		try {
			conn=new DBConnect().getConn();
		String sql="update memo"
				+ " set content=?, sysdate"
				+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			pstmt.executeUpdate();
			System.out.println("수정완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
