package com.alfaris.esb.dto;

public class AccountBalanceHeaderRq {
	private String msgFormat;
	private int msgVersion;
	private String requestorChannelId;
	private int requestorChannelFunction;
	private String requestorLanguage;
	private String requestorSecurityInfo;
	private String employeeId;

	private String cisNumber;

	private String branchNumber;

	private String mobileNumber;

	private String transactionReference;

	public AccountBalanceHeaderRq(String msgFormat, int msgVersion, String requestorChannelId,
			int requestorChannelFunction, String requestorLanguage,
			String requestorSecurityInfo, String employeeId, String cisNumber, String branchNumber, String mobileNumber,
			String transactionReference) {
		super();
		this.msgFormat = msgFormat;
		this.msgVersion = msgVersion;
		this.requestorChannelId = requestorChannelId;
		this.requestorChannelFunction = requestorChannelFunction;
		this.requestorLanguage = requestorLanguage;
		this.requestorSecurityInfo = requestorSecurityInfo;
		this.employeeId = employeeId;
		this.cisNumber = cisNumber;
		this.branchNumber = branchNumber;
		this.mobileNumber = mobileNumber;
		this.transactionReference = transactionReference;
	}

	public String getMsgFormat() {
		return msgFormat;
	}

	public void setMsgFormat(String msgFormat) {
		this.msgFormat = msgFormat;
	}

	public int getMsgVersion() {
		return msgVersion;
	}

	public void setMsgVersion(int msgVersion) {
		this.msgVersion = msgVersion;
	}

	public String getRequestorChannelId() {
		return requestorChannelId;
	}

	public void setRequestorChannelId(String requestorChannelId) {
		this.requestorChannelId = requestorChannelId;
	}

	public int getRequestorChannelFunction() {
		return requestorChannelFunction;
	}

	public void setRequestorChannelFunction(int requestorChannelFunction) {
		this.requestorChannelFunction = requestorChannelFunction;
	}

	public String getRequestorLanguage() {
		return requestorLanguage;
	}

	public void setRequestorLanguage(String requestorLanguage) {
		this.requestorLanguage = requestorLanguage;
	}

	public String getRequestorSecurityInfo() {
		return requestorSecurityInfo;
	}

	public void setRequestorSecurityInfo(String requestorSecurityInfo) {
		this.requestorSecurityInfo = requestorSecurityInfo;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	public AccountBalanceHeaderRq() {
		super();
		// TODO Auto-generated constructor stub
	}

}
