package com.alfaris.esb.dto;

public class MiscCrDrHeaderRq {
	
	 private String msgFormat;
	 private String msgVersion;
	 private String requestorChannelId;
	 private String requestorChannelFunction;
	 private String requestorLanguage;
	 
	 
	public String getMsgFormat() {
		return msgFormat;
	}
	public void setMsgFormat(String msgFormat) {
		this.msgFormat = msgFormat;
	}
	public String getMsgVersion() {
		return msgVersion;
	}
	public void setMsgVersion(String msgVersion) {
		this.msgVersion = msgVersion;
	}
	public String getRequestorChannelId() {
		return requestorChannelId;
	}
	public void setRequestorChannelId(String requestorChannelId) {
		this.requestorChannelId = requestorChannelId;
	}
	public String getRequestorChannelFunction() {
		return requestorChannelFunction;
	}
	public void setRequestorChannelFunction(String requestorChannelFunction) {
		this.requestorChannelFunction = requestorChannelFunction;
	}
	
	public String getRequestorLanguage() {
		return requestorLanguage;
	}
	public void setRequestorLanguage(String requestorLanguage) {
		this.requestorLanguage = requestorLanguage;
	}
	
	public MiscCrDrHeaderRq() {
		super();
	}
	
	@Override
	public String toString() {
		return "MiscCrDrHeaderRq [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + ", requestorLanguage="
				+ requestorLanguage + "]";
	}
	
	
	 
	 

}
