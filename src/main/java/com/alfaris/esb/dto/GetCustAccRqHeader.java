package com.alfaris.esb.dto;

public class GetCustAccRqHeader {
	
	private String msgFormat;
	private int msgVersion;
	private String requestorChannelId;
	private int requestorChannelFunction;
	private String requestorUserId;
	private String requestorLanguage;
	private String requestorSecurityInfo;
	private String asiReturnCode;
	private String cisNumber;
	private int branchNumber;
	private String tellerId;
	private String terminalId;
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
	public String getAsiReturnCode() {
		return asiReturnCode;
	}
	public void setAsiReturnCode(String asiReturnCode) {
		this.asiReturnCode = asiReturnCode;
	}
	public String getCisNumber() {
		return cisNumber;
	}
	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
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
	@Override
	public String toString() {
		return "GetCustAccRqHeader [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + ", requestorUserId="
				+ requestorUserId + ", requestorLanguage=" + requestorLanguage + ", requestorSecurityInfo="
				+ requestorSecurityInfo + ", asiReturnCode=" + asiReturnCode + ", cisNumber=" + cisNumber
				+ ", branchNumber=" + branchNumber + ", tellerId=" + tellerId + ", terminalId=" + terminalId + "]";
	}
	public GetCustAccRqHeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	

}
