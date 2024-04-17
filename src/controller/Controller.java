package controller;

import model.DAO;
import model.DTO;

public class Controller {
	
	public void U_DEL(DTO dto) {
	      
	      DAO dao = new DAO();
	      
	      int cnt = dao.U_DEL(dto);
	      if(cnt>0) {
	         System.out.println("회원 삭제 성공");
	      }else {
	         System.out.println("회원 삭제 실패");
	      }
	   }
	   

}
