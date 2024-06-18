package com.alfaris.esb.dto;

public class PlanInfo {
	
	private String planCd;
	
	private String planCd2;
	
	private String calYr;
	
	private String taxYr;

	public String getPlanCd() {
		return planCd;
	}

	public void setPlanCd(String planCd) {
		this.planCd = planCd;
	}

	public String getPlanCd2() {
		return planCd2;
	}

	public void setPlanCd2(String planCd2) {
		this.planCd2 = planCd2;
	}

	public String getCalYr() {
		return calYr;
	}

	public void setCalYr(String calYr) {
		this.calYr = calYr;
	}

	public String getTaxYr() {
		return taxYr;
	}

	public void setTaxYr(String taxYr) {
		this.taxYr = taxYr;
	}

	public PlanInfo(String planCd, String planCd2, String calYr, String taxYr) {
		super();
		this.planCd = planCd;
		this.planCd2 = planCd2;
		this.calYr = calYr;
		this.taxYr = taxYr;
	}

	public PlanInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlanInfo [planCd=" + planCd + ", planCd2=" + planCd2 + ", calYr=" + calYr + ", taxYr=" + taxYr + "]";
	}
	

}
