package Controller;

import Model.DAO;
import Model.DTO;

public class Controller {
	DAO dao = new DAO();

	public void F_JOIN(DTO dto) {
		int cnt = dao.F_JOIN(dto);
		if (cnt > 0) {
			System.out.println("등록 성공!");
		} else {
			System.out.println("등록 실패!");
		}
	}

	public DTO F_LOGIN(DTO dto) { // id, pw

		DTO loginDto = dao.F_LOGIN(dto);
		
			return loginDto;
	
		
	
	
	
	

	}
}
