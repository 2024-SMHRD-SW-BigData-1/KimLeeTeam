package Controller;

import java.util.ArrayList;

import Model.DAO;
import Model.DTO;

public class Controller {
	
	//로그인
	public void F_LOGIN(DTO dto) {
		DAO dao = new DAO();
		ArrayList<DTO> LOGIN_list = dao.F_LOGIN(dto);
		
		boolean loginSuccess = false;
		for(DTO user : LOGIN_list) {
			if(user.getU_ID().equals(dto.getU_ID()) &&  user.getU_PW().equals(dto.getU_PW())) {
				loginSuccess = true;
				break;
			}
		}
		if(loginSuccess) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}

	}
	
}