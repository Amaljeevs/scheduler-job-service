package com.alfaris.esb.dto;

public class AccountPurposeDetails {

	private String type;
	private String name;
	private String purposeId;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurposeId() {
		return purposeId;
	}

	public void setPurposeId(String purposeId) {
		this.purposeId = purposeId;
	}

	public AccountPurposeDetails(String type, String name, String purposeId) {
		super();
		this.type = type;
		this.name = name;
		this.purposeId = purposeId;
	}

	public AccountPurposeDetails() {
		super();
	}

	@Override
	public String toString() {
		return "AccountPurposeDetails [type=" + type + ", name=" + name + ", purposeId=" + purposeId + "]";
	}

}
