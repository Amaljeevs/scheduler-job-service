package com.alfaris.esb.dto;

public class AccountDetail {
	
	private String acctType;
	private String accountCurrency;
	private String isoCurrencyCode;
	private String accountNumber;
	private String accountNumberMask;
	private String accountRelationCode;
	private String availableBalance;
	private String acctProdType;
	private String accountStatusCd;
	private String nameLanguageCode;
	private String acctNameAddress1;
	private String acctNameAddress2;
	private String forgedIdFlag;
	
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAccountCurrency() {
		return accountCurrency;
	}
	public void setAccountCurrency(String accountCurrency) {
		this.accountCurrency = accountCurrency;
	}
	public String getIsoCurrencyCode() {
		return isoCurrencyCode;
	}
	public void setIsoCurrencyCode(String isoCurrencyCode) {
		this.isoCurrencyCode = isoCurrencyCode;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumberMask() {
		return accountNumberMask;
	}
	public void setAccountNumberMask(String accountNumberMask) {
		this.accountNumberMask = accountNumberMask;
	}
	public String getAccountRelationCode() {
		return accountRelationCode;
	}
	public void setAccountRelationCode(String accountRelationCode) {
		this.accountRelationCode = accountRelationCode;
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAcctProdType() {
		return acctProdType;
	}
	public void setAcctProdType(String acctProdType) {
		this.acctProdType = acctProdType;
	}
	public String getAccountStatusCd() {
		return accountStatusCd;
	}
	public void setAccountStatusCd(String accountStatusCd) {
		this.accountStatusCd = accountStatusCd;
	}
	public String getNameLanguageCode() {
		return nameLanguageCode;
	}
	public void setNameLanguageCode(String nameLanguageCode) {
		this.nameLanguageCode = nameLanguageCode;
	}
	public String getAcctNameAddress1() {
		return acctNameAddress1;
	}
	public void setAcctNameAddress1(String acctNameAddress1) {
		this.acctNameAddress1 = acctNameAddress1;
	}
	public String getAcctNameAddress2() {
		return acctNameAddress2;
	}
	public void setAcctNameAddress2(String acctNameAddress2) {
		this.acctNameAddress2 = acctNameAddress2;
	}
	public String getForgedIdFlag() {
		return forgedIdFlag;
	}
	public void setForgedIdFlag(String forgedIdFlag) {
		this.forgedIdFlag = forgedIdFlag;
	}
	@Override
	public String toString() {
		return "AccountDetail [acctType=" + acctType + ", accountCurrency=" + accountCurrency + ", isoCurrencyCode="
				+ isoCurrencyCode + ", accountNumber=" + accountNumber + ", accountNumberMask=" + accountNumberMask
				+ ", accountRelationCode=" + accountRelationCode + ", availableBalance=" + availableBalance
				+ ", acctProdType=" + acctProdType + ", accountStatusCd=" + accountStatusCd + ", nameLanguageCode="
				+ nameLanguageCode + ", acctNameAddress1=" + acctNameAddress1 + ", acctNameAddress2=" + acctNameAddress2
				+ ", forgedIdFlag=" + forgedIdFlag + "]";
	}
	public AccountDetail(String acctType, String accountCurrency, String isoCurrencyCode, String accountNumber,
			String accountNumberMask, String accountRelationCode, String availableBalance, String acctProdType,
			String accountStatusCd, String nameLanguageCode, String acctNameAddress1, String acctNameAddress2,
			String forgedIdFlag) {
		super();
		this.acctType = acctType;
		this.accountCurrency = accountCurrency;
		this.isoCurrencyCode = isoCurrencyCode;
		this.accountNumber = accountNumber;
		this.accountNumberMask = accountNumberMask;
		this.accountRelationCode = accountRelationCode;
		this.availableBalance = availableBalance;
		this.acctProdType = acctProdType;
		this.accountStatusCd = accountStatusCd;
		this.nameLanguageCode = nameLanguageCode;
		this.acctNameAddress1 = acctNameAddress1;
		this.acctNameAddress2 = acctNameAddress2;
		this.forgedIdFlag = forgedIdFlag;
	}
	public AccountDetail() {
		super();
		// TODO Auto-generated constructor stub
	}



}
