package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class MiscCrDrRq {

	private MiscCrDrHeaderRq riyadBankHeader;
	private String accountNumber;
	private String accountType;
	private BigDecimal transactionAmount;
	private String creditDebitIndicator;
	private int transactionCode;
	private String description;
	private String reconciliationRefNumber;
	private int glBranchCode;
	private String glAccountNumber;
	private int glMarketSectorCode;
	private String transactionReferenceNumber;
	private String statementLineEn1;
	private BigDecimal channelFee;
	private BigDecimal feeAcctCurrency;
	private BigDecimal channelFeeVat;
	private BigDecimal feeAcctCurrencyVat;
	private BigDecimal channelFeeTotalVat;
	private BigDecimal feeAcctCurrencyTotalVat;
	private String feeDescriptionEn;
	private BigDecimal vatPercentage;

	public MiscCrDrHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(MiscCrDrHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(String creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public int getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
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

	public int getGlBranchCode() {
		return glBranchCode;
	}

	public void setGlBranchCode(int glBranchCode) {
		this.glBranchCode = glBranchCode;
	}

	public String getGlAccountNumber() {
		return glAccountNumber;
	}

	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}

	public int getGlMarketSectorCode() {
		return glMarketSectorCode;
	}

	public void setGlMarketSectorCode(int glMarketSectorCode) {
		this.glMarketSectorCode = glMarketSectorCode;
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

	public BigDecimal getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(BigDecimal vatPercentage) {
		this.vatPercentage = vatPercentage;
	}

	public MiscCrDrRq() {
		super();
	}

	@Override
	public String toString() {
		return "MiscCrDrRq [riyadBankHeader=" + riyadBankHeader + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", transactionAmount=" + transactionAmount + ", creditDebitIndicator="
				+ creditDebitIndicator + ", transactionCode=" + transactionCode + ", description=" + description
				+ ", reconciliationRefNumber=" + reconciliationRefNumber + ", glBranchCode=" + glBranchCode
				+ ", glAccountNumber=" + glAccountNumber + ", glMarketSectorCode=" + glMarketSectorCode
				+ ", transactionReferenceNumber=" + transactionReferenceNumber + ", statementLineEn1="
				+ statementLineEn1 + ", channelFee=" + channelFee + ", feeAcctCurrency=" + feeAcctCurrency
				+ ", channelFeeVat=" + channelFeeVat + ", feeAcctCurrencyVat=" + feeAcctCurrencyVat
				+ ", channelFeeTotalVat=" + channelFeeTotalVat + ", feeAcctCurrencyTotalVat=" + feeAcctCurrencyTotalVat
				+ ", feeDescriptionEn=" + feeDescriptionEn + ", vatPercentage=" + vatPercentage + "]";
	}

	


}
