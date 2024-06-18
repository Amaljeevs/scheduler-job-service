package com.alfaris.esb.dto;

public class StmGetDepositTransactionHistoryRsDto {
	
	private  StmGetDepositTransactionHistoryResponseHeader riyadBankHeader;

	public StmGetDepositTransactionHistoryResponseHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmGetDepositTransactionHistoryResponseHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetDepositTransactionHistoryRsDto(StmGetDepositTransactionHistoryResponseHeader riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmGetDepositTransactionHistoryRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmGetDepositTransactionHistoryRsDto [riyadBankHeader=" + riyadBankHeader + "]";
	}
	
	

}
