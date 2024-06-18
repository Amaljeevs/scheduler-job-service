package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class CommissionEsbReq {
	
	private String accountNumber;
	
	private BigDecimal transactionAmount;
	
	private String description;
	
	private String reconciliationRefNumber;
	
	private String transactionReferenceNumber;
	
	private String statementLineEn1;
	
	private String statementLineAr1;
	
	private String statementLineEn2;
	
	private String statementLineAr2;
	
	private BigDecimal channelFee;
	
	private BigDecimal feeAcctCurrency;
	
	private BigDecimal channelFeeVat;
	
	private BigDecimal feeAcctCurrencyVat;
	
	private BigDecimal channelFeeTotalVat;
	
	private BigDecimal feeAcctCurrencyTotalVat;
	
	private String feeDescriptionEn;
	
	private String feeDescriptionAr;
	
	private String functionCodeVat;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReconciliationRefNumber() {
		return reconciliationRefNumber;
	}

	public void setReconciliationRefNumber(String reconciliationRefNumber) {
		this.reconciliationRefNumber = reconciliationRefNumber;
	}

	public String getTransactionReferenceNumber() {
		return transactionReferenceNumber;
	}

	public void setTransactionReferenceNumber(String transactionReferenceNumber) {
		this.transactionReferenceNumber = transactionReferenceNumber;
	}

	public String getStatementLineEn1() {
		return statementLineEn1;
	}

	public void setStatementLineEn1(String statementLineEn1) {
		this.statementLineEn1 = statementLineEn1;
	}

	public String getStatementLineAr1() {
		return statementLineAr1;
	}

	public void setStatementLineAr1(String statementLineAr1) {
		this.statementLineAr1 = statementLineAr1;
	}

	public String getStatementLineEn2() {
		return statementLineEn2;
	}

	public void setStatementLineEn2(String statementLineEn2) {
		this.statementLineEn2 = statementLineEn2;
	}

	public String getStatementLineAr2() {
		return statementLineAr2;
	}

	public void setStatementLineAr2(String statementLineAr2) {
		this.statementLineAr2 = statementLineAr2;
	}

	public BigDecimal getChannelFee() {
		return channelFee;
	}

	public void setChannelFee(BigDecimal channelFee) {
		this.channelFee = channelFee;
	}

	public BigDecimal getFeeAcctCurrency() {
		return feeAcctCurrency;
	}

	public void setFeeAcctCurrency(BigDecimal feeAcctCurrency) {
		this.feeAcctCurrency = feeAcctCurrency;
	}

	public BigDecimal getChannelFeeVat() {
		return channelFeeVat;
	}

	public void setChannelFeeVat(BigDecimal channelFeeVat) {
		this.channelFeeVat = channelFeeVat;
	}

	public BigDecimal getFeeAcctCurrencyVat() {
		return feeAcctCurrencyVat;
	}

	public void setFeeAcctCurrencyVat(BigDecimal feeAcctCurrencyVat) {
		this.feeAcctCurrencyVat = feeAcctCurrencyVat;
	}

	public BigDecimal getChannelFeeTotalVat() {
		return channelFeeTotalVat;
	}

	public void setChannelFeeTotalVat(BigDecimal channelFeeTotalVat) {
		this.channelFeeTotalVat = channelFeeTotalVat;
	}

	public BigDecimal getFeeAcctCurrencyTotalVat() {
		return feeAcctCurrencyTotalVat;
	}

	public void setFeeAcctCurrencyTotalVat(BigDecimal feeAcctCurrencyTotalVat) {
		this.feeAcctCurrencyTotalVat = feeAcctCurrencyTotalVat;
	}

	public String getFeeDescriptionEn() {
		return feeDescriptionEn;
	}

	public void setFeeDescriptionEn(String feeDescriptionEn) {
		this.feeDescriptionEn = feeDescriptionEn;
	}

	public String getFeeDescriptionAr() {
		return feeDescriptionAr;
	}

	public void setFeeDescriptionAr(String feeDescriptionAr) {
		this.feeDescriptionAr = feeDescriptionAr;
	}

	public String getFunctionCodeVat() {
		return functionCodeVat;
	}

	public void setFunctionCodeVat(String functionCodeVat) {
		this.functionCodeVat = functionCodeVat;
	}

	@Override
	public String toString() {
		return "CommissionEsbReq [accountNumber=" + accountNumber + ", transactionAmount=" + transactionAmount
				+ ", description=" + description + ", reconciliationRefNumber=" + reconciliationRefNumber
				+ ", transactionReferenceNumber=" + transactionReferenceNumber + ", statementLineEn1="
				+ statementLineEn1 + ", statementLineAr1=" + statementLineAr1 + ", statementLineEn2=" + statementLineEn2
				+ ", statementLineAr2=" + statementLineAr2 + ", channelFee=" + channelFee + ", feeAcctCurrency="
				+ feeAcctCurrency + ", channelFeeVat=" + channelFeeVat + ", feeAcctCurrencyVat=" + feeAcctCurrencyVat
				+ ", channelFeeTotalVat=" + channelFeeTotalVat + ", feeAcctCurrencyTotalVat=" + feeAcctCurrencyTotalVat
				+ ", feeDescriptionEn=" + feeDescriptionEn + ", feeDescriptionAr=" + feeDescriptionAr
				+ ", functionCodeVat=" + functionCodeVat + "]";
	}

	public CommissionEsbReq(String accountNumber, BigDecimal transactionAmount, String description,
			String reconciliationRefNumber, String transactionReferenceNumber, String statementLineEn1,
			String statementLineAr1, String statementLineEn2, String statementLineAr2, BigDecimal channelFee,
			BigDecimal feeAcctCurrency, BigDecimal channelFeeVat, BigDecimal feeAcctCurrencyVat,
			BigDecimal channelFeeTotalVat, BigDecimal feeAcctCurrencyTotalVat, String feeDescriptionEn,
			String feeDescriptionAr, String functionCodeVat) {
		super();
		this.accountNumber = accountNumber;
		this.transactionAmount = transactionAmount;
		this.description = description;
		this.reconciliationRefNumber = reconciliationRefNumber;
		this.transactionReferenceNumber = transactionReferenceNumber;
		this.statementLineEn1 = statementLineEn1;
		this.statementLineAr1 = statementLineAr1;
		this.statementLineEn2 = statementLineEn2;
		this.statementLineAr2 = statementLineAr2;
		this.channelFee = channelFee;
		this.feeAcctCurrency = feeAcctCurrency;
		this.channelFeeVat = channelFeeVat;
		this.feeAcctCurrencyVat = feeAcctCurrencyVat;
		this.channelFeeTotalVat = channelFeeTotalVat;
		this.feeAcctCurrencyTotalVat = feeAcctCurrencyTotalVat;
		this.feeDescriptionEn = feeDescriptionEn;
		this.feeDescriptionAr = feeDescriptionAr;
		this.functionCodeVat = functionCodeVat;
	}

	public CommissionEsbReq() {
		super();
	}

}
