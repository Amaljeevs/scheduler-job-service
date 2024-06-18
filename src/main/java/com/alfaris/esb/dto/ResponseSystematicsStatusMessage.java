package com.alfaris.esb.dto;

public class ResponseSystematicsStatusMessage {

	private String replyMessage;

	public String getReplyMessage() {
		return replyMessage;
	}

	public void setReplyMessage(String replyMessage) {
		this.replyMessage = replyMessage;
	}

	public ResponseSystematicsStatusMessage(String replyMessage) {
		super();
		this.replyMessage = replyMessage;
	}

	public ResponseSystematicsStatusMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ResponseSystematicsStatusMessage [replyMessage=" + replyMessage + "]";
	}

}
