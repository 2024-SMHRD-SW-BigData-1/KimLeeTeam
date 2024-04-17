package Model;

public class DTO {

	private String U_ID;
	private String U_PW;
	private String U_NM;
	private int U_SC;
	private int U_PH;

	public DTO(String U_ID, String U_PW, String U_NM, int U_SC, int U_PH) {
		this.U_NM = U_NM;
		this.U_ID = U_ID;
		this.U_PW = U_PW;
		this.U_PH = U_PH;
		this.U_SC = U_SC;
	}
	
	// ID 찾기 
	public DTO(String U_NM, int U_PH) {
		this.U_NM = U_NM;
		this.U_PH = U_PH;
	}
	
	// PW 찾기
	public DTO(String U_ID, String U_NM) {
		this.U_ID = U_ID;
		this.U_NM = U_NM;
	}
	
	// getter, setter
	public String getU_NM() {
		return U_NM;
	}

	public void setU_NM(String U_NM) {
		this.U_NM = U_NM;
	}

	public String getU_ID() {
		return U_ID;
	}

	public void setU_ID(String U_ID) {
		this.U_ID = U_ID;
	}

	public String getU_PW() {
		return U_PW;
	}

	public void setU_PW(String U_PW) {
		this.U_PW = U_PW;
	}

	public int getU_PH() {
		return U_PH;
	}

	public void setU_PH(int U_PH) {
		this.U_PH = U_PH;
	}
	
	public int getU_SC() {
		return U_SC;
	}

	public void setU_SC(int U_SC) {
		this.U_SC = U_SC;
	}
	
}
