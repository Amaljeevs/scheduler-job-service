package com.alfaris.esb.dto;

public class RemittanceSystematicsStatusMessage {
	private String replyMessage;

	public String getReplyMessage() {
		return replyMessage;
	}

	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	public RemittanceSystematicsStatusMessage(String replyMessage) {
		super();
		this.replyMessage = replyMessage;
	}

	public RemittanceSystematicsStatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SystematicsStatusMessage [replyMessage=" + replyMessage + "]";
	}
	 

}
