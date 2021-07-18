package com.du.asl.domain;

public class AslVO {
	private int EFC_YY;
	private String QF_GRADE_NM;
	private String COUR_NM;
	private String USR_NO;
	private int WRDN_TOT_GRDE;
	private String WRDN_PAS_DIV_NM;
	private String FNL_PAS_YN;
	private String QF_ITM_NM;
	private String ZON_NM;
	private Float avg;	//평균합격점
	private int count;	//응시건수
	private Float pass; //합격률
	
	public int getEFC_YY() {
		return EFC_YY;
	}
	public void setEFC_YY(int eFC_YY) {
		EFC_YY = eFC_YY;
	}
	public String getQF_GRADE_NM() {
		return QF_GRADE_NM;
	}
	public void setQF_GRADE_NM(String qF_GRADE_NM) {
		QF_GRADE_NM = qF_GRADE_NM;
	}
	public String getCOUR_NM() {
		return COUR_NM;
	}
	public void setCOUR_NM(String cOUR_NM) {
		COUR_NM = cOUR_NM;
	}
	public String getUSR_NO() {
		return USR_NO;
	}
	public void setUSR_NO(String uSR_NO) {
		USR_NO = uSR_NO;
	}
	public int getWRDN_TOT_GRDE() {
		return WRDN_TOT_GRDE;
	}
	public void setWRDN_TOT_GRDE(int wRDN_TOT_GRDE) {
		WRDN_TOT_GRDE = wRDN_TOT_GRDE;
	}
	public String getWRDN_PAS_DIV_NM() {
		return WRDN_PAS_DIV_NM;
	}
	public void setWRDN_PAS_DIV_NM(String wRDN_PAS_DIV_NM) {
		WRDN_PAS_DIV_NM = wRDN_PAS_DIV_NM;
	}
	public String getFNL_PAS_YN() {
		return FNL_PAS_YN;
	}
	public void setFNL_PAS_YN(String fNL_PAS_YN) {
		FNL_PAS_YN = fNL_PAS_YN;
	}
	public String getQF_ITM_NM() {
		return QF_ITM_NM;
	}
	public void setQF_ITM_NM(String qF_ITM_NM) {
		QF_ITM_NM = qF_ITM_NM;
	}
	public String getZON_NM() {
		return ZON_NM;
	}
	public void setZON_NM(String zON_NM) {
		ZON_NM = zON_NM;
	}
	public Float getAvg() {
		return avg;
	}
	public void setAvg(Float avg) {
		this.avg = avg;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Float getPass() {
		return pass;
	}
	public void setPass(Float pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "AslVO [EFC_YY=" + EFC_YY + ", QF_GRADE_NM=" + QF_GRADE_NM + ", COUR_NM=" + COUR_NM + ", USR_NO="
				+ USR_NO + ", WRDN_TOT_GRDE=" + WRDN_TOT_GRDE + ", WRDN_PAS_DIV_NM=" + WRDN_PAS_DIV_NM + ", FNL_PAS_YN="
				+ FNL_PAS_YN + ", QF_ITM_NM=" + QF_ITM_NM + ", ZON_NM=" + ZON_NM + ", avg=" + avg + ", count=" + count
				+ ", pass=" + pass + "]";
	}
	
	
}
