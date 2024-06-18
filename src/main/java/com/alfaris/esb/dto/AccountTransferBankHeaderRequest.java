package com.alfaris.esb.dto;

public class AccountTransferBankHeaderRequest {

	private String msgFormat;

	private int msgVersion;

	private String requestorChannelId;

	private int requestorChannelFunction;

	private String requestorUserId;

	private String requestorLanguage;

	private String requestorSecurityInfo;

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

	@Override
	public String toString() {
		return "AccountTransferBankHeaderRequest [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion
				+ ", requestorChannelId=" + requestorChannelId + ", requestorChannelFunction="
				+ requestorChannelFunction + ", requestorUserId=" + requestorUserId + ", requestorLanguage="
				+ requestorLanguage + ", requestorSecurityInfo=" + requestorSecurityInfo + "]";
	}

	public AccountTransferBankHeaderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
