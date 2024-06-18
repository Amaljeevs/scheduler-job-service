package com.alfaris.esb.dto;

public class EscrowAccountsApiOminiAcctRsDTO {
	
	
	private String responseCode;
	
	private String responseDesc;
	
	private String currentAccount;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	@Override
	public String toString() {
		return "EscrowAccountsApiOminiAcctRsDTO [responseCode=" + responseCode + ", responseDesc=" + responseDesc
				+ ", currentAccount=" + currentAccount + "]";
	}

	public EscrowAccountsApiOminiAcctRsDTO(String responseCode, String responseDesc, String currentAccount) {
		super();
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
		this.currentAccount = currentAccount;
	}

	public EscrowAccountsApiOminiAcctRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
