package com.alfaris.esb.dto;

public class AchInfo {
	
	private String companyName;
	
	private int entryDt;
	
	private String entryDesc;
	
	private String individualId;
	
	private String chkNum;
	
	private int backDt;

	private int backDtDays;
	
	private int backDtHolidays;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getEntryDt() {
		return entryDt;
	}

	public void setEntryDt(int entryDt) {
		this.entryDt = entryDt;
	}

	public String getEntryDesc() {
		return entryDesc;
	}

	public void setEntryDesc(String entryDesc) {
		this.entryDesc = entryDesc;
	}

	public String getIndividualId() {
		return individualId;
	}

	public void setIndividualId(String individualId) {
		this.individualId = individualId;
	}

	public String getChkNum() {
		return chkNum;
	}

	public void setChkNum(String chkNum) {
		this.chkNum = chkNum;
	}

	public int getBackDt() {
		return backDt;
	}

	public void setBackDt(int backDt) {
		this.backDt = backDt;
	}

	public int getBackDtDays() {
		return backDtDays;
	}

	public void setBackDtDays(int backDtDays) {
		this.backDtDays = backDtDays;
	}

	public int getBackDtHolidays() {
		return backDtHolidays;
	}

	public void setBackDtHolidays(int backDtHolidays) {
		this.backDtHolidays = backDtHolidays;
	}

	public AchInfo(String companyName, int entryDt, String entryDesc, String individualId, String chkNum, int backDt,
			int backDtDays, int backDtHolidays) {
		super();
		this.companyName = companyName;
		this.entryDt = entryDt;
		this.entryDesc = entryDesc;
		this.individualId = individualId;
		this.chkNum = chkNum;
		this.backDt = backDt;
		this.backDtDays = backDtDays;
		this.backDtHolidays = backDtHolidays;
	}

	public AchInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AchInfo [companyName=" + companyName + ", entryDt=" + entryDt + ", entryDesc=" + entryDesc
				+ ", individualId=" + individualId + ", chkNum=" + chkNum + ", backDt=" + backDt + ", backDtDays="
				+ backDtDays + ", backDtHolidays=" + backDtHolidays + "]";
	}
	
	


}


