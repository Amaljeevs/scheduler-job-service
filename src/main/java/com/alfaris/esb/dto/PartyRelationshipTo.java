package com.alfaris.esb.dto;

public class PartyRelationshipTo {

	private String partyFirstAName;
	private String partyLastAName;
	private String relatedPartyType;
	private String fromCisNumber;
	private String toCisNumber;
	private String relationshipType;
	private String relationshipDesc;
	private String bclFlag;

	public String getPartyFirstAName() {
		return partyFirstAName;
	}

	public void setPartyFirstAName(String partyFirstAName) {
		this.partyFirstAName = partyFirstAName;
	}

	public String getPartyLastAName() {
		return partyLastAName;
	}

	public void setPartyLastAName(String partyLastAName) {
		this.partyLastAName = partyLastAName;
	}

	public String getRelatedPartyType() {
		return relatedPartyType;
	}

	public void setRelatedPartyType(String relatedPartyType) {
		this.relatedPartyType = relatedPartyType;
	}

	public String getFromCisNumber() {
		return fromCisNumber;
	}

	public void setFromCisNumber(String fromCisNumber) {
		this.fromCisNumber = fromCisNumber;
	}

	public String getToCisNumber() {
		return toCisNumber;
	}

	public void setToCisNumber(String toCisNumber) {
		this.toCisNumber = toCisNumber;
	}

	public String getRelationshipType() {
		return relationshipType;
	}

	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}

	public String getRelationshipDesc() {
		return relationshipDesc;
	}

	public void setRelationshipDesc(String relationshipDesc) {
		this.relationshipDesc = relationshipDesc;
	}

	public String getBclFlag() {
		return bclFlag;
	}

	public void setBclFlag(String bclFlag) {
		this.bclFlag = bclFlag;
	}

	public PartyRelationshipTo(String partyFirstAName, String partyLastAName, String relatedPartyType,
			String fromCisNumber, String toCisNumber, String relationshipType, String relationshipDesc,
			String bclFlag) {
		super();
		this.partyFirstAName = partyFirstAName;
		this.partyLastAName = partyLastAName;
		this.relatedPartyType = relatedPartyType;
		this.fromCisNumber = fromCisNumber;
		this.toCisNumber = toCisNumber;
		this.relationshipType = relationshipType;
		this.relationshipDesc = relationshipDesc;
		this.bclFlag = bclFlag;
	}

	public PartyRelationshipTo() {
		super();
	}

	@Override
	public String toString() {
		return "PartyRelationshipTo [partyFirstAName=" + partyFirstAName + ", partyLastAName=" + partyLastAName
				+ ", relatedPartyType=" + relatedPartyType + ", fromCisNumber=" + fromCisNumber + ", toCisNumber="
				+ toCisNumber + ", relationshipType=" + relationshipType + ", relationshipDesc=" + relationshipDesc
				+ ", bclFlag=" + bclFlag + "]";
	}

}
