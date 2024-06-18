package com.alfaris.esb.dto;

public class RequestCustIdentificationDetails {

	private String idExpiryDate;

	private String idIssuedPlace;

	private String idIssuedDateH;

	private String idDateType;

	private String idType;

	private String idIssuedDate;

	private String custId;

	public String getIdExpiryDate() {
		return idExpiryDate;
	}

	public void setIdExpiryDate(String idExpiryDate) {
		this.idExpiryDate = idExpiryDate;
	}

	public String getIdIssuedPlace() {
		return idIssuedPlace;
	}

	public void setIdIssuedPlace(String idIssuedPlace) {
		this.idIssuedPlace = idIssuedPlace;
	}

	public String getIdIssuedDateH() {
		return idIssuedDateH;
	}

	public void setIdIssuedDateH(String idIssuedDateH) {
		this.idIssuedDateH = idIssuedDateH;
	}

	public String getIdDateType() {
		return idDateType;
	}

	public void setIdDateType(String idDateType) {
		this.idDateType = idDateType;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdIssuedDate() {
		return idIssuedDate;
	}

	public void setIdIssuedDate(String idIssuedDate) {
		this.idIssuedDate = idIssuedDate;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public RequestCustIdentificationDetails(String idExpiryDate, String idIssuedPlace, String idIssuedDateH,
			String idDateType, String idType, String idIssuedDate, String custId) {
		super();
		this.idExpiryDate = idExpiryDate;
		this.idIssuedPlace = idIssuedPlace;
		this.idIssuedDateH = idIssuedDateH;
		this.idDateType = idDateType;
		this.idType = idType;
		this.idIssuedDate = idIssuedDate;
		this.custId = custId;
	}

	public RequestCustIdentificationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestCustIdentificationDetails [idExpiryDate=" + idExpiryDate + ", idIssuedPlace=" + idIssuedPlace
				+ ", idIssuedDateH=" + idIssuedDateH + ", idDateType=" + idDateType + ", idType=" + idType
				+ ", idIssuedDate=" + idIssuedDate + ", custId=" + custId + "]";
	}

}
