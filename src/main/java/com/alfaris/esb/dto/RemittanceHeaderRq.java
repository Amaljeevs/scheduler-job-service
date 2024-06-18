package com.alfaris.esb.dto;

public class RemittanceHeaderRq {

	private String msgFormat;
    private int msgVersion;
    private String requestorChannelId;
    private int requestorChannelFunction;
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
	
	public RemittanceHeaderRq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RemittanceHeaderRq(String msgFormat, int msgVersion, String requestorChannelId, int requestorChannelFunction) {
		super();
		this.msgFormat = msgFormat;
		this.msgVersion = msgVersion;
		this.requestorChannelId = requestorChannelId;
		this.requestorChannelFunction = requestorChannelFunction;
	}
	@Override
	public String toString() {
		return "RemittanceHeaderRq [msgFormat=" + msgFormat + ", msgVersion=" + msgVersion + ", requestorChannelId="
				+ requestorChannelId + ", requestorChannelFunction=" + requestorChannelFunction + "]";
	}
	
	
    
}
