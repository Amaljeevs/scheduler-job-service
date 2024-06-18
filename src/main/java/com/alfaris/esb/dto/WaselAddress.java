package com.alfaris.esb.dto;

public class WaselAddress {

	private String waselAcctNo;
	private String waselNumber;
	private String waselPostal;
	private String waselAddlCode;
	private String waselCity;
	private String waselUnit;
	private String relatedPartyAction;
	private String waselStreet;
	private String waselDistrict;

	public String getWaselAcctNo() {
		return waselAcctNo;
	}

	public void setWaselAcctNo(String waselAcctNo) {
		this.waselAcctNo = waselAcctNo;
	}

	public String getWaselNumber() {
		return waselNumber;
	}

	public void setWaselNumber(String waselNumber) {
		this.waselNumber = waselNumber;
	}

	public String getWaselPostal() {
		return waselPostal;
	}

	public void setWaselPostal(String waselPostal) {
		this.waselPostal = waselPostal;
	}

	public String getWaselAddlCode() {
		return waselAddlCode;
	}

	public void setWaselAddlCode(String waselAddlCode) {
		this.waselAddlCode = waselAddlCode;
	}

	public String getWaselCity() {
		return waselCity;
	}

	public void setWaselCity(String waselCity) {
		this.waselCity = waselCity;
	}

	public String getWaselUnit() {
		return waselUnit;
	}

	public void setWaselUnit(String waselUnit) {
		this.waselUnit = waselUnit;
	}

	public String getRelatedPartyAction() {
		return relatedPartyAction;
	}

	public void setRelatedPartyAction(String relatedPartyAction) {
		this.relatedPartyAction = relatedPartyAction;
	}

	public String getWaselStreet() {
		return waselStreet;
	}

	public void setWaselStreet(String waselStreet) {
		this.waselStreet = waselStreet;
	}

	public String getWaselDistrict() {
		return waselDistrict;
	}

	public void setWaselDistrict(String waselDistrict) {
		this.waselDistrict = waselDistrict;
	}

	public WaselAddress(String waselAcctNo, String waselNumber, String waselPostal, String waselAddlCode,
			String waselCity, String waselUnit, String relatedPartyAction, String waselStreet, String waselDistrict) {
		super();
		this.waselAcctNo = waselAcctNo;
		this.waselNumber = waselNumber;
		this.waselPostal = waselPostal;
		this.waselAddlCode = waselAddlCode;
		this.waselCity = waselCity;
		this.waselUnit = waselUnit;
		this.relatedPartyAction = relatedPartyAction;
		this.waselStreet = waselStreet;
		this.waselDistrict = waselDistrict;
	}

	public WaselAddress() {
		super();
	}

	@Override
	public String toString() {
		return "WaselAddress [waselAcctNo=" + waselAcctNo + ", waselNumber=" + waselNumber + ", waselPostal="
				+ waselPostal + ", waselAddlCode=" + waselAddlCode + ", waselCity=" + waselCity + ", waselUnit="
				+ waselUnit + ", relatedPartyAction=" + relatedPartyAction + ", waselStreet=" + waselStreet
				+ ", waselDistrict=" + waselDistrict + "]";
	}

}
