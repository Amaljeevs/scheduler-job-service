package com.alfaris.esb.dto;

public class StmGetCustDetailsEscRq {

	private int custNbr;

	private String idType;

	private String idNumber;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getCustNbr() {
		return custNbr;
	}

	public void setCustNbr(int custNbr) {
		this.custNbr = custNbr;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "StmGetCustDetailsEscRq [custNbr=" + custNbr + ", idType=" + idType + ", idNumber=" + idNumber + "]";
	}

	public StmGetCustDetailsEscRq(int custNbr, String idType, String idNumber, String userId) {
		super();
		this.custNbr = custNbr;
		this.idType = idType;
		this.idNumber = idNumber;
		this.userId = userId;
	}

}
