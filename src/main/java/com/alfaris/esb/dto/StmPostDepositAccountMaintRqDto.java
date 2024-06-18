package com.alfaris.esb.dto;

public class StmPostDepositAccountMaintRqDto {
	
	private StmPostDepositAccountMaintHeaderRq riyadBankHeader;

	public StmPostDepositAccountMaintHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmPostDepositAccountMaintHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "stmPostDepositAccountMaintRqDto [riyadBankHeader=" + riyadBankHeader + "]";
	}
	
	

	public StmPostDepositAccountMaintRqDto(StmPostDepositAccountMaintHeaderRq riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmPostDepositAccountMaintRqDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
