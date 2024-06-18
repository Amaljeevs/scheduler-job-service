package com.alfaris.esb.dto;

public class AuthTransactionRq {

	AuthTransactionHeaderRq riyadBankHeader;
	private float mode;
	AuthenticationDetails authenticationDetails;
	AuthTransactionDetails transactionDetails;
	private String deviceType;

	public AuthTransactionHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AuthTransactionHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public float getMode() {
		return mode;
	}

	public void setMode(float mode) {
		this.mode = mode;
	}

	public AuthenticationDetails getAuthenticationDetails() {
		return authenticationDetails;
	}

	public void setAuthenticationDetails(AuthenticationDetails authenticationDetails) {
		this.authenticationDetails = authenticationDetails;
	}

	public AuthTransactionDetails getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(AuthTransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public AuthTransactionRq() {
		super();
	}

	@Override
	public String toString() {
		return "AuthTransactionRq [riyadBankHeader=" + riyadBankHeader + ", mode=" + mode + ", authenticationDetails="
				+ authenticationDetails + ", transactionDetails=" + transactionDetails + ", deviceType=" + deviceType
				+ "]";
	}
	
	

}
