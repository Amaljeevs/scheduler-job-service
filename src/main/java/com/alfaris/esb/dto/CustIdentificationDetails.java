package com.alfaris.esb.dto;

public class CustIdentificationDetails {

	private String idType;
	private String custId;
	private String idDateType;
	private String idExpiryDate;
	private String idExpiryDateH;
	private String idIssuedDate;
	private String idIssuedDateH;
	private String idIssuedPlace;
	private String idPrintedName;
	private String idTypeFlag;

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

	public String getIdDateType() {
		return idDateType;
	}

	public void setIdDateType(String idDateType) {
		this.idDateType = idDateType;
	}

	public String getIdExpiryDate() {
		return idExpiryDate;
	}

	public void setIdExpiryDate(String idExpiryDate) {
		this.idExpiryDate = idExpiryDate;
	}

	public String getIdExpiryDateH() {
		return idExpiryDateH;
	}

	public void setIdExpiryDateH(String idExpiryDateH) {
		this.idExpiryDateH = idExpiryDateH;
	}

	public String getIdIssuedDate() {
		return idIssuedDate;
	}

	public void setIdIssuedDate(String idIssuedDate) {
		this.idIssuedDate = idIssuedDate;
	}

	public String getIdIssuedDateH() {
		return idIssuedDateH;
	}

	public void setIdIssuedDateH(String idIssuedDateH) {
		this.idIssuedDateH = idIssuedDateH;
	}

	public String getIdIssuedPlace() {
		return idIssuedPlace;
	}

	public void setIdIssuedPlace(String idIssuedPlace) {
		this.idIssuedPlace = idIssuedPlace;
	}

	public String getIdPrintedName() {
		return idPrintedName;
	}

	public void setIdPrintedName(String idPrintedName) {
		this.idPrintedName = idPrintedName;
	}

	public String getIdTypeFlag() {
		return idTypeFlag;
	}

	public void setIdTypeFlag(String idTypeFlag) {
		this.idTypeFlag = idTypeFlag;
	}

	public CustIdentificationDetails(String idType, String custId, String idDateType, String idExpiryDate,
			String idExpiryDateH, String idIssuedDate, String idIssuedDateH, String idIssuedPlace, String idPrintedName,
			String idTypeFlag) {
		super();
		this.idType = idType;
		this.custId = custId;
		this.idDateType = idDateType;
		this.idExpiryDate = idExpiryDate;
		this.idExpiryDateH = idExpiryDateH;
		this.idIssuedDate = idIssuedDate;
		this.idIssuedDateH = idIssuedDateH;
		this.idIssuedPlace = idIssuedPlace;
		this.idPrintedName = idPrintedName;
		this.idTypeFlag = idTypeFlag;
	}

	public CustIdentificationDetails() {
		super();
	}

	@Override
	public String toString() {
		return "CustIdentificationDetails [idType=" + idType + ", custId=" + custId + ", idDateType=" + idDateType
				+ ", idExpiryDate=" + idExpiryDate + ", idExpiryDateH=" + idExpiryDateH + ", idIssuedDate="
				+ idIssuedDate + ", idIssuedDateH=" + idIssuedDateH + ", idIssuedPlace=" + idIssuedPlace
				+ ", idPrintedName=" + idPrintedName + ", idTypeFlag=" + idTypeFlag + "]";
	}

}
