package com.alfaris.esb.dto;

public class XFerTo {
	
	private String accountType;
	private String accountCurrencyCode;
	private String branchNumber;
	private String accountNumber;
	private String availableBalance;
	private String currentBalance;
	private String accountStatus;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountCurrencyCode() {
		return accountCurrencyCode;
	}
	public void setAccountCurrencyCode(String accountCurrencyCode) {
		this.accountCurrencyCode = accountCurrencyCode;
	}
	public String getBranchNumber() {
		return branchNumber;
	}
	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public XFerTo(String accountType, String accountCurrencyCode, String branchNumber, String accountNumber,
			String availableBalance, String currentBalance, String accountStatus) {
		super();
		this.accountType = accountType;
		this.accountCurrencyCode = accountCurrencyCode;
		this.branchNumber = branchNumber;
		this.accountNumber = accountNumber;
		this.availableBalance = availableBalance;
		this.currentBalance = currentBalance;
		this.accountStatus = accountStatus;
	}
	public XFerTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "XFerTo [accountType=" + accountType + ", accountCurrencyCode=" + accountCurrencyCode + ", branchNumber="
				+ branchNumber + ", accountNumber=" + accountNumber + ", availableBalance=" + availableBalance
				+ ", currentBalance=" + currentBalance + ", accountStatus=" + accountStatus + "]";
	}
	
	

}
