package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StmPostDepositAccountMaintRsDto {
	 
	@JsonProperty("riyadBankHeader")
	private StmPostDepositAccountMaintHeaderRs riyadBankHeader;

	public StmPostDepositAccountMaintHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(StmPostDepositAccountMaintHeaderRs riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmPostDepositAccountMaintRsDto(StmPostDepositAccountMaintHeaderRs riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public StmPostDepositAccountMaintRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmPostDepositAccountMaintRsDto [riyadBankHeader=" + riyadBankHeader + "]";
	}
	
	

}
