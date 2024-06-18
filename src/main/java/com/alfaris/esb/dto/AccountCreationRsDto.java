package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountCreationRsDto {
	
	@JsonProperty("riyadBankHeader")
	private AccountCreationHeaderRs riyadBankHeaderRs;
	
	@JsonProperty("systematicsStatusMessage")
    private SystematicsStatusMessage systematicsStatusMessage;
	
	@JsonProperty("acctNumber")
    private String acctNumber;
	
	@JsonProperty("ibanAcctNumber")
    private String ibanAcctNumber;
    
	public AccountCreationHeaderRs getRiyadBankHeaderRs() {
		return riyadBankHeaderRs;
	}
	public void setRiyadBankHeaderRs(AccountCreationHeaderRs riyadBankHeaderRs) {
		this.riyadBankHeaderRs = riyadBankHeaderRs;
	}
	public SystematicsStatusMessage getSystematicsStatusMessage() {
		return systematicsStatusMessage;
	}
	public void setSystematicsStatusMessage(SystematicsStatusMessage systematicsStatusMessage) {
		this.systematicsStatusMessage = systematicsStatusMessage;
	}
	public String getAcctNumber() {
		return acctNumber;
	}
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}
	public String getIbanAcctNumber() {
		return ibanAcctNumber;
	}
	public void setIbanAcctNumber(String ibanAcctNumber) {
		this.ibanAcctNumber = ibanAcctNumber;
	}
	public AccountCreationRsDto(AccountCreationHeaderRs riyadBankHeaderRs, SystematicsStatusMessage systematicsStatusMessage,
			String acctNumber, String ibanAcctNumber) {
		super();
		this.riyadBankHeaderRs = riyadBankHeaderRs;
		this.systematicsStatusMessage = systematicsStatusMessage;
		this.acctNumber = acctNumber;
		this.ibanAcctNumber = ibanAcctNumber;
	}
	public AccountCreationRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AccountCreationRsDto [riyadBankHeaderRs=" + riyadBankHeaderRs + ", systematicsStatusMessage="
				+ systematicsStatusMessage + ", acctNumber=" + acctNumber + ", ibanAcctNumber=" + ibanAcctNumber + "]";
	}
    
    
}
