package com.alfaris.esb.dto;

public class CustAccountReqDTO {

	private String userId;
	
	private String cisNumber;


	public CustAccountReqDTO(String userId, String cisNumber, String acctNumber, String idType, String custId) {
		super();
		this.userId = userId;
		this.cisNumber = cisNumber;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getCisNumber() {
		return cisNumber;
	}


	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}




	public CustAccountReqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
