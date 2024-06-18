package com.alfaris.esb.dto;

public class StmGetDepositTransactionHistoryResponseTsRsHdr {
	
	private String maxSeverity;
	
	private String processMessage;
	
	private String nextDay;

	public String getMaxSeverity() {
		return maxSeverity;
	}

	public void setMaxSeverity(String maxSeverity) {
		this.maxSeverity = maxSeverity;
	}

	public String getProcessMessage() {
		return processMessage;
	}

	public void setProcessMessage(String processMessage) {
		this.processMessage = processMessage;
	}

	public String getNextDay() {
		return nextDay;
	}

	public void setNextDay(String nextDay) {
		this.nextDay = nextDay;
	}

	public StmGetDepositTransactionHistoryResponseTsRsHdr(String maxSeverity, String processMessage, String nextDay) {
		super();
		this.maxSeverity = maxSeverity;
		this.processMessage = processMessage;
		this.nextDay = nextDay;
	}

	public StmGetDepositTransactionHistoryResponseTsRsHdr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryResponseTsRsHdr [maxSeverity=" + maxSeverity + ", processMessage="
				+ processMessage + ", nextDay=" + nextDay + "]";
	}
	
	
	

}
