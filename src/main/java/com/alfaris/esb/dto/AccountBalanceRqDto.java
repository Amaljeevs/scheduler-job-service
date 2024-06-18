package com.alfaris.esb.dto;

public class AccountBalanceRqDto {
	private AccountBalanceHeaderRq riyadBankHeader;
	private String acctNumber;
	private String acctType;
	private String discriminatorId;

	public AccountBalanceHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AccountBalanceHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getDiscriminatorId() {
		return discriminatorId;
	}

	public void setDiscriminatorId(String discriminatorId) {
		this.discriminatorId = discriminatorId;
	}

	public AccountBalanceRqDto(AccountBalanceHeaderRq riyadBankHeader, String acctNumber, String acctType,
			String discriminatorId) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.discriminatorId = discriminatorId;
	}

	public AccountBalanceRqDto() {
		super();
		
	}

	@Override
	public String toString() {
		return "AccountBalanceRqDto [riyadBankHeader=" + riyadBankHeader + ", acctNumber=" + acctNumber + ", acctType="
				+ acctType + ", discriminatorId=" + discriminatorId + "]";
	}

}
