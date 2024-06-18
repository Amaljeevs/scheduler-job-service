package com.alfaris.esb.dto;

public class AcctNoOfInterest {
	
	private String acctLastIntPeriod;
	private String acctLastIntAmount;
	private String acctLastIntAmountSi;

	public String getAcctLastIntPeriod() {
		return acctLastIntPeriod;
	}

	public void setAcctLastIntPeriod(String acctLastIntPeriod) {
		this.acctLastIntPeriod = acctLastIntPeriod;
	}

	public String getAcctLastIntAmount() {
		return acctLastIntAmount;
	}

	public void setAcctLastIntAmount(String acctLastIntAmount) {
		this.acctLastIntAmount = acctLastIntAmount;
	}

	public String getAcctLastIntAmountSi() {
		return acctLastIntAmountSi;
	}

	public void setAcctLastIntAmountSi(String acctLastIntAmountSi) {
		this.acctLastIntAmountSi = acctLastIntAmountSi;
	}

	public AcctNoOfInterest(String acctLastIntPeriod, String acctLastIntAmount, String acctLastIntAmountSi) {
		super();
		this.acctLastIntPeriod = acctLastIntPeriod;
		this.acctLastIntAmount = acctLastIntAmount;
		this.acctLastIntAmountSi = acctLastIntAmountSi;
	}

	public AcctNoOfInterest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AcctNoOfInterest [acctLastIntPeriod=" + acctLastIntPeriod + ", acctLastIntAmount=" + acctLastIntAmount
				+ ", acctLastIntAmountSi=" + acctLastIntAmountSi + "]";
	}

}
