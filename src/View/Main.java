package View;

import java.util.Scanner;

import Controller.Controller;
import Model.DTO;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller con = new Controller();
		DTO dto = null;
		
		
		System.out.println("명대사 듣고 제목 맞히기 게임");
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]아이디 찾기[4]비밀번호 찾기[5]회원탈퇴[6]게임 나가기");
			int select = sc.nextInt();
			if (select == 1) {
				// 회원가입
				System.out.println("==== 회원 등록 ====");
				System.out.print("이름 >> ");
				String U_NM = sc.next();
				System.out.print("ID >> ");
				String U_ID = sc.next();
				System.out.print("PW >> ");
				String U_PW = sc.next();
				System.out.print("휴대폰 번호끝 4자리 >> ");
				int U_PH = sc.nextInt();

				dto = new DTO(U_NM, U_ID, U_PW,0, U_PH);

				con.F_JOIN(dto);
				
				

			} else if (select == 2) {
				// 로그인
				System.out.println("==== 로그인 ====");
				System.out.print("ID >> ");
				String U_ID = sc.next();
				System.out.print("PW >> ");
				String U_PW = sc.next();

			   dto = new DTO(U_ID, U_PW);
				
				dto = con.F_LOGIN(new DTO(U_ID, U_PW));
				
				System.out.println("로그인한 ID : " + dto.getU_ID());
				System.out.println("로그인한 PW : " + dto.getU_PW());
				System.out.println("로그인한 NAME : " + dto.getU_NM());
				System.out.println("로그인한 ID : " + dto.getU_SC());
				System.out.println("로그인한 ID : " + dto.getU_PH());
				
				if(dto.getU_ID() == null) {
                System.out.println("로그인 실패 다시 시도해주세요.");					
				}
				
				
				
				
			} else if (select == 3) {
				// 아이디 찾기

			} else if (select == 4) {
				// 비밀번호 찾기

			} else if (select == 5) {
				// 회원탈퇴

			} else {
				// 게임 나가기
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
