package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerIdentificationDet {
	
	@JsonProperty("idType")
	private String idtype;
	
	@JsonProperty("custId")
	private String custId;
	
	@JsonProperty("idDateType")
	private String idDateType;
	
	@JsonProperty("idExpiryDate")
	private String idExpiryDate;
	
	@JsonProperty("idExpiryDateH")
	private String idExpiryDateH;
	
	@JsonProperty("idIssuedDate")
	private String idIssuedDate;
	
	@JsonProperty("idIssuedPlace")
	private String idIssuedPlace;
	
	@JsonProperty("idIssuedDateH")
	private String idIssuedDateH;
	
	@JsonProperty("idPrintedName")
	private String idPrintedName;
	
	@JsonProperty("idTypeFlag")
	private String idTypeFlag;

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
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

	@Override
	public String toString() {
		return "CustomerIdentificationDet [idtype=" + idtype + ", custId=" + custId + ", idDateType=" + idDateType
				+ ", idExpiryDate=" + idExpiryDate + ", idExpiryDateH=" + idExpiryDateH + ", idIssuedDate="
				+ idIssuedDate + ", idIssuedPlace=" + idIssuedPlace + ", idPrintedName=" + idPrintedName
				+ ", idTypeFlag=" + idTypeFlag + "]";
	}

	public CustomerIdentificationDet(String idtype, String custId, String idDateType, String idExpiryDate,
			String idExpiryDateH, String idIssuedDate, String idIssuedPlace, String idPrintedName, String idTypeFlag) {
		super();
		this.idtype = idtype;
		this.custId = custId;
		this.idDateType = idDateType;
		this.idExpiryDate = idExpiryDate;
		this.idExpiryDateH = idExpiryDateH;
		this.idIssuedDate = idIssuedDate;
		this.idIssuedPlace = idIssuedPlace;
		this.idPrintedName = idPrintedName;
		this.idTypeFlag = idTypeFlag;
	}

	public CustomerIdentificationDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
