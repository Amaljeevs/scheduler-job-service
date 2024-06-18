package com.alfaris.esb.dto;

public class CustomerDetailsRsDto {

	private String descriptionEn;

	private String returnCode;

	private String customerName;

	private String custNameAr;

	private String crNumber;

	private String crExpDate;

	private String contactDetails;

	private String phone;

	private String email;

	private String address;

	private String rmName;

	private String rmEmail;

	private String rmMobile;

	private String rmRbExtension;

	private String rmRbPhone;

	private String customerSegment;

	private String customerRegion;

	private String cis;

	public String getCis() {
		return cis;
	}

	public String getCustNameAr() {
		return custNameAr;
	}

	public void setCustNameAr(String custNameAr) {
		this.custNameAr = custNameAr;
	}

	public void setCis(String cis) {
		this.cis = cis;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCrNumber() {
		return crNumber;
	}

	public void setCrNumber(String crNumber) {
		this.crNumber = crNumber;
	}

	public String getCrExpDate() {
		return crExpDate;
	}

	public void setCrExpDate(String crExpDate) {
		this.crExpDate = crExpDate;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getRmEmail() {
		return rmEmail;
	}

	public void setRmEmail(String rmEmail) {
		this.rmEmail = rmEmail;
	}

	public String getRmMobile() {
		return rmMobile;
	}

	public void setRmMobile(String rmMobile) {
		this.rmMobile = rmMobile;
	}

	public String getRmRbExtension() {
		return rmRbExtension;
	}

	public void setRmRbExtension(String rmRbExtension) {
		this.rmRbExtension = rmRbExtension;
	}

	public String getRmRbPhone() {
		return rmRbPhone;
	}

	public void setRmRbPhone(String rmRbPhone) {
		this.rmRbPhone = rmRbPhone;
	}

	public String getCustomerSegment() {
		return customerSegment;
	}

	public void setCustomerSegment(String customerSegment) {
		this.customerSegment = customerSegment;
	}

	public String getCustomerRegion() {
		return customerRegion;
	}

	public void setCustomerRegion(String customerRegion) {
		this.customerRegion = customerRegion;
	}

	public String getDescriptionEn() {
		return descriptionEn;
	}

	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public CustomerDetailsRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetailsRsDto(String descriptionEn, String returnCode, String customerName, String custNameAr,
			String crNumber, String crExpDate, String contactDetails, String phone, String email, String address,
			String rmName, String rmEmail, String rmMobile, String rmRbExtension, String rmRbPhone,
			String customerSegment, String customerRegion, String cis) {
		super();
		this.descriptionEn = descriptionEn;
		this.returnCode = returnCode;
		this.customerName = customerName;
		this.custNameAr = custNameAr;
		this.crNumber = crNumber;
		this.crExpDate = crExpDate;
		this.contactDetails = contactDetails;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.rmName = rmName;
		this.rmEmail = rmEmail;
		this.rmMobile = rmMobile;
		this.rmRbExtension = rmRbExtension;
		this.rmRbPhone = rmRbPhone;
		this.customerSegment = customerSegment;
		this.customerRegion = customerRegion;
		this.cis = cis;
	}

}
