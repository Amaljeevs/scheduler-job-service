package com.alfaris.esb.dto;

public class FormatSamaReason {

	private String idInvalid;
	private String idExpired;
	private String idRequired;
	private String lostContact;
	private String missingDocFlag;
	private String samaOverrideIdExpired;
	private String riskRevFlag;

	public String getIdInvalid() {
		return idInvalid;
	}

	public void setIdInvalid(String idInvalid) {
		this.idInvalid = idInvalid;
	}

	public String getIdExpired() {
		return idExpired;
	}

	public void setIdExpired(String idExpired) {
		this.idExpired = idExpired;
	}

	public String getIdRequired() {
		return idRequired;
	}

	public void setIdRequired(String idRequired) {
		this.idRequired = idRequired;
	}

	public String getLostContact() {
		return lostContact;
	}

	public void setLostContact(String lostContact) {
		this.lostContact = lostContact;
	}

	public String getMissingDocFlag() {
		return missingDocFlag;
	}

	public void setMissingDocFlag(String missingDocFlag) {
		this.missingDocFlag = missingDocFlag;
	}

	public String getSamaOverrideIdExpired() {
		return samaOverrideIdExpired;
	}

	public void setSamaOverrideIdExpired(String samaOverrideIdExpired) {
		this.samaOverrideIdExpired = samaOverrideIdExpired;
	}

	public String getRiskRevFlag() {
		return riskRevFlag;
	}

	public void setRiskRevFlag(String riskRevFlag) {
		this.riskRevFlag = riskRevFlag;
	}

	public FormatSamaReason(String idInvalid, String idExpired, String idRequired, String lostContact,
			String missingDocFlag, String samaOverrideIdExpired, String riskRevFlag) {
		super();
		this.idInvalid = idInvalid;
		this.idExpired = idExpired;
		this.idRequired = idRequired;
		this.lostContact = lostContact;
		this.missingDocFlag = missingDocFlag;
		this.samaOverrideIdExpired = samaOverrideIdExpired;
		this.riskRevFlag = riskRevFlag;
	}

	public FormatSamaReason() {
		super();
	}

	@Override
	public String toString() {
		return "FormatSamaReason [idInvalid=" + idInvalid + ", idExpired=" + idExpired + ", idRequired=" + idRequired
				+ ", lostContact=" + lostContact + ", missingDocFlag=" + missingDocFlag + ", samaOverrideIdExpired="
				+ samaOverrideIdExpired + ", riskRevFlag=" + riskRevFlag + "]";
	}

}
