package com.alfaris.esb.dto;

public class CustIdDetails {

	private String idType;

	private String custId;

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "CustIdDetails [idType=" + idType + ", custId=" + custId + "]";
	}

	public CustIdDetails(String idType, String custId) {
		super();
		this.idType = idType;
		this.custId = custId;
	}

	public CustIdDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
