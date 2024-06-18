package com.alfaris.esb.dto;

public class SecondaryAdresses {

	private String adress;
	private String addressSeqNumber;
	private String poBox;
	private String zip;
	private String addressCity;
	private String country;
	private String county;
	private String address1;
	private String address2;
	private String address3;
	private String address4;
	private String unitNo;
	private String stateRegion;
	private String addressStatus;
	private String addressTypeCode;
	private String addressStartDate;
	private String addressEndDate;
	private String contactName;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getAddressSeqNumber() {
		return addressSeqNumber;
	}

	public void setAddressSeqNumber(String addressSeqNumber) {
		this.addressSeqNumber = addressSeqNumber;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getUnitNo() {
		return unitNo;
	}

	public void setUnitNo(String unitNo) {
		this.unitNo = unitNo;
	}

	public String getStateRegion() {
		return stateRegion;
	}

	public void setStateRegion(String stateRegion) {
		this.stateRegion = stateRegion;
	}

	public String getAddressStatus() {
		return addressStatus;
	}

	public void setAddressStatus(String addressStatus) {
		this.addressStatus = addressStatus;
	}

	public String getAddressTypeCode() {
		return addressTypeCode;
	}

	public void setAddressTypeCode(String addressTypeCode) {
		this.addressTypeCode = addressTypeCode;
	}

	public String getAddressStartDate() {
		return addressStartDate;
	}

	public void setAddressStartDate(String addressStartDate) {
		this.addressStartDate = addressStartDate;
	}

	public String getAddressEndDate() {
		return addressEndDate;
	}

	public void setAddressEndDate(String addressEndDate) {
		this.addressEndDate = addressEndDate;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public SecondaryAdresses(String adress, String addressSeqNumber, String poBox, String zip, String addressCity,
			String country, String county, String address1, String address2, String address3, String address4,
			String unitNo, String stateRegion, String addressStatus, String addressTypeCode, String addressStartDate,
			String addressEndDate, String contactName) {
		super();
		this.adress = adress;
		this.addressSeqNumber = addressSeqNumber;
		this.poBox = poBox;
		this.zip = zip;
		this.addressCity = addressCity;
		this.country = country;
		this.county = county;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.unitNo = unitNo;
		this.stateRegion = stateRegion;
		this.addressStatus = addressStatus;
		this.addressTypeCode = addressTypeCode;
		this.addressStartDate = addressStartDate;
		this.addressEndDate = addressEndDate;
		this.contactName = contactName;
	}

	public SecondaryAdresses() {
		super();
	}

	@Override
	public String toString() {
		return "SecondaryAdresses [adress=" + adress + ", addressSeqNumber=" + addressSeqNumber + ", poBox=" + poBox
				+ ", zip=" + zip + ", addressCity=" + addressCity + ", country=" + country + ", county=" + county
				+ ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", address4="
				+ address4 + ", unitNo=" + unitNo + ", stateRegion=" + stateRegion + ", addressStatus=" + addressStatus
				+ ", addressTypeCode=" + addressTypeCode + ", addressStartDate=" + addressStartDate
				+ ", addressEndDate=" + addressEndDate + ", contactName=" + contactName + "]";
	}

}
