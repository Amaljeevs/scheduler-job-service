package com.alfaris.esb.dto;

public class StmGetCustDetailsReqDTO {

	private StmGetCustDetailsBankHeaderRq riyadBankHeader;

	public StmGetCustDetailsBankHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetCustDetailsBankHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "StmGetCustDetailsReqDTO [riyadBankHeader=" + riyadBankHeader + "]";
	}

	public StmGetCustDetailsReqDTO(StmGetCustDetailsBankHeaderRq riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetCustDetailsReqDTO() {
		super();
	}

}
