package com.alfaris.esb.dto;

public class AddlInfo {

	private String firstName;
	private String lastName;
	private String middleName;
	private String maidenName;
	private String relationship;
	private String mobileNumber;
	private String landLineNumber;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMaidenName() {
		return maidenName;
	}

	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLandLineNumber() {
		return landLineNumber;
	}

	public void setLandLineNumber(String landLineNumber) {
		this.landLineNumber = landLineNumber;
	}

	public AddlInfo(String firstName, String lastName, String middleName, String maidenName, String relationship,
			String mobileNumber, String landLineNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.maidenName = maidenName;
		this.relationship = relationship;
		this.mobileNumber = mobileNumber;
		this.landLineNumber = landLineNumber;
	}

	public AddlInfo() {
		super();
	}

	@Override
	public String toString() {
		return "AddlInfo [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", maidenName=" + maidenName + ", relationship=" + relationship + ", mobileNumber=" + mobileNumber
				+ ", landLineNumber=" + landLineNumber + "]";
	}

}
