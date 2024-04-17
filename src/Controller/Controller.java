package Controller;

import java.util.ArrayList;

import Model.DAO;
import Model.DTO;
import View.Main;
import javazoom.jl.player.MP3Player;

public class Controller {

	// 회원가입
	public void F_JOIN(DTO dto) {
		DAO dao = new DAO();
		int cnt = dao.F_JOIN(dto);
		if (cnt > 0) {
			System.out.println("등록 성공!");
		} else {
			System.out.println("등록 실패!");
		}
	}

	// 로그인
	public ArrayList<DTO> F_LOGIN(DTO dto) {
		DAO dao = new DAO();
		ArrayList<DTO> LOGIN_list = dao.F_LOGIN(dto);
		boolean loginSuccess = false;
//      System.out.println(dto.getU_PW());

		if (LOGIN_list.size() != 0) {
			if (LOGIN_list.get(0).getU_ID().equals(dto.getU_ID())
					&& LOGIN_list.get(0).getU_PW().equals(dto.getU_PW())) {
				System.out.println("로그인 성공!");

			}
			return LOGIN_list;
		} else {
			System.out.println("로그인 실패!");
			return null;
		}

	}

	// 아이디 찾기
	public void F_FIND_ID(DTO dto) {

		DAO dao = new DAO();
		String result = dao.F_FIND_ID(dto);
		System.out.println(result);
	}

	// 비밀번호 찾기
	public void F_FIND_PW(DTO dto) {

		DAO dao = new DAO();
		String result = dao.F_FIND_PW(dto);
		System.out.println(result);
	}

	// 회원탈퇴
	public void U_DEL(DTO dto) {

		DAO dao = new DAO();

		int cnt = dao.U_DEL(dto);
		if (cnt > 0) {
			System.out.println("회원 삭제 성공");
		} else {
			System.out.println("회원 삭제 실패");
		}
	}

	/* ============================= 게임 시작 후 ================================= */

//	// 문제이름_가져오기
//	public void QUIZ_NAME(DTO dto) {
//		DAO dao = new DAO();
//		ArrayList<DTO> QUIZ_NAME_RE = dao.QUIZ_LIST();
//	}

//	// 문제_재생하기
//	public void QUIZ_PLAY(DTO dto) {
//		DAO dao = new DAO();
//		ArrayList<DTO> QUIZ_URL_RE = dao.QUIZ_LIST();
//		String URL = QUIZ_URL_RE.get(1).getQ_URL();
//
//	}

	// 게임 리스트
//	public void QUIZ_LIST(DTO dtoA) {
//		DAO dao = new DAO();
//		
//		
//	}
	
	// 소리 출력
	public void QUIZ_PLAY(DTO dtoA) {
		DAO dao = new DAO();
		ArrayList<DTO> QUIZ_URL_RE = dao.QUIZ_LIST();
		
		String url = QUIZ_URL_RE.get(dtoA.getQ_INDEX()).getQ_URL();
		
		MP3Player mp3;
		
	}


	// 정답확인, 점수누적
	public void QUIZ_SUM(DTO dtoA) {
		DAO dao = new DAO();
		int heart = dtoA.getHeart();
		int sum = dtoA.getSum();
		
		ArrayList<DTO> QUIZ_URL_RE = dao.QUIZ_LIST();
		
		String name_result = QUIZ_URL_RE.get(dtoA.getQ_INDEX()).getQ_NM();
//		System.out.println(name_result);
		
		int score = QUIZ_URL_RE.get(dtoA.getQ_INDEX()).getQ_SC();
//		System.out.println(score);

		// 메인에서 가져온 입력값이랑 비교
		if (name_result.equals(dtoA.getAnswer())) {
			System.out.println("정답입니다");
			sum += score;
//			System.out.println("점수 : " + sum+"점");

		} else {
			heart--;
			System.out.println("틀렸습니다");

			if (heart == 0) {
				System.out.println("하트소진으로 게임 종료");
				System.out.println("점수 : " + sum);
				System.exit(0);
			}
		}

	}
	
	public ArrayList<Integer> sum_heart_re(DTO dtoA) {
		DAO dao = new DAO();
		int heart = dtoA.getHeart();
		int sum = dtoA.getSum();
		
		ArrayList<DTO> QUIZ_URL_RE = dao.QUIZ_LIST();
		
		String name_result = QUIZ_URL_RE.get(dtoA.getQ_INDEX()).getQ_NM();
		
		int score = QUIZ_URL_RE.get(dtoA.getQ_INDEX()).getQ_SC();

		// 메인에서 가져온 입력값이랑 비교
		if (name_result.equals(dtoA.getAnswer())) {
			sum += score;
		} else {
			heart--;

			if (heart == 0) {
				System.exit(0);
			}
		
		}		
		ArrayList<Integer> clear = new ArrayList<>();
		clear.add(0, sum);
		clear.add(1, heart);
		
		return clear;

	}

}