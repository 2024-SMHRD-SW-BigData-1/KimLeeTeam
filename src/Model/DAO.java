package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String result = "";

	// 아이디 찾기
	public String F_FIND_ID(DTO dto) {
		
		dbOpen();
		String sql = "SELECT U_ID FROM TB_USER WHERE U_NM = ? AND U_PH = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getU_NM());
			psmt.setInt(2, dto.getU_PH());
			rs = psmt.executeQuery();
			if(rs.next()) {
				String U_ID = rs.getString("U_ID");
				result = U_ID;
			}
			
		} catch (SQLException e) {
			System.out.println("sql 실행 에러");
			e.printStackTrace();
		}
		
		return result;
	}
	
	// 비밀번호 찾기
	public String F_FIND_PW(DTO dto) {
	
		dbOpen();
		String sql = "SELECT U_PW FROM TB_USER WHERE U_ID = ? AND U_NM = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getU_ID());
			psmt.setString(2, dto.getU_NM());
			rs = psmt.executeQuery();
			if(rs.next()) {
				String U_PW = rs.getString(1);
				result = U_PW;
			}
			
		} catch (SQLException e) {
			System.out.println("sql 실행 에러");
			e.printStackTrace();
		}
		
		return result;
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
