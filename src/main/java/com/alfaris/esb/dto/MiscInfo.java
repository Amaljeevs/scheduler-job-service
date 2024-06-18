package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class MiscInfo {
	
	private String serialNum;
	
	private String custName;
	
	private BigDecimal transitAmt;
	
	private BigDecimal onUsAmt;
	
	private BigDecimal cashIn;
	
	private BigDecimal cashOut;
	
	private int backDt;
	
	private int backDtDays;
	
	private String backDtChkNum;
	
	private int backDtHolidays;
	
	private String backDtTranDesc;

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public BigDecimal getTransitAmt() {
		return transitAmt;
	}

	public void setTransitAmt(BigDecimal transitAmt) {
		this.transitAmt = transitAmt;
	}

	public BigDecimal getOnUsAmt() {
		return onUsAmt;
	}

	public void setOnUsAmt(BigDecimal onUsAmt) {
		this.onUsAmt = onUsAmt;
	}

	public BigDecimal getCashIn() {
		return cashIn;
	}

	public void setCashIn(BigDecimal cashIn) {
		this.cashIn = cashIn;
	}

	public BigDecimal getCashOut() {
		return cashOut;
	}

	public void setCashOut(BigDecimal cashOut) {
		this.cashOut = cashOut;
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

	public String getBackDtChkNum() {
		return backDtChkNum;
	}

	public void setBackDtChkNum(String backDtChkNum) {
		this.backDtChkNum = backDtChkNum;
	}

	public int getBackDtHolidays() {
		return backDtHolidays;
	}

	public void setBackDtHolidays(int backDtHolidays) {
		this.backDtHolidays = backDtHolidays;
	}

	public String getBackDtTranDesc() {
		return backDtTranDesc;
	}

	public void setBackDtTranDesc(String backDtTranDesc) {
		this.backDtTranDesc = backDtTranDesc;
	}

	public MiscInfo(String serialNum, String custName, BigDecimal transitAmt, BigDecimal onUsAmt, BigDecimal cashIn,
			BigDecimal cashOut, int backDt, int backDtDays, String backDtChkNum, int backDtHolidays,
			String backDtTranDesc) {
		super();
		this.serialNum = serialNum;
		this.custName = custName;
		this.transitAmt = transitAmt;
		this.onUsAmt = onUsAmt;
		this.cashIn = cashIn;
		this.cashOut = cashOut;
		this.backDt = backDt;
		this.backDtDays = backDtDays;
		this.backDtChkNum = backDtChkNum;
		this.backDtHolidays = backDtHolidays;
		this.backDtTranDesc = backDtTranDesc;
	}

	public MiscInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MiscInfo [serialNum=" + serialNum + ", custName=" + custName + ", transitAmt=" + transitAmt
				+ ", onUsAmt=" + onUsAmt + ", cashIn=" + cashIn + ", cashOut=" + cashOut + ", backDt=" + backDt
				+ ", backDtDays=" + backDtDays + ", backDtChkNum=" + backDtChkNum + ", backDtHolidays=" + backDtHolidays
				+ ", backDtTranDesc=" + backDtTranDesc + "]";
	}

	

}


