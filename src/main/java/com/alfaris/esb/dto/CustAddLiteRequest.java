package com.alfaris.esb.dto;

public class CustAddLiteRequest {

	private CustAddLiteRqHeader riyadBankHeader;
	private CustAddLiteRq custAddLiteRq;
	 
	 
	public CustAddLiteRqHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}
	public void setRiyadBankHeader(CustAddLiteRqHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}
	public CustAddLiteRq getCustAddLiteRq() {
		return custAddLiteRq;
	}
	public void setCustAddLiteRq(CustAddLiteRq custAddLiteRq) {
		this.custAddLiteRq = custAddLiteRq;
	}
	
	
	@Override
	public String toString() {
		return "CustAddLiteRequest [riyadBankHeader=" + riyadBankHeader + ", custAddLiteRq=" + custAddLiteRq + "]";
	}
	 
	
	
	 
}
