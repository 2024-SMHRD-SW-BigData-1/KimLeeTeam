package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DAO {
     Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	
	public int F_JOIN (DTO dto) {
		dbOpen();
		int cnt = 0;
		try {
			String sql = "insert into TB_USER values(?, ?, ?, 0 , ?)";
			psmt = conn.prepareStatement(sql);
			
	         psmt.setString(1, dto.getU_ID());
	         psmt.setString(2, dto.getU_PW());
	         psmt.setString(3, dto.getU_NM());
	         psmt.setInt(4, dto.getU_PH());
			
	        cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
               System.out.println("sql 실행 애러");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		  return cnt;
	}
	
	public DTO F_LOGIN(DTO dto) { // id, pw

		dbOpen();
		
		DTO	loginDto = null;
		
		try {
			
			String sql = "select * from tb_user where u_id=? and u_pw=? ";
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getU_ID());
			psmt.setString(2, dto.getU_PW());
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String u_id = rs.getString(1);
				String u_pw = rs.getString(2);
				String u_nm = rs.getString(3);
				int u_sc = rs.getInt(4);
				int u_ph = rs.getInt(5);
				
				loginDto = new DTO(u_id, u_pw, u_nm,u_sc,u_ph);
				
			}
			
		} catch (Exception e) {
			
		}finally {
			dbClose();
		}
	     
	    	  
	    	  return loginDto;
	      
		
		
	}
  
  
	// 데이터베이스와의 동적로딩/권한확인
	public void dbOpen() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String id = "campus_24SW_BIG_p1_6";
			String pw = "smhrd6";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";

			conn = DriverManager.getConnection(url, id, pw);
		} catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("권한 확인 실패");
			e.printStackTrace();
		}

	}

	// 데이터베이스 자원 반납
	public void dbClose() {

		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}





	

}
