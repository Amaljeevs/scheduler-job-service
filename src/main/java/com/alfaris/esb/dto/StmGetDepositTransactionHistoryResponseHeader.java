package com.alfaris.esb.dto;

import java.util.ArrayList;

public class StmGetDepositTransactionHistoryResponseHeader {
	
	private StmGetDepositTransactionHistoryResponseTsRsHdr tsRsHdr;
	
	private ArrayList<GetDepositTransactionHistoryRs> getDepositTransactionHistoryRs;

	public StmGetDepositTransactionHistoryResponseTsRsHdr getTsRsHdr() {
		return tsRsHdr;
	}

	public void setTsRsHdr(StmGetDepositTransactionHistoryResponseTsRsHdr tsRsHdr) {
		this.tsRsHdr = tsRsHdr;
	}

	public ArrayList<GetDepositTransactionHistoryRs> getGetDepositTransactionHistoryRs() {
		return getDepositTransactionHistoryRs;
	}

	public void setGetDepositTransactionHistoryRs(
			ArrayList<GetDepositTransactionHistoryRs> getDepositTransactionHistoryRs) {
		this.getDepositTransactionHistoryRs = getDepositTransactionHistoryRs;
	}

	public StmGetDepositTransactionHistoryResponseHeader(StmGetDepositTransactionHistoryResponseTsRsHdr tsRsHdr,
			ArrayList<GetDepositTransactionHistoryRs> getDepositTransactionHistoryRs) {
		super();
		this.tsRsHdr = tsRsHdr;
		this.getDepositTransactionHistoryRs = getDepositTransactionHistoryRs;
	}

	public StmGetDepositTransactionHistoryResponseHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryResponseHeader [tsRsHdr=" + tsRsHdr + ", getDepositTransactionHistoryRs="
				+ getDepositTransactionHistoryRs + "]";
	}
	
	


}
