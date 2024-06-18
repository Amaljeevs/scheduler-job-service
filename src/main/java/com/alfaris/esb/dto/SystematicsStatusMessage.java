package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SystematicsStatusMessage {
	
	@JsonProperty("replyMessage")
	private String replyMessage;

	public String getReplyMessage() {
		return replyMessage;
	}

	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	@Override
	public String toString() {
		return "SystematicsStatusMessage [replyMessage=" + replyMessage + "]";
	}

	public SystematicsStatusMessage(String replyMessage) {
		super();
		this.replyMessage = replyMessage;
	}

	public SystematicsStatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
