package com.alfaris.esb.dto;

public class AuthTransactionHeaderRq {

	private String msgFormat;
	private float msgVersion;
	private String requestorChannelId;
	private float requestorChannelFunction;
	private float requestorUserId;
	private String requestorLanguage;
	private String requestorSecurityInfo;
	private String userIp;
	private String userLocation;

	public String getMsgFormat() {
		return msgFormat;
	}

	public void setMsgFormat(String msgFormat) {
		this.msgFormat = msgFormat;
	}

	public float getMsgVersion() {
		return msgVersion;
	}

	public void setMsgVersion(float msgVersion) {
		this.msgVersion = msgVersion;
	}

	public String getRequestorChannelId() {
		return requestorChannelId;
	}

	public void setRequestorChannelId(String requestorChannelId) {
		this.requestorChannelId = requestorChannelId;
	}

	public float getRequestorChannelFunction() {
		return requestorChannelFunction;
	}

	public void setRequestorChannelFunction(float requestorChannelFunction) {
		this.requestorChannelFunction = requestorChannelFunction;
	}

	public float getRequestorUserId() {
		return requestorUserId;
	}

	public void setRequestorUserId(float requestorUserId) {
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

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public AuthTransactionHeaderRq() {
		super();
	}

	@Override
	public String toString() {
		return "RiyadBankHeaderRq [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + ", requestorUserId="
				+ requestorUserId + ", requestorLanguage=" + requestorLanguage + ", requestorSecurityInfo="
				+ requestorSecurityInfo + ", userIp=" + userIp + ", userLocation=" + userLocation + "]";
	}
	
	

}
