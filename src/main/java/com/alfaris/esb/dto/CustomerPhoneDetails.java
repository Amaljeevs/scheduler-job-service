package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerPhoneDetails {

	@JsonProperty("phoneTypeCd")
	private String phoneTypeCd;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	private String phoneNumberExt;

	private String phonePreference;

	private String preferredCallTime;

	private String phoneStatus;

	private String contactName;

	private String primary;

	private String validated;

	private String phoneCountry;

	private String ownerFlag;

	private String ownerFlagDate;

	public String getPhoneTypeCd() {
		return phoneTypeCd;
	}

	public void setPhoneTypeCd(String phoneTypeCd) {
		this.phoneTypeCd = phoneTypeCd;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumberExt() {
		return phoneNumberExt;
	}

	public void setPhoneNumberExt(String phoneNumberExt) {
		this.phoneNumberExt = phoneNumberExt;
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

	public String getPhoneStatus() {
		return phoneStatus;
	}

	public void setPhoneStatus(String phoneStatus) {
		this.phoneStatus = phoneStatus;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public String getValidated() {
		return validated;
	}

	public void setValidated(String validated) {
		this.validated = validated;
	}

	public String getPhoneCountry() {
		return phoneCountry;
	}

	public void setPhoneCountry(String phoneCountry) {
		this.phoneCountry = phoneCountry;
	}

	public String getOwnerFlag() {
		return ownerFlag;
	}

	public void setOwnerFlag(String ownerFlag) {
		this.ownerFlag = ownerFlag;
	}

	public String getOwnerFlagDate() {
		return ownerFlagDate;
	}

	public void setOwnerFlagDate(String ownerFlagDate) {
		this.ownerFlagDate = ownerFlagDate;
	}

	@Override
	public String toString() {
		return "CustomerPhoneDetails [phoneTypeCd=" + phoneTypeCd + ", phoneNumber=" + phoneNumber + ", phoneNumberExt="
				+ phoneNumberExt + ", phonePreference=" + phonePreference + ", preferredCallTime=" + preferredCallTime
				+ ", phoneStatus=" + phoneStatus + ", contactName=" + contactName + ", primary=" + primary
				+ ", validated=" + validated + ", phoneCountry=" + phoneCountry + ", ownerFlag=" + ownerFlag
				+ ", ownerFlagDate=" + ownerFlagDate + "]";
	}

	public CustomerPhoneDetails(String phoneTypeCd, String phoneNumber, String phoneNumberExt,
			String phonePreference, String preferredCallTime, String phoneStatus, String contactName,
			String primary, String validated, String phoneCountry, String ownerFlag,
			String ownerFlagDate) {
		super();
		this.phoneTypeCd = phoneTypeCd;
		this.phoneNumber = phoneNumber;
		this.phoneNumberExt = phoneNumberExt;
		this.phonePreference = phonePreference;
		this.preferredCallTime = preferredCallTime;
		this.phoneStatus = phoneStatus;
		this.contactName = contactName;
		this.primary = primary;
		this.validated = validated;
		this.phoneCountry = phoneCountry;
		this.ownerFlag = ownerFlag;
		this.ownerFlagDate = ownerFlagDate;
	}

	public CustomerPhoneDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
