package com.du.asl.domain;

public class AslVO2 {
	private int EFC_YY;
	private String QF_GRADE_NM;
	private int PRTC_TOT_GRDE;
	private int ORST_TOT_GRDE;
	private String PRTC_PAS_DIV_NM;
	private String FNL_PAS_YN;
	private String QF_ITM_NM;
	private String ZON_NM;
	private Float avg1;	//실기 총 평균합격점
	private Float avg2;	//실기 구술 평균합격점
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
	public int getPRTC_TOT_GRDE() {
		return PRTC_TOT_GRDE;
	}
	public void setPRTC_TOT_GRDE(int pRTC_TOT_GRDE) {
		PRTC_TOT_GRDE = pRTC_TOT_GRDE;
	}
	public int getORST_TOT_GRDE() {
		return ORST_TOT_GRDE;
	}
	public void setORST_TOT_GRDE(int oRST_TOT_GRDE) {
		ORST_TOT_GRDE = oRST_TOT_GRDE;
	}
	public String getPRTC_PAS_DIV_NM() {
		return PRTC_PAS_DIV_NM;
	}
	public void setPRTC_PAS_DIV_NM(String pRTC_PAS_DIV_NM) {
		PRTC_PAS_DIV_NM = pRTC_PAS_DIV_NM;
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
	public Float getAvg1() {
		return avg1;
	}
	public void setAvg1(Float avg1) {
		this.avg1 = avg1;
	}
	public Float getAvg2() {
		return avg2;
	}
	public void setAvg2(Float avg2) {
		this.avg2 = avg2;
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
		return "AslVO2 [EFC_YY=" + EFC_YY + ", QF_GRADE_NM=" + QF_GRADE_NM + ", PRTC_TOT_GRDE=" + PRTC_TOT_GRDE
				+ ", ORST_TOT_GRDE=" + ORST_TOT_GRDE + ", PRTC_PAS_DIV_NM=" + PRTC_PAS_DIV_NM + ", FNL_PAS_YN="
				+ FNL_PAS_YN + ", QF_ITM_NM=" + QF_ITM_NM + ", ZON_NM=" + ZON_NM + ", avg1=" + avg1 + ", avg2=" + avg2
				+ ", count=" + count + ", pass=" + pass + "]";
	}
}
