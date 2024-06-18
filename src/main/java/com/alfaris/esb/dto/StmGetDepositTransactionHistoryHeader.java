package com.alfaris.esb.dto;

public class StmGetDepositTransactionHistoryHeader {
	
	private StmGetDepositTransactionHistoryRqstHdr rqstHdr;
	
	private StmGetDepositTransactionHistoryTsRqHdr tsRqHdr;
	
	private GetDepositTransactionHistoryRq	getDepositTransactionHistoryRq;

	public StmGetDepositTransactionHistoryRqstHdr getRqstHdr() {
		return rqstHdr;
	}

	public void setRqstHdr(StmGetDepositTransactionHistoryRqstHdr rqstHdr) {
		this.rqstHdr = rqstHdr;
	}

	public StmGetDepositTransactionHistoryTsRqHdr getTsRqHdr() {
		return tsRqHdr;
	}

	public void setTsRqHdr(StmGetDepositTransactionHistoryTsRqHdr tsRqHdr) {
		this.tsRqHdr = tsRqHdr;
	}

	public GetDepositTransactionHistoryRq getGetDepositTransactionHistoryRq() {
		return getDepositTransactionHistoryRq;
	}

	public void setGetDepositTransactionHistoryRq(GetDepositTransactionHistoryRq getDepositTransactionHistoryRq) {
		this.getDepositTransactionHistoryRq = getDepositTransactionHistoryRq;
	}

	public StmGetDepositTransactionHistoryHeader(StmGetDepositTransactionHistoryRqstHdr rqstHdr,
			StmGetDepositTransactionHistoryTsRqHdr tsRqHdr,
			GetDepositTransactionHistoryRq getDepositTransactionHistoryRq) {
		super();
		this.rqstHdr = rqstHdr;
		this.tsRqHdr = tsRqHdr;
		this.getDepositTransactionHistoryRq = getDepositTransactionHistoryRq;
	}

	public StmGetDepositTransactionHistoryHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryHeader [rqstHdr=" + rqstHdr + ", tsRqHdr=" + tsRqHdr
				+ ", getDepositTransactionHistoryRq=" + getDepositTransactionHistoryRq + "]";
	}
	
	

}
