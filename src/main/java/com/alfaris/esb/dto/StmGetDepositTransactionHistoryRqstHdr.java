package com.alfaris.esb.dto;

public class StmGetDepositTransactionHistoryRqstHdr {
	
	private String lclPref;

	public String getLclPref() {
		return lclPref;
	}

	public void setLclPref(String lclPref) {
		this.lclPref = lclPref;
	}

	public StmGetDepositTransactionHistoryRqstHdr(String lclPref) {
		super();
		this.lclPref = lclPref;
	}

	public StmGetDepositTransactionHistoryRqstHdr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryRqstHdr [lclPref=" + lclPref + "]";
	}
	
	

}
