package com.alfaris.esb.dto;

public class StmGetDepositTransactionHistoryRqDto {
	
	private StmGetDepositTransactionHistoryHeader riyadBankHeader;

	public StmGetDepositTransactionHistoryHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetDepositTransactionHistoryHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetDepositTransactionHistoryRqDto(StmGetDepositTransactionHistoryHeader riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetDepositTransactionHistoryRqDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryRqDto [riyadBankHeader=" + riyadBankHeader + "]";
	}
	
	
	

}
