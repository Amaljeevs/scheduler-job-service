package com.alfaris.esb.dto;

public class StmGetCustAcctBrowseRsDto {
	private StmGetCustAcctBrowseHeaderRs riyadBankHeader;

	public StmGetCustAcctBrowseHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetCustAcctBrowseHeaderRs riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "StmGetCustAcctBrowseRs [riyadBankHeader=" + riyadBankHeader + "]";
	}

	public StmGetCustAcctBrowseRsDto(StmGetCustAcctBrowseHeaderRs riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetCustAcctBrowseRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
