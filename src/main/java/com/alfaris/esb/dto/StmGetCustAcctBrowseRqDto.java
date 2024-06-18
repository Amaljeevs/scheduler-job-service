package com.alfaris.esb.dto;

public class StmGetCustAcctBrowseRqDto {
	
	private  StmGetCustAcctBrowseHeaderRq riyadBankHeader;

	public StmGetCustAcctBrowseHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetCustAcctBrowseHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "StmGetCustAcctBrowseRqDto [riyadBankHeader=" + riyadBankHeader + "]";
	}

	public StmGetCustAcctBrowseRqDto(StmGetCustAcctBrowseHeaderRq riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}
	public StmGetCustAcctBrowseRqDto() {
		super();
		// TODO Auto-generated constructor stub
	}


}
