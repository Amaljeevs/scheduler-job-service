package com.alfaris.esb.dto;

public class EscrowAccountsApiAddRemoveRqDTO {
	
	private AddRemoveRequestHeader riyadBankHeader;
	
	private String messageId;
	
	private String mode;
	
	private String channelId;
	
	private String currentAccount;
	
	private String project_No;

	public AddRemoveRequestHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AddRemoveRequestHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	public String getProject_No() {
		return project_No;
	}

	public void setProject_No(String project_No) {
		this.project_No = project_No;
	}

	public EscrowAccountsApiAddRemoveRqDTO(AddRemoveRequestHeader riyadBankHeader, String messageId, String mode,
			String channelId, String currentAccount, String project_No) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.messageId = messageId;
		this.mode = mode;
		this.channelId = channelId;
		this.currentAccount = currentAccount;
		this.project_No = project_No;
	}

	public EscrowAccountsApiAddRemoveRqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EscrowAccountsApiAddRemoveRqDTO [riyadBankHeader=" + riyadBankHeader + ", messageId=" + messageId
				+ ", mode=" + mode + ", channelId=" + channelId + ", currentAccount=" + currentAccount + ", project_No="
				+ project_No + "]";
	}


	
	

}
