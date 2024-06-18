package com.alfaris.esb.dto;

public class AccntTranResDTO {

	private String transactionReference;
	
	private String descriptionEn;
	
	private String asiReturnCode;
	
	private String availableBalance;
	
	private String customerIntiatedCredit;
	
	private String revOp;

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public String getDescriptionEn() {
		return descriptionEn;
	}

	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}

	public String getAsiReturnCode() {
		return asiReturnCode;
	}

	public void setAsiReturnCode(String asiReturnCode) {
		this.asiReturnCode = asiReturnCode;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getCustomerIntiatedCredit() {
		return customerIntiatedCredit;
	}

	public void setCustomerIntiatedCredit(String customerIntiatedCredit) {
		this.customerIntiatedCredit = customerIntiatedCredit;
	}

	public String getRevOp() {
		return revOp;
	}

	public void setRevOp(String revOp) {
		this.revOp = revOp;
	}

	public AccntTranResDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccntTranResDTO(String transactionReference, String descriptionEn, String asiReturnCode,
			String availableBalance, String customerIntiatedCredit, String revOp) {
		super();
		this.transactionReference = transactionReference;
		this.descriptionEn = descriptionEn;
		this.asiReturnCode = asiReturnCode;
		this.availableBalance = availableBalance;
		this.customerIntiatedCredit = customerIntiatedCredit;
		this.revOp = revOp;
	}
	
	
	
}
