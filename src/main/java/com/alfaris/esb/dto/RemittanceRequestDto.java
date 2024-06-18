package com.alfaris.esb.dto;

public class RemittanceRequestDto {
	private RemittanceHeaderRq riyadBankHeader;
	private String sourceAccount;
	private String sourceCurrency;
	private String beneficiaryName;
	private String sourceAmount;
	private String beneficiaryAccount;
	private String sarEquivalentAmount;
	private String chargeDetail;
	private String targetAmount;
	private String targetCurrency;
	private int transferType;
	private String transferPurpose;
	private String valueDate;
	private String bankCode;
	private String remittanceName;
	private String beneficiaryBank;
	private String beneficiaryBankAddress1;
	private String beneficiaryBankAddress2;
	private String paymentDetails1;
	private String transactionReferenceNumber;
	private String remittanceRefNo;
	private String acctType;
	private String beneficiaryBankCode;
	private String beneficiaryCountryCode;

	public String getBeneficiaryBankCode() {
		return beneficiaryBankCode;
	}

	public void setBeneficiaryBankCode(String beneficiaryBankCode) {
		this.beneficiaryBankCode = beneficiaryBankCode;
	}

	public String getBeneficiaryCountryCode() {
		return beneficiaryCountryCode;
	}

	public void setBeneficiaryCountryCode(String beneficiaryCountryCode) {
		this.beneficiaryCountryCode = beneficiaryCountryCode;
	}

	public RemittanceHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(RemittanceHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

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

	public String getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(String sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public String getSarEquivalentAmount() {
		return sarEquivalentAmount;
	}

	public void setSarEquivalentAmount(String sarEquivalentAmount) {
		this.sarEquivalentAmount = sarEquivalentAmount;
	}

	public String getChargeDetail() {
		return chargeDetail;
	}

	public void setChargeDetail(String chargeDetail) {
		this.chargeDetail = chargeDetail;
	}

	public String getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(String targetAmount) {
		this.targetAmount = targetAmount;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public int getTransferType() {
		return transferType;
	}

	public void setTransferType(int transferType) {
		this.transferType = transferType;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getBankCode() {
		return bankCode;
	}

	public String getTransferPurpose() {
		return transferPurpose;
	}

	public void setTransferPurpose(String transferPurpose) {
		this.transferPurpose = transferPurpose;
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

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	@Override
	public String toString() {
		return "RemittanceRequestDto [riyadBankHeader=" + riyadBankHeader + ", sourceAccount=" + sourceAccount
				+ ", sourceCurrency=" + sourceCurrency + ", beneficiaryName=" + beneficiaryName + ", sourceAmount="
				+ sourceAmount + ", beneficiaryAccount=" + beneficiaryAccount + ", sarEquivalentAmount="
				+ sarEquivalentAmount + ", chargeDetail=" + chargeDetail + ", targetAmount=" + targetAmount
				+ ", targetCurrency=" + targetCurrency + ", transferType=" + transferType + ", transferPurpose="
				+ transferPurpose + ", valueDate=" + valueDate + ", bankCode=" + bankCode + ", remittanceName="
				+ remittanceName + ", beneficiaryBank=" + beneficiaryBank + ", beneficiaryBankAddress1="
				+ beneficiaryBankAddress1 + ", beneficiaryBankAddress2=" + beneficiaryBankAddress2
				+ ", paymentDetails1=" + paymentDetails1 + ", transactionReferenceNumber=" + transactionReferenceNumber
				+ ", remittanceRefNo=" + remittanceRefNo + ", acctType=" + acctType + ", beneficiaryBankCode="
				+ beneficiaryBankCode + ", beneficiaryCountryCode=" + beneficiaryCountryCode + "]";
	}

	public RemittanceRequestDto() {
		super();
	}

}
