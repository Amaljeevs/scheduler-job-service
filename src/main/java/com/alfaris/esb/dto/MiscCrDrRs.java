package com.alfaris.esb.dto;

public class MiscCrDrRs {

	
	private MiscCrDrHeaderRs riyadBankHeader;
	private String availableBalance;
	private String availableBalanceSi;
	private String transactionReferenceNumber;
	private MiscCrDrSamaExceptionList samaExceptionList;
	
	public MiscCrDrHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}
	public void setRiyadBankHeader(MiscCrDrHeaderRs riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAvailableBalanceSi() {
		return availableBalanceSi;
	}
	public void setAvailableBalanceSi(String availableBalanceSi) {
		this.availableBalanceSi = availableBalanceSi;
	}
	public String getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}
	public void setTransactionReferenceNumber(String transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}
	public MiscCrDrSamaExceptionList getSamaExceptionList() {
		return samaExceptionList;
	}
	public void setSamaExceptionList(MiscCrDrSamaExceptionList samaExceptionList) {
		this.samaExceptionList = samaExceptionList;
	}
	public MiscCrDrRs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MiscCrDrRs [riyadBankHeader=" + riyadBankHeader + ", availableBalance=" + availableBalance
				+ ", availableBalanceSi=" + availableBalanceSi + ", transactionReferenceNumber="
				+ transactionReferenceNumber + ", samaExceptionList=" + samaExceptionList + "]";
	}
	
	

}
