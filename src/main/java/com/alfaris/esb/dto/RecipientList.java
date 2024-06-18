package com.alfaris.esb.dto;

public class RecipientList {
	
	private Recipient recipient;

	public Recipient getRecipient() {
		return recipient;
	}

	public void setRecipient(Recipient recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "RecipientList [recipient=" + recipient + "]";
	}

	public RecipientList(Recipient recipient) {
		super();
		this.recipient = recipient;
	}

	public RecipientList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
