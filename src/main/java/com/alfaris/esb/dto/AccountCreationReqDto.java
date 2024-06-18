package com.alfaris.esb.dto;

public class AccountCreationReqDto {
	private AccountCreationHeaderRq riyadBankHeader;
	
	private String acctProductType;

	private String custTypeCd;

	private String custSubTypeCd;

	private String validSaudiId;

	private String acctNumber;

	private String allowSwift;

	private String acctCurrency;

	private String addressCity;

	private String zip;

	private String shortName;

	private String acctType;

	private String poBox;

	private String acctBranch;

	private String connectorCode;

	private String nameLanguageCode;

	private String dobG;

	private RelationInformation relationInformation;

	private NameAddressInformation nameAddressInformation;

	public AccountCreationReqDto(AccountCreationHeaderRq riyadBankHeader, String acctProductType, String custTypeCd,
			String custSubTypeCd, String validSaudiId, String acctNumber, String allowSwift, String acctCurrency,
			String addressCity, String zip, String shortName, String acctType, String poBox, String acctBranch,
			String connectorCode, String nameLanguageCode, String dobG, RelationInformation relationInformation,
			NameAddressInformation nameAddressInformation) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.acctProductType = acctProductType;
		this.custTypeCd = custTypeCd;
		this.custSubTypeCd = custSubTypeCd;
		this.validSaudiId = validSaudiId;
		this.acctNumber = acctNumber;
		this.allowSwift = allowSwift;
		this.acctCurrency = acctCurrency;
		this.addressCity = addressCity;
		this.zip = zip;
		this.shortName = shortName;
		this.acctType = acctType;
		this.poBox = poBox;
		this.acctBranch = acctBranch;
		this.connectorCode = connectorCode;
		this.nameLanguageCode = nameLanguageCode;
		this.dobG = dobG;
		this.relationInformation = relationInformation;
		this.nameAddressInformation = nameAddressInformation;
	}

	public String getacctNumber() {
		return acctNumber;
	}

	public void setacctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getNameLanguageCode() {
		return nameLanguageCode;
	}

	public void setNameLanguageCode(String nameLanguageCode) {
		this.nameLanguageCode = nameLanguageCode;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getAcctBranch() {
		return acctBranch;
	}

	public void setAcctBranch(String acctBranch) {
		this.acctBranch = acctBranch;
	}

	public String getDobG() {
		return dobG;
	}

	public void setDobG(String dobG) {
		this.dobG = dobG;
	}

	public String getCustTypeCd() {
		return custTypeCd;
	}

	public void setCustTypeCd(String custTypeCd) {
		this.custTypeCd = custTypeCd;
	}

	public String getCustSubTypeCd() {
		return custSubTypeCd;
	}

	public void setCustSubTypeCd(String custSubTypeCd) {
		this.custSubTypeCd = custSubTypeCd;
	}

	public String getValidSaudiId() {
		return validSaudiId;
	}

	public void setValidSaudiId(String validSaudiId) {
		this.validSaudiId = validSaudiId;
	}

	public String getAllowSwift() {
		return allowSwift;
	}

	public void setAllowSwift(String allowSwift) {
		this.allowSwift = allowSwift;
	}

	public NameAddressInformation getNameAddressInformation() {
		return nameAddressInformation;
	}

	public void setNameAddressInformation(NameAddressInformation nameAddressInformation) {
		this.nameAddressInformation = nameAddressInformation;
	}

	public AccountCreationHeaderRq getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AccountCreationHeaderRq riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getAcctProductType() {
		return acctProductType;
	}

	public void setAcctProductType(String acctProductType) {
		this.acctProductType = acctProductType;
	}

	public String getAcctCurrency() {
		return acctCurrency;
	}

	public void setAcctCurrency(String acctCurrency) {
		this.acctCurrency = acctCurrency;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getConnectorCode() {
		return connectorCode;
	}

	public void setConnectorCode(String connectorCode) {
		this.connectorCode = connectorCode;
	}

	public RelationInformation getRelationInformation() {
		return relationInformation;
	}

	public void setRelationInformation(RelationInformation relationInformation) {
		this.relationInformation = relationInformation;
	}

	public AccountCreationReqDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AccountCreationReqDto [riyadBankHeader=" + riyadBankHeader + ", acctProductType=" + acctProductType
				+ ", custTypeCd=" + custTypeCd + ", custSubTypeCd=" + custSubTypeCd + ", validSaudiId=" + validSaudiId
				+ ", allowSwift=" + allowSwift + ", acctCurrency=" + acctCurrency + ", addressCity=" + addressCity
				+ ", zip=" + zip + ", shortName=" + shortName + ", acctType=" + acctType + ", poBox=" + poBox
				+ ", acctBranch=" + acctBranch + ", connectorCode=" + connectorCode + ", nameLanguageCode="
				+ nameLanguageCode + ", dobG=" + dobG + ", relationInformation=" + relationInformation
				+ ", nameAddressInformation=" + nameAddressInformation + "]";
	}

	public AccountCreationReqDto(AccountCreationHeaderRq riyadBankHeader, String acctProductType, String custTypeCd,
			String custSubTypeCd, String validSaudiId, String allowSwift, String acctCurrency, String addressCity,
			String zip, String shortName, String acctType, String poBox, String acctBranch, String connectorCode,
			String nameLanguageCode, String dobG, RelationInformation relationInformation,
			NameAddressInformation nameAddressInformation) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.acctProductType = acctProductType;
		this.custTypeCd = custTypeCd;
		this.custSubTypeCd = custSubTypeCd;
		this.validSaudiId = validSaudiId;
		this.allowSwift = allowSwift;
		this.acctCurrency = acctCurrency;
		this.addressCity = addressCity;
		this.zip = zip;
		this.shortName = shortName;
		this.acctType = acctType;
		this.poBox = poBox;
		this.acctBranch = acctBranch;
		this.connectorCode = connectorCode;
		this.nameLanguageCode = nameLanguageCode;
		this.dobG = dobG;
		this.relationInformation = relationInformation;
		this.nameAddressInformation = nameAddressInformation;
	}

}
