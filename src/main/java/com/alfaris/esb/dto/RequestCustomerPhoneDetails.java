package com.alfaris.esb.dto;

public class RequestCustomerPhoneDetails {

	private String phoneCountry;

	private String phoneNumber;

	private String ownerFlag;

	private String phoneSource;

	private String phoneTypeCd;

	private String ownerFlagDate;

	private String phoneValidated;

	private String phoneNumberExt;

	private String primary;

	private String phonePreference;

	private String preferredCallTime;

	public String getPhoneCountry() {
		return phoneCountry;
	}

	public void setPhoneCountry(String phoneCountry) {
		this.phoneCountry = phoneCountry;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOwnerFlag() {
		return ownerFlag;
	}

	public void setOwnerFlag(String ownerFlag) {
		this.ownerFlag = ownerFlag;
	}

	public String getPhoneSource() {
		return phoneSource;
	}

	public void setPhoneSource(String phoneSource) {
		this.phoneSource = phoneSource;
	}

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getOwnerFlagDate() {
		return ownerFlagDate;
	}

	public void setOwnerFlagDate(String ownerFlagDate) {
		this.ownerFlagDate = ownerFlagDate;
	}

	public String getPhoneValidated() {
		return phoneValidated;
	}

	public void setPhoneValidated(String phoneValidated) {
		this.phoneValidated = phoneValidated;
	}

	public String getPhoneNumberExt() {
		return phoneNumberExt;
	}

	public void setPhoneNumberExt(String phoneNumberExt) {
		this.phoneNumberExt = phoneNumberExt;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getPhonePreference() {
		return phonePreference;
	}

	public void setPhonePreference(String phonePreference) {
		this.phonePreference = phonePreference;
	}

	public String getPreferredCallTime() {
		return preferredCallTime;
	}

	public void setPreferredCallTime(String preferredCallTime) {
		this.preferredCallTime = preferredCallTime;
	}

	public RequestCustomerPhoneDetails(String phoneCountry, String phoneNumber, String ownerFlag, String phoneSource,
			String phoneTypeCd, String ownerFlagDate, String phoneValidated, String phoneNumberExt, String primary,
			String phonePreference, String preferredCallTime) {
		super();
		this.phoneCountry = phoneCountry;
		this.phoneNumber = phoneNumber;
		this.ownerFlag = ownerFlag;
		this.phoneSource = phoneSource;
		this.phoneTypeCd = phoneTypeCd;
		this.ownerFlagDate = ownerFlagDate;
		this.phoneValidated = phoneValidated;
		this.phoneNumberExt = phoneNumberExt;
		this.primary = primary;
		this.phonePreference = phonePreference;
		this.preferredCallTime = preferredCallTime;
	}

	public RequestCustomerPhoneDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestCustomerPhoneDetails [phoneCountry=" + phoneCountry + ", phoneNumber=" + phoneNumber
				+ ", ownerFlag=" + ownerFlag + ", phoneSource=" + phoneSource + ", phoneTypeCd=" + phoneTypeCd
				+ ", ownerFlagDate=" + ownerFlagDate + ", phoneValidated=" + phoneValidated + ", phoneNumberExt="
				+ phoneNumberExt + ", primary=" + primary + ", phonePreference=" + phonePreference
				+ ", preferredCallTime=" + preferredCallTime + "]";
	}

}
