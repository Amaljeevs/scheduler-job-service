package com.alfaris.esb.dto;

public class RequestWaselAddress {
	private String streetName;

	private String waselNumber;

	private String postalCode;

	private String mainAcctNo;

	private String city;

	private String additionalCode;

	private String area;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getWaselNumber() {
		return waselNumber;
	}

	public void setWaselNumber(String waselNumber) {
		this.waselNumber = waselNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getMainAcctNo() {
		return mainAcctNo;
	}

	public void setMainAcctNo(String mainAcctNo) {
		this.mainAcctNo = mainAcctNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdditionalCode() {
		return additionalCode;
	}

	public void setAdditionalCode(String additionalCode) {
		this.additionalCode = additionalCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public RequestWaselAddress(String streetName, String waselNumber, String postalCode, String mainAcctNo, String city,
			String additionalCode, String area) {
		super();
		this.streetName = streetName;
		this.waselNumber = waselNumber;
		this.postalCode = postalCode;
		this.mainAcctNo = mainAcctNo;
		this.city = city;
		this.additionalCode = additionalCode;
		this.area = area;
	}

	public RequestWaselAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestWaselAddress [streetName=" + streetName + ", waselNumber=" + waselNumber + ", postalCode="
				+ postalCode + ", mainAcctNo=" + mainAcctNo + ", city=" + city + ", additionalCode=" + additionalCode
				+ ", area=" + area + "]";
	}

}
