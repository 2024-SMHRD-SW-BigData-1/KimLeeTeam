package View;

import java.util.Scanner;

import Controller.Controller;
import View.DTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("명대사 듣고 영화, 드라마 제목 맞추기");
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]아이디찾기 [4]비밀번호찾기 [5]회원탈퇴 [6]게임나가기");
			int select = sc.nextInt();
			if(select == 1) {
				//회원가입-F_JOIN()
				
			}else if(select == 2) {
				//로그인-F_LOGIN()
				while(true) {
					System.out.print("ID를 입력하세요 : ");
					String U_ID = sc.next();
					System.out.print("PW를 입력하세요 : ");
					String U_PW = sc.next();
					
					DTO dto = new DTO(U_ID, U_PW);
					
					Controller con = new Controller();
					con.F_LOGIN(dto);
					
					
				}
			}else if(select == 3) {
				//아이디찾기-F_FIND_ID()
				
			}else if(select == 4) {
				//비밀번호찾기-F_FIND_PW()
				
			}else if(select == 5) {
				//회원탈퇴
			}else {
				//게임나가기
				System.out.println("게임 종료");
			}
		
		}

	}

}