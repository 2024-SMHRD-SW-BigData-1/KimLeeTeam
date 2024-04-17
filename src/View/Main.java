package View;

import java.util.Scanner;

import Controller.Controller;
import Model.DTO;

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
				System.out.println("===== 아이디 찾기 =====");
				
				System.out.print("이름 입력 >> ");
				String U_NM = sc.next();
				System.out.print("폰번호 뒤 4자리 입력 >> ");
				int U_PH = sc.nextInt();
				
				DTO dto = new DTO(U_NM, U_PH);
				Controller con = new Controller();
				con.F_FIND_ID(dto);
				
			}else if(select == 4) {
				//비밀번호찾기
				System.out.println("===== 비밀번호 찾기 =====");
				
				System.out.print("아이디 입력 >> ");
				String U_ID = sc.next();
				System.out.print("이름 입력 >> ");
				String U_NM = sc.next();
				
				DTO dto = new DTO(U_ID, U_NM);
				Controller con = new Controller();
				con.F_FIND_PW(dto);
				
			}else if(select == 5) {
				//회원탈퇴
			}else {
				//게임나가기
				System.out.println("게임 종료");
				break;
			}
			
		}

	}

}
