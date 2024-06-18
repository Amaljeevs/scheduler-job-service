package com.alfaris.esb.dto;

public class GetCustomerDetailsBankHeaderRequest {

	private String msgFormat;
	private int msgVersion;
	private int journalSeqNumber;
	private int branchNumber;
	private String tellerId;
	private String terminalId;
	private String overrideFlag;
	private int overrideTellerId;
	private String requestorUserId;
	private String requestorChannelId;
	private int requestorChannelFunction;
	private String cisNumber;
	private String requestorLanguage;
	private String requestorSecurityInfo;
	

	public String getRequestorUserId() {
		return requestorUserId;
	}

	public void setRequestorUserId(String requestorUserId) {
		this.requestorUserId = requestorUserId;
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

	public int getJournalSeqNumber() {
		return journalSeqNumber;
	}

	public void setJournalSeqNumber(int journalSeqNumber) {
		this.journalSeqNumber = journalSeqNumber;
	}

	public int getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getTellerId() {
		return tellerId;
	}

	public void setTellerId(String tellerId) {
		this.tellerId = tellerId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getOverrideFlag() {
		return overrideFlag;
	}

	public void setOverrideFlag(String overrideFlag) {
		this.overrideFlag = overrideFlag;
	}

	public int getOverrideTellerId() {
		return overrideTellerId;
	}

	public void setOverrideTellerId(int overrideTellerId) {
		this.overrideTellerId = overrideTellerId;
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

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
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

	public GetCustomerDetailsBankHeaderRequest(String msgFormat, int msgVersion, int journalSeqNumber, int branchNumber,
			String tellerId, String terminalId, String overrideFlag, int overrideTellerId, String requestorChannelId,
			int requestorChannelFunction, String cisNumber, String requestorLanguage, String requestorSecurityInfo) {
		super();
		this.msgFormat = msgFormat;
		this.msgVersion = msgVersion;
		this.journalSeqNumber = journalSeqNumber;
		this.branchNumber = branchNumber;
		this.tellerId = tellerId;
		this.terminalId = terminalId;
		this.overrideFlag = overrideFlag;
		this.overrideTellerId = overrideTellerId;
		this.requestorChannelId = requestorChannelId;
		this.requestorChannelFunction = requestorChannelFunction;
		this.cisNumber = cisNumber;
		this.requestorLanguage = requestorLanguage;
		this.requestorSecurityInfo = requestorSecurityInfo;
	}

	public GetCustomerDetailsBankHeaderRequest() {
		super();
	}

	@Override
	public String toString() {
		return "RequestRiyadBankHeader [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", journalSeqNumber="
				+ journalSeqNumber + ", branchNumber=" + branchNumber + ", tellerId=" + tellerId + ", terminalId="
				+ terminalId + ", overrideFlag=" + overrideFlag + ", overrideTellerId=" + overrideTellerId
				+ ", requestorChannelId=" + requestorChannelId + ", requestorChannelFunction="
				+ requestorChannelFunction + ", cisNumber=" + cisNumber + ", requestorLanguage=" + requestorLanguage
				+ ", requestorSecurityInfo=" + requestorSecurityInfo + "]";
	}

}
