package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import controller.Controller;
import model.DTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("명대사 듣고 영화, 드라마 제목 맞추기");
		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]아이디찾기 [4]비밀번호찾기 [5]회원탈퇴 [6]게임나가기 ");
			int select = sc.nextInt();
			if (select == 1) {
				// 회원가입
			} else if (select == 2) {
				// 로그인
			} else if (select == 3) {
				// 아이디찾기
			} else if (select == 4) {
				// 비밀번호찾기
			} else if (select == 5) {

				// 회원탈퇴 - U_DEL()
				System.out.println("회원 탈퇴 진행");

				System.out.print("아이디 입력 : ");
				String U_ID = sc.next();
				System.out.print("비밀번호 입력 : ");
				String U_PW = sc.next();

				DTO dto = new DTO(U_ID, U_PW);

				Controller con = new Controller();
				con.U_DEL(dto);

			} else {
				// 게임나가기
				System.out.println("게임 종료");
				break;
			}

		}

	}

}
