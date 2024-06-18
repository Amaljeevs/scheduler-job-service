package com.alfaris.esb.dto;

public class AccBalReqDTO {

	private String accountNum;

	private String accType;

	private String discId;
	
	private String userId;
	

	

	public AccBalReqDTO(String accountNum, String accType, String discId, String userId) {
		super();
		this.accountNum = accountNum;
		this.accType = accType;
		this.discId = discId;
		this.userId = userId;
	}



	@Override
	public String toString() {
		return "AccBalReqDTO [accountNum=" + accountNum + ", accType=" + accType + ", discId=" + discId + ", userId="
				+ userId + "]";
	}



	public String getAccountNum() {
		return accountNum;
	}



	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}



	public String getAccType() {
		return accType;
	}



	public void setAccType(String accType) {
		this.accType = accType;
	}



	public String getDiscId() {
		return discId;
	}



	public void setDiscId(String discId) {
		this.discId = discId;
	}



	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public AccBalReqDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
