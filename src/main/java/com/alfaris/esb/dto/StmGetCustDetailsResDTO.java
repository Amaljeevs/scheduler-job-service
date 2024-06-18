package com.alfaris.esb.dto;

public class StmGetCustDetailsResDTO {

	private StmGetCustDetailsBankHeaderRs riyadBankHeader;

	public StmGetCustDetailsBankHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetCustDetailsBankHeaderRs riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "StmGetCustDetailsResDTO [riyadBankHeader=" + riyadBankHeader + "]";
	}

	public StmGetCustDetailsResDTO() {
		super();
	}

	public StmGetCustDetailsResDTO(StmGetCustDetailsBankHeaderRs riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

}
