package com.alfaris.esb.dto;

public class AuthTransactionDetails {

	private float functionCode;
	private String tokenId;

	public float getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(float functionCode) {
		this.functionCode = functionCode;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public AuthTransactionDetails() {
		super();
	}

	@Override
	public String toString() {
		return "TransactionDetails [functionCode=" + functionCode + ", tokenId=" + tokenId + "]";
	}
	
	

}
