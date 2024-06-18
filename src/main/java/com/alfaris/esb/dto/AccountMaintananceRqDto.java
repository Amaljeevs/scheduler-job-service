package com.alfaris.esb.dto;

public class AccountMaintananceRqDto {

	private String accountType;
	private String accountCurrencyCode;
	private String branchNumber;
	private String acctId;
	private String custGenerated;
	private String fieldNum;
	private String offInitials;
	private String newData;
	private String action;
	private String afterPost;

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountCurrencyCode() {
		return accountCurrencyCode;
	}

	public void setAccountCurrencyCode(String accountCurrencyCode) {
		this.accountCurrencyCode = accountCurrencyCode;
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getCustGenerated() {
		return custGenerated;
	}

	public void setCustGenerated(String custGenerated) {
		this.custGenerated = custGenerated;
	}

	public String getFieldNum() {
		return fieldNum;
	}

	public void setFieldNum(String fieldNum) {
		this.fieldNum = fieldNum;
	}

	public String getOffInitials() {
		return offInitials;
	}

	public void setOffInitials(String offInitials) {
		this.offInitials = offInitials;
	}

	public String getNewData() {
		return newData;
	}

	public void setNewData(String newData) {
		this.newData = newData;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAfterPost() {
		return afterPost;
	}

	public void setAfterPost(String afterPost) {
		this.afterPost = afterPost;
	}

	@Override
	public String toString() {
		return "AccountMaintananceRqDto [accountType=" + accountType + ", accountCurrencyCode=" + accountCurrencyCode
				+ ", branchNumber=" + branchNumber + ", acctId=" + acctId + ", custGenerated=" + custGenerated
				+ ", fieldNum=" + fieldNum + ", offInitials=" + offInitials + ", newData=" + newData + ", action="
				+ action + ", afterPost=" + afterPost + "]";
	}

	public AccountMaintananceRqDto(String accountType, String accountCurrencyCode, String branchNumber, String acctId,
			String custGenerated, String fieldNum, String offInitials, String newData, String action,
			String afterPost) {
		super();
		this.accountType = accountType;
		this.accountCurrencyCode = accountCurrencyCode;
		this.branchNumber = branchNumber;
		this.acctId = acctId;
		this.custGenerated = custGenerated;
		this.fieldNum = fieldNum;
		this.offInitials = offInitials;
		this.newData = newData;
		this.action = action;
		this.afterPost = afterPost;
	}

	public AccountMaintananceRqDto() {
		super();
	}

}
