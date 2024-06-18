package com.alfaris.esb.dto;

public class RequestRiyadBankHeader {

	private String msgFormat;

	private int msgVersion;

	private String requestorChannelId;

	private int requestorChannelFunction;

	private String requestorUserId;

	private String cisNumber;

	private String requestorLanguage;

	private String requestorSecurityInfo;

	private int branchNumber;

	private String tellerId;

	private String terminalId;

	private String overrideFlag;

	private int overrideTellerId;

	private String transactionOrigin;

	private int journalSeqNumber;

	private String transactionReference;

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

	public String getRequestorUserId() {
		return requestorUserId;
	}

	public void setRequestorUserId(String requestorUserId) {
		this.requestorUserId = requestorUserId;
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

	public String getTransactionOrigin() {
		return transactionOrigin;
	}

	public void setTransactionOrigin(String transactionOrigin) {
		this.transactionOrigin = transactionOrigin;
	}

	public int getJournalSeqNumber() {
		return journalSeqNumber;
	}

	public void setJournalSeqNumber(int journalSeqNumber) {
		this.journalSeqNumber = journalSeqNumber;
	}

	public String getTransactionReference() {
		return transactionReference;
	}

	public void setTransactionReference(String transactionReference) {
		this.transactionReference = transactionReference;
	}

	@Override
	public String toString() {
		return "RequestRiyadBankHeader [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + ", requestorUserId="
				+ requestorUserId + ", cisNumber=" + cisNumber + ", requestorLanguage=" + requestorLanguage
				+ ", requestorSecurityInfo=" + requestorSecurityInfo + ", branchNumber=" + branchNumber + ", tellerId="
				+ tellerId + ", terminalId=" + terminalId + ", overrideFlag=" + overrideFlag + ", overrideTellerId="
				+ overrideTellerId + ", transactionOrigin=" + transactionOrigin + ", journalSeqNumber="
				+ journalSeqNumber + ", transactionReference=" + transactionReference + "]";
	}

	public RequestRiyadBankHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
