package com.alfaris.esb.dto;

public class CustAccountResDTO {
	
	private String accntCurrency;
	
	private String accType;
	
	private String accountNumber;
	
	private String balance;
	
	private String accntProdType;
	
	private String accntNameAddress;

	public String getAccntCurrency() {
		return accntCurrency;
	}

	public void setAccntCurrency(String accntCurrency) {
		this.accntCurrency = accntCurrency;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getAccntProdType() {
		return accntProdType;
	}

	public void setAccntProdType(String accntProdType) {
		this.accntProdType = accntProdType;
	}

	public String getAccntNameAddress() {
		return accntNameAddress;
	}

	public void setAccntNameAddress(String accntNameAddress) {
		this.accntNameAddress = accntNameAddress;
	}

	public CustAccountResDTO(String accntCurrency, String accType, String accountNumber, String balance,
			String accntProdType, String accntNameAddress) {
		super();
		this.accntCurrency = accntCurrency;
		this.accType = accType;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accntProdType = accntProdType;
		this.accntNameAddress = accntNameAddress;
	}

	public CustAccountResDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustAccountResDTO [accntCurrency=" + accntCurrency + ", accType=" + accType + ", accountNumber="
				+ accountNumber + ", balance=" + balance + ", accntProdType=" + accntProdType + ", accntNameAddress="
				+ accntNameAddress + "]";
	}
	
	

}
