package com.alfaris.esb.dto;

public class MiscReqDTO {

	private String accountNo;

	private String accType;

	private String transactionAmount;

	private String creditIndicator;

	private String transactionCode;

	private String glUnit;

	private String glAccountNum;

	private String glBankCode;

	private String glProduct;

	private String cisNumber;

	private String mobileNumber;

	private String transactionRef;

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public String getGlBankCode() {
		return glBankCode;
	}

	public void setGlBankCode(String glBankCode) {
		this.glBankCode = glBankCode;
	}

	public MiscReqDTO(String accountNo, String accType, String transactionAmount, String creditIndicator,
			String transactionCode, String glUnit, String glAccountNum, String glProduct, String cisNumber,
			String mobileNumber) {
		super();
		this.accountNo = accountNo;
		this.accType = accType;
		this.transactionAmount = transactionAmount;
		this.creditIndicator = creditIndicator;
		this.transactionCode = transactionCode;
		this.glUnit = glUnit;
		this.glAccountNum = glAccountNum;
		this.glProduct = glProduct;
		this.cisNumber = cisNumber;
		this.mobileNumber = mobileNumber;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getCreditIndicator() {
		return creditIndicator;
	}

	public void setCreditIndicator(String creditIndicator) {
		this.creditIndicator = creditIndicator;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getGlUnit() {
		return glUnit;
	}

	public void setGlUnit(String glUnit) {
		this.glUnit = glUnit;
	}

	public String getGlAccountNum() {
		return glAccountNum;
	}

	public void setGlAccountNum(String glAccountNum) {
		this.glAccountNum = glAccountNum;
	}

	public String getGlProduct() {
		return glProduct;
	}

	public void setGlProduct(String glProduct) {
		this.glProduct = glProduct;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public MiscReqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
