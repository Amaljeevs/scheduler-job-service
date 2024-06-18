package com.alfaris.esb.dto;

public class CustAddLiteResponse {

	private CustAddLiteRsHeader riyadBankHeader;

	public CustAddLiteRsHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(CustAddLiteRsHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "CustAddLiteResponse [riyadBankHeader=" + riyadBankHeader + "]";
	}

}
