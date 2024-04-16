package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("명대사 듣고 영화, 드라마 제목 맞추기");
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]아이디찾기 [4]비밀번호찾기 [5]회원탈퇴 [6]게임나가기");
			int select = sc.nextInt();
			if(select == 1) {
				//회원가입
			}else if(select == 2) {
				//로그인
			}else if(select == 3) {
				//아이디찾기
			}else if(select == 4) {
				//비밀번호찾기
			}else if(select == 5) {
				//회원탈퇴
			}else {
				//게임나가기
				System.out.println("게임 종료");
			}
		
		}

	}

}
	
