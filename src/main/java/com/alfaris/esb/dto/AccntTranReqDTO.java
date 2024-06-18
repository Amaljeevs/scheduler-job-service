package com.alfaris.esb.dto;

public class AccntTranReqDTO {
	
	private String transactionReferenceNumber;
	
	private String fromAccountNumber;
	
	private String fromAccountType;
	
	private String fromAmount;
	
	private String fromAccountCurrency;
	
	private String toAccountNumber;
	
	private String toAccountType;
	
	private String toAmount;
	
	private String toAccountCurrency;
	
	private String buyRate1;
	
	private String sellRate1;
	
	private String profitAmount;
	
	private String lossAmount;
	
	private String sarEquivalentAmount;
	
	private String transferType;
	
	private String transferPurpose;
	
	private String paymentDetails1;
	
	private String paymentDetails2;
	

	public String getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(String fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public String getFromAccountType() {
		return fromAccountType;
	}

	public void setFromAccountType(String fromAccountType) {
		this.fromAccountType = fromAccountType;
	}

	public String getFromAmount() {
		return fromAmount;
	}

	public void setFromAmount(String fromAmount) {
		this.fromAmount = fromAmount;
	}

	public String getFromAccountCurrency() {
		return fromAccountCurrency;
	}

	public void setFromAccountCurrency(String fromAccountCurrency) {
		this.fromAccountCurrency = fromAccountCurrency;
	}

	public String getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(String toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public String getToAccountType() {
		return toAccountType;
	}

	public void setToAccountType(String toAccountType) {
		this.toAccountType = toAccountType;
	}

	public String getPaymentDetails2() {
		return paymentDetails2;
	}

	public void setPaymentDetails2(String paymentDetails2) {
		this.paymentDetails2 = paymentDetails2;
	}

	public String getToAmount() {
		return toAmount;
	}

	public void setToAmount(String toAmount) {
		this.toAmount = toAmount;
	}

	public String getToAccountCurrency() {
		return toAccountCurrency;
	}

	public void setToAccountCurrency(String toAccountCurrency) {
		this.toAccountCurrency = toAccountCurrency;
	}

	public String getBuyRate1() {
		return buyRate1;
	}

	public void setBuyRate1(String buyRate1) {
		this.buyRate1 = buyRate1;
	}

	public String getSellRate1() {
		return sellRate1;
	}

	public void setSellRate1(String sellRate1) {
		this.sellRate1 = sellRate1;
	}

	public String getProfitAmount() {
		return profitAmount;
	}

	public void setProfitAmount(String profitAmount) {
		this.profitAmount = profitAmount;
	}

	public String getLossAmount() {
		return lossAmount;
	}

	public void setLossAmount(String lossAmount) {
		this.lossAmount = lossAmount;
	}

	public String getSarEquivalentAmount() {
		return sarEquivalentAmount;
	}

	public void setSarEquivalentAmount(String sarEquivalentAmount) {
		this.sarEquivalentAmount = sarEquivalentAmount;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getTransferPurpose() {
		return transferPurpose;
	}

	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
	}

	public String getPaymentDetails1() {
		return paymentDetails1;
	}

	public void setPaymentDetails1(String paymentDetails1) {
		this.paymentDetails1 = paymentDetails1;
	}
	

	public String getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}

	public void setTransactionReferenceNumber(String transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}

	public AccntTranReqDTO(String transactionReferenceNumber, String fromAccountNumber, String fromAccountType,
			String fromAmount, String fromAccountCurrency, String toAccountNumber, String toAccountType,
			String toAmount, String toAccountCurrency, String buyRate1, String sellRate1, String profitAmount,
			String lossAmount, String sarEquivalentAmount, String transferType, String transferPurpose,
			String paymentDetails1, String paymentDetails2) {
		super();
		this.transactionReferenceNumber = transactionReferenceNumber;
		this.fromAccountNumber = fromAccountNumber;
		this.fromAccountType = fromAccountType;
		this.fromAmount = fromAmount;
		this.fromAccountCurrency = fromAccountCurrency;
		this.toAccountNumber = toAccountNumber;
		this.toAccountType = toAccountType;
		this.toAmount = toAmount;
		this.toAccountCurrency = toAccountCurrency;
		this.buyRate1 = buyRate1;
		this.sellRate1 = sellRate1;
		this.profitAmount = profitAmount;
		this.lossAmount = lossAmount;
		this.sarEquivalentAmount = sarEquivalentAmount;
		this.transferType = transferType;
		this.transferPurpose = transferPurpose;
		this.paymentDetails1 = paymentDetails1;
		this.paymentDetails2 = paymentDetails2;
	}

	@Override
	public String toString() {
		return "AccntTranReqDTO [transactionReferenceNumber=" + transactionReferenceNumber + ", fromAccountNumber="
				+ fromAccountNumber + ", fromAccountType=" + fromAccountType + ", fromAmount=" + fromAmount
				+ ", fromAccountCurrency=" + fromAccountCurrency + ", toAccountNumber=" + toAccountNumber
				+ ", toAccountType=" + toAccountType + ", toAmount=" + toAmount + ", toAccountCurrency="
				+ toAccountCurrency + ", buyRate1=" + buyRate1 + ", sellRate1=" + sellRate1 + ", profitAmount="
				+ profitAmount + ", lossAmount=" + lossAmount + ", sarEquivalentAmount=" + sarEquivalentAmount
				+ ", transferType=" + transferType + ", transferPurpose=" + transferPurpose + ", paymentDetails1="
				+ paymentDetails1 + ", paymentDetails2=" + paymentDetails2 + "]";
	}

	public AccntTranReqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
