package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class RemittenceEsbRq {
	
    private String sourceAccount;
    private String sourceCurrency;
    private String beneficiaryName;
    private BigDecimal sourceAmount;
    private String beneficiaryAccount;
    private BigDecimal sarEquivalentAmount;
    private BigDecimal targetAmount;
    private String targetCurrency;
    private String transferPurpose;
    private String bankCode;
    private String remittanceName;
    private String beneficiaryBank;
    private String beneficiaryBankAddress1;
    private String beneficiaryBankAddress2;
    private String paymentDetails1;
    private String transactionReferenceNumber;
    private String remittanceRefNo;
    
	public String getSourceAccount() {
		return sourceAccount;
	}
	public void setSourceAccount(String sourceAccount) {
		this.sourceAccount = sourceAccount;
	}
	public String getSourceCurrency() {
		return sourceCurrency;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public BigDecimal getSourceAmount() {
		return sourceAmount;
	}
	public void setSourceAmount(BigDecimal sourceAmount) {
		this.sourceAmount = sourceAmount;
	}
	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}
	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}
	public BigDecimal getSarEquivalentAmount() {
		return sarEquivalentAmount;
	}
	public void setSarEquivalentAmount(BigDecimal sarEquivalentAmount) {
		this.sarEquivalentAmount = sarEquivalentAmount;
	}
	public BigDecimal getTargetAmount() {
		return targetAmount;
	}
	public void setTargetAmount(BigDecimal targetAmount) {
		this.targetAmount = targetAmount;
	}
	public String getTargetCurrency() {
		return targetCurrency;
	}
	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}
	public String getTransferPurpose() {
		return transferPurpose;
	}
	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
	}
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getRemittanceName() {
		return remittanceName;
	}
	public void setRemittanceName(String remittanceName) {
		this.remittanceName = remittanceName;
	}
	public String getBeneficiaryBank() {
		return beneficiaryBank;
	}
	public void setBeneficiaryBank(String beneficiaryBank) {
		this.beneficiaryBank = beneficiaryBank;
	}
	public String getBeneficiaryBankAddress1() {
		return beneficiaryBankAddress1;
	}
	public void setBeneficiaryBankAddress1(String beneficiaryBankAddress1) {
		this.beneficiaryBankAddress1 = beneficiaryBankAddress1;
	}
	public String getBeneficiaryBankAddress2() {
		return beneficiaryBankAddress2;
	}
	public void setBeneficiaryBankAddress2(String beneficiaryBankAddress2) {
		this.beneficiaryBankAddress2 = beneficiaryBankAddress2;
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
	public String getRemittanceRefNo() {
		return remittanceRefNo;
	}
	public void setRemittanceRefNo(String remittanceRefNo) {
		this.remittanceRefNo = remittanceRefNo;
	}
	
	@Override
	public String toString() {
		return "RemittenceEsbRq [sourceAccount=" + sourceAccount + ", sourceCurrency=" + sourceCurrency
				+ ", beneficiaryName=" + beneficiaryName + ", sourceAmount=" + sourceAmount + ", beneficiaryAccount="
				+ beneficiaryAccount + ", sarEquivalentAmount=" + sarEquivalentAmount + ", targetAmount=" + targetAmount
				+ ", targetCurrency=" + targetCurrency + ", transferPurpose=" + transferPurpose + ", bankCode="
				+ bankCode + ", remittanceName=" + remittanceName + ", beneficiaryBank=" + beneficiaryBank
				+ ", beneficiaryBankAddress1=" + beneficiaryBankAddress1 + ", beneficiaryBankAddress2="
				+ beneficiaryBankAddress2 + ", paymentDetails1=" + paymentDetails1 + ", transactionReferenceNumber="
				+ transactionReferenceNumber + ", remittanceRefNo=" + remittanceRefNo + "]";
	}
	
	public RemittenceEsbRq() {
		super();
	}
    
    

}
