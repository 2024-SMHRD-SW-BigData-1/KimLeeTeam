package Controller;

import Model.DAO;
import Model.DTO;

public class Controller {

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
	
	
}
