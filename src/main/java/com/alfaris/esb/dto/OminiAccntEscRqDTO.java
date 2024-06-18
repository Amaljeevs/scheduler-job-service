package com.alfaris.esb.dto;

public class OminiAccntEscRqDTO {
	
	private String virtualAccount;
	
	private String cisNumber;

	public String getVirtualAccount() {
		return virtualAccount;
	}

	public void setVirtualAccount(String virtualAccount) {
		this.virtualAccount = virtualAccount;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	@Override
	public String toString() {
		return "OminiAccntEscRqDTO [virtualAccount=" + virtualAccount + ", cisNumber=" + cisNumber + "]";
	}

	public OminiAccntEscRqDTO(String virtualAccount, String cisNumber) {
		super();
		this.virtualAccount = virtualAccount;
		this.cisNumber = cisNumber;
	}

	public OminiAccntEscRqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
