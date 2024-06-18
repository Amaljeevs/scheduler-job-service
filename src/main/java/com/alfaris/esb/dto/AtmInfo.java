package com.alfaris.esb.dto;

public class AtmInfo {
	
	private String atmTerm;
	
	private String atmDesc;
	
	private int atmDt;
	
	private int backDt;
	
	private int backDtDays;
	
	private int backDtHolidays;
	
	private String recurringInd;

	public String getAtmTerm() {
		return atmTerm;
	}

	public void setAtmTerm(String atmTerm) {
		this.atmTerm = atmTerm;
	}

	public String getAtmDesc() {
		return atmDesc;
	}

	public void setAtmDesc(String atmDesc) {
		this.atmDesc = atmDesc;
	}

	public int getAtmDt() {
		return atmDt;
	}

	public void setAtmDt(int atmDt) {
		this.atmDt = atmDt;
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

	public String getRecurringInd() {
		return recurringInd;
	}

	public void setRecurringInd(String recurringInd) {
		this.recurringInd = recurringInd;
	}

	public AtmInfo(String atmTerm, String atmDesc, int atmDt, int backDt, int backDtDays, int backDtHolidays,
			String recurringInd) {
		super();
		this.atmTerm = atmTerm;
		this.atmDesc = atmDesc;
		this.atmDt = atmDt;
		this.backDt = backDt;
		this.backDtDays = backDtDays;
		this.backDtHolidays = backDtHolidays;
		this.recurringInd = recurringInd;
	}

	public AtmInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AtmInfo [atmTerm=" + atmTerm + ", atmDesc=" + atmDesc + ", atmDt=" + atmDt + ", backDt=" + backDt
				+ ", backDtDays=" + backDtDays + ", backDtHolidays=" + backDtHolidays + ", recurringInd=" + recurringInd
				+ "]";
	}
	
	
	

}

