package com.alfaris.esb.dto;

public class EscrowAccountsApiAddRemoveRsDTO {
	
	private String responseCode;
	
	private String responseDesc;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDesc() {
		return responseDesc;
	}

	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}

	@Override
	public String toString() {
		return "EscrowAccountsApiAddRemoveRsDTO [responseCode=" + responseCode + ", responseDesc=" + responseDesc + "]";
	}

	public EscrowAccountsApiAddRemoveRsDTO(String responseCode, String responseDesc) {
		super();
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
	}

	public EscrowAccountsApiAddRemoveRsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
