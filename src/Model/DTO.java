package Model;

public class DTO {

   private String U_ID;
   private String U_PW;
   private String U_NM;
   private int U_SC;
   private int U_PH;

   public DTO(String U_ID, String U_PW, String U_NM,int U_SC, int U_PH) {
      this.U_ID = U_ID;
      this.U_PW = U_PW;
      this.U_NM = U_NM;
      this.U_SC = U_SC;
      this.U_PH = U_PH;

   }

   // 회원정보 삭제 목적, 로그인도 가능
   public DTO(String U_ID, String U_PW) {
      this.U_ID = U_ID;
      this.U_PW = U_PW;
   }

   public DTO(String U_ID, int U_SC) {
	      this.U_ID = U_ID;
	      this.U_SC = U_SC;
	   }
   
   // getter, setter
   public String getU_NM() {
      return U_NM;
   }

   public void setU_NM(String u_NM) {
      this.U_NM = u_NM;
   }

   public String getU_ID() {
      return U_ID;
   }

   public void setU_ID(String u_ID) {
      this.U_ID = u_ID;
   }

   public String getU_PW() {
      return U_PW;
   }

   public void setU_PW(String u_PW) {
      this.U_PW = u_PW;
   }

   public int getU_PH() {
      return U_PH;
   }

   public void setU_PH(int u_PH) {
      this.U_PH = u_PH;
   }

   public int getU_SC() {
      return U_SC;
   }
   
   public void setU_SC(int u_SC) {
      U_SC = u_SC;
   }
}
