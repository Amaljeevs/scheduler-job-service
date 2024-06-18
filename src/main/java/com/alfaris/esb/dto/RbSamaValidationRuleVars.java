package com.alfaris.esb.dto;

public class RbSamaValidationRuleVars {
	private int userId;
    private int cisNumber;
    private String channelId;
    private String flowId;
    private int mode;
    private long accountIdentifier;
    private String currencyId;
    private String transactionType;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCisNumber() {
		return cisNumber;
	}
	public void setCisNumber(int cisNumber) {
		this.cisNumber = cisNumber;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getFlowId() {
		return flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int mode) {
		this.mode = mode;
	}
	public long getAccountIdentifier() {
		return accountIdentifier;
	}
	public void setAccountIdentifier(long accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public RbSamaValidationRuleVars(int userId, int cisNumber, String channelId, String flowId, int mode,
			long accountIdentifier, String currencyId, String transactionType) {
		super();
		this.userId = userId;
		this.cisNumber = cisNumber;
		this.channelId = channelId;
		this.flowId = flowId;
		this.mode = mode;
		this.accountIdentifier = accountIdentifier;
		this.currencyId = currencyId;
		this.transactionType = transactionType;
	}
	public RbSamaValidationRuleVars() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RbSamaValidationRuleVars [userId=" + userId + ", cisNumber=" + cisNumber + ", channelId=" + channelId
				+ ", flowId=" + flowId + ", mode=" + mode + ", accountIdentifier=" + accountIdentifier + ", currencyId="
				+ currencyId + ", transactionType=" + transactionType + "]";
	}
    

}
