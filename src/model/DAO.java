package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	// 회원정보 삭제
	public int U_DEL(DTO dto) { // U_ID, U_PW

		int cnt = 0;
		dbOpen();

		String sql = "DELETE FROM TB_USER WHERE U_ID = ? AND U_PW = ?";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getU_ID());
			psmt.setString(2, dto.getU_PW());

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("sql 실행 에러");
			e.printStackTrace();
		} finally {
			dbClose();
		}
		return cnt;

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
