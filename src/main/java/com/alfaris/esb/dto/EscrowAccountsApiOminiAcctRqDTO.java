package com.alfaris.esb.dto;

public class EscrowAccountsApiOminiAcctRqDTO {
	
	private OminiAcctRequestHeader riyadBankHeader;
	
	private String messageId;
	
	private String channelId;
	
	private String virtualAccount;

	public OminiAcctRequestHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(OminiAcctRequestHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(String virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public EscrowAccountsApiOminiAcctRqDTO(OminiAcctRequestHeader riyadBankHeader, String messageId, String channelId,
			String virtualAccount) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.messageId = messageId;
		this.channelId = channelId;
		this.virtualAccount = virtualAccount;
	}

	public EscrowAccountsApiOminiAcctRqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EscrowAccountsApiOminiAcctRq [riyadBankHeader=" + riyadBankHeader + ", messageId=" + messageId
				+ ", channelId=" + channelId + ", virtualAccount=" + virtualAccount + "]";
	}
	
	
	

}
