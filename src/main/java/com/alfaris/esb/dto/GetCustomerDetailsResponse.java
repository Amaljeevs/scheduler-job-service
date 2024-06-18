package com.alfaris.esb.dto;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetCustomerDetailsResponse {

	@JsonProperty("riyadBankHeader")
	private GetCustomerDetailsBankHeaderResponse riyadBankHeader;

	@JsonProperty("systematicsStatusMessage")
	private SystematicsStatusMessage systematicsStatusMessage;

	@JsonProperty("digitalSignatureFlag")
	private String digitalSignatureFlag;

	@JsonProperty("custFirstName")
	private String custFirstName;

	@JsonProperty("custMiddleName")
	private String custMiddleName;

	@JsonProperty("custGrandfatherName")
	private String custGrandfatherName;

	@JsonProperty("custLastName")
	private String custLastName;

	@JsonProperty("custFirstEName")
	private String custFirstEName;

	@JsonProperty("custFirstAName")
	private String custFirstAName;

	@JsonProperty("custMiddleEName")
	private String custMiddleEName;

	@JsonProperty("custMiddleAName")
	private String custMiddleAName;

	@JsonProperty("custGrandfatherEName")
	private String custGrandfatherEName;

	@JsonProperty("custGrandfatherAName")
	private String custGrandfatherAName;

	@JsonProperty("custLastEName")
	private String custLastEName;

	@JsonProperty("custLastAName")
	private String custLastAName;

	@JsonProperty("custFullName")
	private String custFullName;

	@JsonProperty("custFullEName")
	private String custFullEName;

	@JsonProperty("custFullAName")
	private String custFullAName;

	@JsonProperty("poBox")
	private String poBox;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("address2")
	private String address2;

	@JsonProperty("address3")
	private String address3;

	@JsonProperty("address4")
	private String address4;

	@JsonProperty("addressCity")
	private String addressCity;

	@JsonProperty("zip")
	private String zip;

	@JsonProperty("contactName")
	private String contactName;

	@JsonProperty("addressSeqNumber")
	private String addressSeqNumber;

	@JsonProperty("county")
	private String county;

	@JsonProperty("country")
	private String country;

	@JsonProperty("unitNo")
	private String unitNo;

	@JsonProperty("stateRegion")
	private String stateRegion;

	@JsonProperty("addressStatus")
	private String addressStatus;

	@JsonProperty("addressTypeCode")
	private String addressTypeCode;

	@JsonProperty("addressUseCode")
	private String addressUseCode;

	@JsonProperty("addressStartDate")
	private String addressStartDate;

	@JsonProperty("addressEndDate")
	private String addressEndDate;

	@JsonProperty("homeNumber")
	private String homeNumber;

	@JsonProperty("email")
	private String email;

	@JsonProperty("custDispName")
	private String custDispName;

	@JsonProperty("custTypeCd")
	private String custTypeCd;

	@JsonProperty("custSubTypeCd")
	private String custSubTypeCd;

	@JsonProperty("custStatusCd")
	private String custStatusCd;

	@JsonProperty("custStatusChangeDate")
	private String custStatusChangeDate;

	@JsonProperty("custStatusChangeMethod")
	private String custStatusChangeMethod;

	@JsonProperty("preferredCurrCd")
	private String preferredCurrCd;

	@JsonProperty("shortName")
	private String shortName;

	@JsonProperty("combinedStatementInd")
	private String combinedStatementInd;

	@JsonProperty("officerCd")
	private String officerCd;

	@JsonProperty("relationshipPricingInd")
	private String relationshipPricingInd;

	@JsonProperty("securityId")
	private String securityId;

	@JsonProperty("languageCd")
	private String languageCd;

	@JsonProperty("refusedServiceInd")
	private String refusedServiceInd;

	@JsonProperty("regulatorClass")
	private String regulatorClass;

	@JsonProperty("samaClass")
	private String samaClass;

	@JsonProperty("officerEmployeeDirectorCd")
	private String officerEmployeeDirectorCd;

	@JsonProperty("institutionOfOfficerEmployeeDirector")
	private String institutionOfOfficerEmployeeDirector;

	@JsonProperty("insiderCd")
	private String insiderCd;

	@JsonProperty("institutionOfInsiderCd")
	private String institutionOfInsiderCd;

	@JsonProperty("relationToInsiderCd")
	private String relationToInsiderCd;

	@JsonProperty("vipCd")
	private String vipCd;

	@JsonProperty("boardStaffCd")
	private String boardStaffCd;

	@JsonProperty("stockholderInd")
	private String stockholderInd;

	@JsonProperty("regionCd")
	private String regionCd;

	@JsonProperty("openingBranch")
	private String openingBranch;

	@JsonProperty("responsibleBranch")
	private String responsibleBranch;

	@JsonProperty("preferredBranch")
	private String preferredBranch;

	@JsonProperty("marketingOfficerCd")
	private String marketingOfficerCd;

	@JsonProperty("loanOfficerCd")
	private String loanOfficerCd;

	@JsonProperty("depositOfficerCd")
	private String depositOfficerCd;

	@JsonProperty("addedDate")
	private String addedDate;

	@JsonProperty("firstAcctDate")
	private String firstAcctDate;

	@JsonProperty("deletedDate")
	private String deletedDate;

	@JsonProperty("dateLastCustActivity")
	private String dateLastCustActivity;

	@JsonProperty("inactiveDate")
	private String inactiveDate;

	@JsonProperty("dateLastCustContact")
	private String dateLastCustContact;

	@JsonProperty("dateLostCust")
	private String dateLostCust;

	@JsonProperty("reasonLostCustCd")
	private String reasonLostCustCd;

	@JsonProperty("frozenDate")
	private String frozenDate;

	@JsonProperty("frozenFlag")
	private String frozenFlag;

	@JsonProperty("economicSector")
	private String economicSector;

	@JsonProperty("dobG")
	private String dobG;

	@JsonProperty("dobH")
	private String dobH;

	@JsonProperty("placeOfBirth")
	private String placeOfBirth;

	@JsonProperty("countryOfBirth")
	private String countryOfBirth;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("raceCd")
	private String raceCd;

	@JsonProperty("educationLevel")
	private String educationLevel;

	@JsonProperty("deceasedDate")
	private String deceasedDate;

	@JsonProperty("maritalCd")
	private String maritalCd;

	@JsonProperty("numberOfWives")
	private String numberOfWives;

	@JsonProperty("rbStaffFlag")
	private String rbStaffFlag;

	@JsonProperty("rbStaffPosition")
	private String rbStaffPosition;

	@JsonProperty("citizenshipCountryCd")
	private String citizenshipCountryCd;

	@JsonProperty("citizenAlienCd")
	private String citizenAlienCd;

	@JsonProperty("dateOfResidence")
	private String dateOfResidence;

	@JsonProperty("dateOfResidenceH")
	private String dateOfResidenceH;

	@JsonProperty("ownRentCd")
	private String ownRentCd;

	@JsonProperty("motherMaidenName")
	private String motherMaidenName;

	@JsonProperty("numberOfChildren")
	private String numberOfChildren;

	@JsonProperty("numberOfDependents")
	private String numberOfDependents;

	@JsonProperty("spouseName")
	private String spouseName;

	@JsonProperty("spouseMaidenName")
	private String spouseMaidenName;

	@JsonProperty("spouseDob")
	private String spouseDob;

	@JsonProperty("driverLicense")
	private String driverLicense;

	@JsonProperty("driverLicenseSt")
	private String driverLicenseSt;

	@JsonProperty("passportIdNumber")
	private String passportIdNumber;

	@JsonProperty("passportIdCountry")
	private String passportIdCountry;

	@JsonProperty("webAdress")
	private String webAdress;

	@JsonProperty("businessEstablishedDate")
	private String businessEstablishedDate;

	@JsonProperty("businessEstablishedDateH")
	private String businessEstablishedDateH;

	@JsonProperty("businessPrimaryBankName")
	private String businessPrimaryBankName;

	@JsonProperty("numberOfEmployees")
	private String numberOfEmployees;

	@JsonProperty("ownerTypeCd")
	private String ownerTypeCd;

	@JsonProperty("smallBusinessInd")
	private String smallBusinessInd;

	@JsonProperty("lineOfBusiness1")
	private String lineOfBusiness1;

	@JsonProperty("lineOfBusiness2")
	private String lineOfBusiness2;

	@JsonProperty("lineOfBusiness3")
	private String lineOfBusiness3;

	@JsonProperty("standardIndustrialClass1")
	private String standardIndustrialClass1;

	@JsonProperty("standardIndustrialClass1Pct")
	private String standardIndustrialClass1Pct;

	@JsonProperty("standardIndustrialClass2")
	private String standardIndustrialClass2;

	@JsonProperty("standardIndustrialClass2Pct")
	private String standardIndustrialClass2Pct;

	@JsonProperty("crDebtClass")
	private String crDebtClass;

	@JsonProperty("kycDate")
	private String kycDate;

	@JsonProperty("interactionPreference")
	private String interactionPreference;

	@JsonProperty("willingToPay")
	private String willingToPay;

	@JsonProperty("riskPreference")
	private String riskPreference;

	@JsonProperty("spendPreference")
	private String spendPreference;

	@JsonProperty("islamicPreference")
	private String islamicPreference;

	@JsonProperty("contactPreference")
	private String contactPreference;

	@JsonProperty("billDeliveryType")
	private String billDeliveryType;

	@JsonProperty("callFlag")
	private String callFlag;

	@JsonProperty("emailFlag")
	private String emailFlag;

	@JsonProperty("mailFlag")
	private String mailFlag;

	@JsonProperty("sensitivityDegree")
	private String sensitivityDegree;

	@JsonProperty("annualResidenceRentalAmount")
	private String annualResidenceRentalAmount;

	@JsonProperty("crAnnualIncome")
	private String crAnnualIncome;

	@JsonProperty("annualSalaryDepositedRb")
	private String annualSalaryDepositedRb;

	@JsonProperty("monthlyAllowanceRange")
	private String monthlyAllowanceRange;

	@JsonProperty("financialInstitutionType")
	private String financialInstitutionType;

	@JsonProperty("salutation")
	private String salutation;

	@JsonProperty("emailAddress")
	private String emailAddress;

	@JsonProperty("salesVolumeAmount")
	private String salesVolumeAmount;

	@JsonProperty("forgedIdFlag")
	private String forgedIdFlag;

	@JsonProperty("ucmId")
	private String ucmId;

	@JsonProperty("crOdLimit")
	private String crOdLimit;

	@JsonProperty("bankcruptcyCd")
	private String bankcruptcyCd;

	@JsonProperty("bankcruptcyDate")
	private String bankcruptcyDate;

	@JsonProperty("numberOfOffices")
	private String numberOfOffices;

	@JsonProperty("localInstitutionCode")
	private String localInstitutionCode;

	@JsonProperty("businessLocation")
	private String businessLocation;

	@JsonProperty("areasOfSales")
	private String areasOfSales;

	@JsonProperty("importExport")
	private String importExport;

	@JsonProperty("partyType")
	private String partyType;

	@JsonProperty("dateLastTypeChange")
	private String dateLastTypeChange;

	@JsonProperty("reasonLastTypeChange")
	private String reasonLastTypeChange;

	@JsonProperty("customerSinceDate")
	private String customerSinceDate;

	@JsonProperty("lastCustomerContactDate")
	private String lastCustomerContactDate;

	@JsonProperty("bankLines")
	private String bankLines;

	@JsonProperty("natureOfBank")
	private String natureOfBank;

	@JsonProperty("swiftCode")
	private String swiftCode;

	@JsonProperty("remarks")
	private String remarks;

	@JsonProperty("history")
	private String history;

	@JsonProperty("version")
	private String version;

	@JsonProperty("vostro")
	private String vostro;

	@JsonProperty("nostro")
	private String nostro;

	@JsonProperty("priority")
	private String priority;

	@JsonProperty("borrowing")
	private String borrowing;

	@JsonProperty("borrower")
	private String borrower;

	@JsonProperty("validatedFlag")
	private String validatedFlag;

	@JsonProperty("lastValidatedDate")
	private String lastValidatedDate;

	@JsonProperty("aliasName")
	private String aliasName;

	@JsonProperty("aliasEName")
	private String aliasEName;
	@JsonProperty("aliasAName")
	private String aliasAName;
	@JsonProperty("naics")
	private String naics;
	@JsonProperty("parentAccountName")
	private String parentAccountName;
	@JsonProperty("businessIncap")
	private String businessIncap;
	@JsonProperty("businessMonthlyIncome")
	private String businessMonthlyIncome;
	@JsonProperty("exceptionExpiryDate")
	private String exceptionExpiryDate;
	@JsonProperty("businessType")
	private String businessType;
	@JsonProperty("crType")
	private String crType;
	@JsonProperty("activity")
	private String activity;
	@JsonProperty("crStatus")
	private String crStatus;
	@JsonProperty("shareCapital")
	private String shareCapital;
	@JsonProperty("cashCapital")
	private String cashCapital;
	@JsonProperty("payrollStatus")
	private String payrollStatus;
	@JsonProperty("lastPayrollDate")
	private String lastPayrollDate;
	@JsonProperty("numberOfPayrollPayments")
	private String numberOfPayrollPayments;
	@JsonProperty("payrollType")
	private String payrollType;
	@JsonProperty("rbkycRiskScoreDate")
	private String rbkycRiskScoreDate;
	@JsonProperty("rbkycRiskScore")
	private String rbkycRiskScore;
	@JsonProperty("rbkycRiskNextRevDate")
	private String rbkycRiskNextRevDate;
	@JsonProperty("rbkycRiskCategory")
	private String rbkycRiskCategory;
	@JsonProperty("loyaltyFlag")
	private String loyaltyFlag;
	@JsonProperty("lifeStatus")
	private String lifeStatus;
	@JsonProperty("legalStatus")
	private String legalStatus;
	@JsonProperty("facebookUserId")
	private String facebookUserId;
	@JsonProperty("twitterUserId")
	private String twitterUserId;
	@JsonProperty("instagramUserId")
	private String instagramUserId;
	@JsonProperty("segmentCampaignId")
	private String segmentCampaignId;
	@JsonProperty("segmentReason")
	private String segmentReason;
	@JsonProperty("segmentRelatedCis")
	private String segmentRelatedCis;
	@JsonProperty("waselnewCitycd")
	private String waselnewCitycd;
	@JsonProperty("waselnewRegioncd")
	private String waselnewRegioncd;
	@JsonProperty("waselnewDistrictcd")
	private String waselnewDistrictcd;
	@JsonProperty("position")
	private String position;
	@JsonProperty("sourceOfIncome")
	private String sourceOfIncome;
	@JsonProperty("natheerStatus")
	private String natheerStatus;
	@JsonProperty("natheerFreezeReason")
	private String natheerFreezeReason;
	@JsonProperty("businessTypeCode")
	private String businessTypeCode;
	@JsonProperty("branchCode")
	private String branchCode;
	@JsonProperty("eddLastUpdateDate")
	private String eddLastUpdateDate;
	@JsonProperty("eddFreezeReason")
	private String eddFreezeReason;
	@JsonProperty("taxReqistNo")
	private String taxReqistNo;
	@JsonProperty("custIdentificationDetails")
	private List<CustomerIdentificationDet> custIdentificationDetails;
	@JsonProperty("customerPhoneDetails")
	private List<CustomerPhoneDetails> customerPhoneDetails;

	private JSONObject waselAddress;

	private JSONArray customerCrossreference;

	private JSONObject formatSamaReason;

	private JSONObject secondaryAdresses;

	public JSONArray getCustomerCrossreference() {
		return customerCrossreference;
	}

	public void setCustomerCrossreference(JSONArray customerCrossreference) {
		this.customerCrossreference = customerCrossreference;
	}

	public JSONObject getFormatSamaReason() {
		return formatSamaReason;
	}

	public void setFormatSamaReason(JSONObject formatSamaReason) {
		this.formatSamaReason = formatSamaReason;
	}

	public JSONObject getSecondaryAdresses() {
		return secondaryAdresses;
	}

	public void setSecondaryAdresses(JSONObject secondaryAdresses) {
		this.secondaryAdresses = secondaryAdresses;
	}

	public JSONObject getWaselAddress() {
		return waselAddress;
	}

	public void setWaselAddress(JSONObject waselAddress) {
		this.waselAddress = waselAddress;
	}

	public GetCustomerDetailsBankHeaderResponse getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(GetCustomerDetailsBankHeaderResponse riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public SystematicsStatusMessage getSystematicsStatusMessage() {
		return systematicsStatusMessage;
	}

	public void setSystematicsStatusMessage(SystematicsStatusMessage systematicsStatusMessage) {
		this.systematicsStatusMessage = systematicsStatusMessage;
	}

	public String getDigitalSignatureFlag() {
		return digitalSignatureFlag;
	}

	public void setDigitalSignatureFlag(String digitalSignatureFlag) {
		this.digitalSignatureFlag = digitalSignatureFlag;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustMiddleName() {
		return custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public String getCustGrandfatherName() {
		return custGrandfatherName;
	}

	public void setCustGrandfatherName(String custGrandfatherName) {
		this.custGrandfatherName = custGrandfatherName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustFirstEName() {
		return custFirstEName;
	}

	public void setCustFirstEName(String custFirstEName) {
		this.custFirstEName = custFirstEName;
	}

	public String getCustFirstAName() {
		return custFirstAName;
	}

	public void setCustFirstAName(String custFirstAName) {
		this.custFirstAName = custFirstAName;
	}

	public String getCustMiddleEName() {
		return custMiddleEName;
	}

	public void setCustMiddleEName(String custMiddleEName) {
		this.custMiddleEName = custMiddleEName;
	}

	public String getCustMiddleAName() {
		return custMiddleAName;
	}

	public void setCustMiddleAName(String custMiddleAName) {
		this.custMiddleAName = custMiddleAName;
	}

	public String getCustGrandfatherEName() {
		return custGrandfatherEName;
	}

	public void setCustGrandfatherEName(String custGrandfatherEName) {
		this.custGrandfatherEName = custGrandfatherEName;
	}

	public String getCustGrandfatherAName() {
		return custGrandfatherAName;
	}

	public void setCustGrandfatherAName(String custGrandfatherAName) {
		this.custGrandfatherAName = custGrandfatherAName;
	}

	public String getCustLastEName() {
		return custLastEName;
	}

	public void setCustLastEName(String custLastEName) {
		this.custLastEName = custLastEName;
	}

	public String getCustLastAName() {
		return custLastAName;
	}

	public void setCustLastAName(String custLastAName) {
		this.custLastAName = custLastAName;
	}

	public String getCustFullName() {
		return custFullName;
	}

	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}

	public String getCustFullEName() {
		return custFullEName;
	}

	public void setCustFullEName(String custFullEName) {
		this.custFullEName = custFullEName;
	}

	public String getCustFullAName() {
		return custFullAName;
	}

	public void setCustFullAName(String custFullAName) {
		this.custFullAName = custFullAName;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
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

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getAddressSeqNumber() {
		return addressSeqNumber;
	}

	public void setAddressSeqNumber(String addressSeqNumber) {
		this.addressSeqNumber = addressSeqNumber;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getAddressUseCode() {
		return addressUseCode;
	}

	public void setAddressUseCode(String addressUseCode) {
		this.addressUseCode = addressUseCode;
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

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCustDispName() {
		return custDispName;
	}

	public void setCustDispName(String custDispName) {
		this.custDispName = custDispName;
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

	public String getCustStatusCd() {
		return custStatusCd;
	}

	public void setCustStatusCd(String custStatusCd) {
		this.custStatusCd = custStatusCd;
	}

	public String getCustStatusChangeDate() {
		return custStatusChangeDate;
	}

	public void setCustStatusChangeDate(String custStatusChangeDate) {
		this.custStatusChangeDate = custStatusChangeDate;
	}

	public String getCustStatusChangeMethod() {
		return custStatusChangeMethod;
	}

	public void setCustStatusChangeMethod(String custStatusChangeMethod) {
		this.custStatusChangeMethod = custStatusChangeMethod;
	}

	public String getPreferredCurrCd() {
		return preferredCurrCd;
	}

	public void setPreferredCurrCd(String preferredCurrCd) {
		this.preferredCurrCd = preferredCurrCd;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCombinedStatementInd() {
		return combinedStatementInd;
	}

	public void setCombinedStatementInd(String combinedStatementInd) {
		this.combinedStatementInd = combinedStatementInd;
	}

	public String getOfficerCd() {
		return officerCd;
	}

	public void setOfficerCd(String officerCd) {
		this.officerCd = officerCd;
	}

	public String getRelationshipPricingInd() {
		return relationshipPricingInd;
	}

	public void setRelationshipPricingInd(String relationshipPricingInd) {
		this.relationshipPricingInd = relationshipPricingInd;
	}

	public String getSecurityId() {
		return securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public String getLanguageCd() {
		return languageCd;
	}

	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}

	public String getRefusedServiceInd() {
		return refusedServiceInd;
	}

	public void setRefusedServiceInd(String refusedServiceInd) {
		this.refusedServiceInd = refusedServiceInd;
	}

	public String getRegulatorClass() {
		return regulatorClass;
	}

	public void setRegulatorClass(String regulatorClass) {
		this.regulatorClass = regulatorClass;
	}

	public String getSamaClass() {
		return samaClass;
	}

	public void setSamaClass(String samaClass) {
		this.samaClass = samaClass;
	}

	public String getOfficerEmployeeDirectorCd() {
		return officerEmployeeDirectorCd;
	}

	public void setOfficerEmployeeDirectorCd(String officerEmployeeDirectorCd) {
		this.officerEmployeeDirectorCd = officerEmployeeDirectorCd;
	}

	public String getInstitutionOfOfficerEmployeeDirector() {
		return institutionOfOfficerEmployeeDirector;
	}

	public void setInstitutionOfOfficerEmployeeDirector(String institutionOfOfficerEmployeeDirector) {
		this.institutionOfOfficerEmployeeDirector = institutionOfOfficerEmployeeDirector;
	}

	public String getInsiderCd() {
		return insiderCd;
	}

	public void setInsiderCd(String insiderCd) {
		this.insiderCd = insiderCd;
	}

	public String getInstitutionOfInsiderCd() {
		return institutionOfInsiderCd;
	}

	public void setInstitutionOfInsiderCd(String institutionOfInsiderCd) {
		this.institutionOfInsiderCd = institutionOfInsiderCd;
	}

	public String getRelationToInsiderCd() {
		return relationToInsiderCd;
	}

	public void setRelationToInsiderCd(String relationToInsiderCd) {
		this.relationToInsiderCd = relationToInsiderCd;
	}

	public String getVipCd() {
		return vipCd;
	}

	public void setVipCd(String vipCd) {
		this.vipCd = vipCd;
	}

	public String getBoardStaffCd() {
		return boardStaffCd;
	}

	public void setBoardStaffCd(String boardStaffCd) {
		this.boardStaffCd = boardStaffCd;
	}

	public String getStockholderInd() {
		return stockholderInd;
	}

	public void setStockholderInd(String stockholderInd) {
		this.stockholderInd = stockholderInd;
	}

	public String getRegionCd() {
		return regionCd;
	}

	public void setRegionCd(String regionCd) {
		this.regionCd = regionCd;
	}

	public String getOpeningBranch() {
		return openingBranch;
	}

	public void setOpeningBranch(String openingBranch) {
		this.openingBranch = openingBranch;
	}

	public String getResponsibleBranch() {
		return responsibleBranch;
	}

	public void setResponsibleBranch(String responsibleBranch) {
		this.responsibleBranch = responsibleBranch;
	}

	public String getPreferredBranch() {
		return preferredBranch;
	}

	public void setPreferredBranch(String preferredBranch) {
		this.preferredBranch = preferredBranch;
	}

	public String getMarketingOfficerCd() {
		return marketingOfficerCd;
	}

	public void setMarketingOfficerCd(String marketingOfficerCd) {
		this.marketingOfficerCd = marketingOfficerCd;
	}

	public String getLoanOfficerCd() {
		return loanOfficerCd;
	}

	public void setLoanOfficerCd(String loanOfficerCd) {
		this.loanOfficerCd = loanOfficerCd;
	}

	public String getDepositOfficerCd() {
		return depositOfficerCd;
	}

	public void setDepositOfficerCd(String depositOfficerCd) {
		this.depositOfficerCd = depositOfficerCd;
	}

	public String getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(String addedDate) {
		this.addedDate = addedDate;
	}

	public String getFirstAcctDate() {
		return firstAcctDate;
	}

	public void setFirstAcctDate(String firstAcctDate) {
		this.firstAcctDate = firstAcctDate;
	}

	public String getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getDateLastCustActivity() {
		return dateLastCustActivity;
	}

	public void setDateLastCustActivity(String dateLastCustActivity) {
		this.dateLastCustActivity = dateLastCustActivity;
	}

	public String getInactiveDate() {
		return inactiveDate;
	}

	public void setInactiveDate(String inactiveDate) {
		this.inactiveDate = inactiveDate;
	}

	public String getDateLastCustContact() {
		return dateLastCustContact;
	}

	public void setDateLastCustContact(String dateLastCustContact) {
		this.dateLastCustContact = dateLastCustContact;
	}

	public String getDateLostCust() {
		return dateLostCust;
	}

	public void setDateLostCust(String dateLostCust) {
		this.dateLostCust = dateLostCust;
	}

	public String getReasonLostCustCd() {
		return reasonLostCustCd;
	}

	public void setReasonLostCustCd(String reasonLostCustCd) {
		this.reasonLostCustCd = reasonLostCustCd;
	}

	public String getFrozenDate() {
		return frozenDate;
	}

	public void setFrozenDate(String frozenDate) {
		this.frozenDate = frozenDate;
	}

	public String getFrozenFlag() {
		return frozenFlag;
	}

	public void setFrozenFlag(String frozenFlag) {
		this.frozenFlag = frozenFlag;
	}

	public String getEconomicSector() {
		return economicSector;
	}

	public void setEconomicSector(String economicSector) {
		this.economicSector = economicSector;
	}

	public String getDobG() {
		return dobG;
	}

	public void setDobG(String dobG) {
		this.dobG = dobG;
	}

	public String getDobH() {
		return dobH;
	}

	public void setDobH(String dobH) {
		this.dobH = dobH;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRaceCd() {
		return raceCd;
	}

	public void setRaceCd(String raceCd) {
		this.raceCd = raceCd;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getDeceasedDate() {
		return deceasedDate;
	}

	public void setDeceasedDate(String deceasedDate) {
		this.deceasedDate = deceasedDate;
	}

	public String getMaritalCd() {
		return maritalCd;
	}

	public void setMaritalCd(String maritalCd) {
		this.maritalCd = maritalCd;
	}

	public String getNumberOfWives() {
		return numberOfWives;
	}

	public void setNumberOfWives(String numberOfWives) {
		this.numberOfWives = numberOfWives;
	}

	public String getRbStaffFlag() {
		return rbStaffFlag;
	}

	public void setRbStaffFlag(String rbStaffFlag) {
		this.rbStaffFlag = rbStaffFlag;
	}

	public String getRbStaffPosition() {
		return rbStaffPosition;
	}

	public void setRbStaffPosition(String rbStaffPosition) {
		this.rbStaffPosition = rbStaffPosition;
	}

	public String getCitizenshipCountryCd() {
		return citizenshipCountryCd;
	}

	public void setCitizenshipCountryCd(String citizenshipCountryCd) {
		this.citizenshipCountryCd = citizenshipCountryCd;
	}

	public String getCitizenAlienCd() {
		return citizenAlienCd;
	}

	public void setCitizenAlienCd(String citizenAlienCd) {
		this.citizenAlienCd = citizenAlienCd;
	}

	public String getDateOfResidence() {
		return dateOfResidence;
	}

	public void setDateOfResidence(String dateOfResidence) {
		this.dateOfResidence = dateOfResidence;
	}

	public String getDateOfResidenceH() {
		return dateOfResidenceH;
	}

	public void setDateOfResidenceH(String dateOfResidenceH) {
		this.dateOfResidenceH = dateOfResidenceH;
	}

	public String getOwnRentCd() {
		return ownRentCd;
	}

	public void setOwnRentCd(String ownRentCd) {
		this.ownRentCd = ownRentCd;
	}

	public String getMotherMaidenName() {
		return motherMaidenName;
	}

	public void setMotherMaidenName(String motherMaidenName) {
		this.motherMaidenName = motherMaidenName;
	}

	public String getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(String numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public String getNumberOfDependents() {
		return numberOfDependents;
	}

	public void setNumberOfDependents(String numberOfDependents) {
		this.numberOfDependents = numberOfDependents;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getSpouseMaidenName() {
		return spouseMaidenName;
	}

	public void setSpouseMaidenName(String spouseMaidenName) {
		this.spouseMaidenName = spouseMaidenName;
	}

	public String getSpouseDob() {
		return spouseDob;
	}

	public void setSpouseDob(String spouseDob) {
		this.spouseDob = spouseDob;
	}

	public String getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getDriverLicenseSt() {
		return driverLicenseSt;
	}

	public void setDriverLicenseSt(String driverLicenseSt) {
		this.driverLicenseSt = driverLicenseSt;
	}

	public String getPassportIdNumber() {
		return passportIdNumber;
	}

	public void setPassportIdNumber(String passportIdNumber) {
		this.passportIdNumber = passportIdNumber;
	}

	public String getPassportIdCountry() {
		return passportIdCountry;
	}

	public void setPassportIdCountry(String passportIdCountry) {
		this.passportIdCountry = passportIdCountry;
	}

	public String getWebAdress() {
		return webAdress;
	}

	public void setWebAdress(String webAdress) {
		this.webAdress = webAdress;
	}

	public String getBusinessEstablishedDate() {
		return businessEstablishedDate;
	}

	public void setBusinessEstablishedDate(String businessEstablishedDate) {
		this.businessEstablishedDate = businessEstablishedDate;
	}

	public String getBusinessEstablishedDateH() {
		return businessEstablishedDateH;
	}

	public void setBusinessEstablishedDateH(String businessEstablishedDateH) {
		this.businessEstablishedDateH = businessEstablishedDateH;
	}

	public String getBusinessPrimaryBankName() {
		return businessPrimaryBankName;
	}

	public void setBusinessPrimaryBankName(String businessPrimaryBankName) {
		this.businessPrimaryBankName = businessPrimaryBankName;
	}

	public String getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(String numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public String getOwnerTypeCd() {
		return ownerTypeCd;
	}

	public void setOwnerTypeCd(String ownerTypeCd) {
		this.ownerTypeCd = ownerTypeCd;
	}

	public String getSmallBusinessInd() {
		return smallBusinessInd;
	}

	public void setSmallBusinessInd(String smallBusinessInd) {
		this.smallBusinessInd = smallBusinessInd;
	}

	public String getLineOfBusiness1() {
		return lineOfBusiness1;
	}

	public void setLineOfBusiness1(String lineOfBusiness1) {
		this.lineOfBusiness1 = lineOfBusiness1;
	}

	public String getLineOfBusiness2() {
		return lineOfBusiness2;
	}

	public void setLineOfBusiness2(String lineOfBusiness2) {
		this.lineOfBusiness2 = lineOfBusiness2;
	}

	public String getLineOfBusiness3() {
		return lineOfBusiness3;
	}

	public void setLineOfBusiness3(String lineOfBusiness3) {
		this.lineOfBusiness3 = lineOfBusiness3;
	}

	public String getStandardIndustrialClass1() {
		return standardIndustrialClass1;
	}

	public void setStandardIndustrialClass1(String standardIndustrialClass1) {
		this.standardIndustrialClass1 = standardIndustrialClass1;
	}

	public String getStandardIndustrialClass1Pct() {
		return standardIndustrialClass1Pct;
	}

	public void setStandardIndustrialClass1Pct(String standardIndustrialClass1Pct) {
		this.standardIndustrialClass1Pct = standardIndustrialClass1Pct;
	}

	public String getStandardIndustrialClass2() {
		return standardIndustrialClass2;
	}

	public void setStandardIndustrialClass2(String standardIndustrialClass2) {
		this.standardIndustrialClass2 = standardIndustrialClass2;
	}

	public String getStandardIndustrialClass2Pct() {
		return standardIndustrialClass2Pct;
	}

	public void setStandardIndustrialClass2Pct(String standardIndustrialClass2Pct) {
		this.standardIndustrialClass2Pct = standardIndustrialClass2Pct;
	}

	public String getCrDebtClass() {
		return crDebtClass;
	}

	public void setCrDebtClass(String crDebtClass) {
		this.crDebtClass = crDebtClass;
	}

	public String getKycDate() {
		return kycDate;
	}

	public void setKycDate(String kycDate) {
		this.kycDate = kycDate;
	}

	public String getInteractionPreference() {
		return interactionPreference;
	}

	public void setInteractionPreference(String interactionPreference) {
		this.interactionPreference = interactionPreference;
	}

	public String getWillingToPay() {
		return willingToPay;
	}

	public void setWillingToPay(String willingToPay) {
		this.willingToPay = willingToPay;
	}

	public String getRiskPreference() {
		return riskPreference;
	}

	public void setRiskPreference(String riskPreference) {
		this.riskPreference = riskPreference;
	}

	public String getSpendPreference() {
		return spendPreference;
	}

	public void setSpendPreference(String spendPreference) {
		this.spendPreference = spendPreference;
	}

	public String getIslamicPreference() {
		return islamicPreference;
	}

	public void setIslamicPreference(String islamicPreference) {
		this.islamicPreference = islamicPreference;
	}

	public String getContactPreference() {
		return contactPreference;
	}

	public void setContactPreference(String contactPreference) {
		this.contactPreference = contactPreference;
	}

	public String getBillDeliveryType() {
		return billDeliveryType;
	}

	public void setBillDeliveryType(String billDeliveryType) {
		this.billDeliveryType = billDeliveryType;
	}

	public String getCallFlag() {
		return callFlag;
	}

	public void setCallFlag(String callFlag) {
		this.callFlag = callFlag;
	}

	public String getEmailFlag() {
		return emailFlag;
	}

	public void setEmailFlag(String emailFlag) {
		this.emailFlag = emailFlag;
	}

	public String getMailFlag() {
		return mailFlag;
	}

	public void setMailFlag(String mailFlag) {
		this.mailFlag = mailFlag;
	}

	public String getSensitivityDegree() {
		return sensitivityDegree;
	}

	public void setSensitivityDegree(String sensitivityDegree) {
		this.sensitivityDegree = sensitivityDegree;
	}

	public String getAnnualResidenceRentalAmount() {
		return annualResidenceRentalAmount;
	}

	public void setAnnualResidenceRentalAmount(String annualResidenceRentalAmount) {
		this.annualResidenceRentalAmount = annualResidenceRentalAmount;
	}

	public String getCrAnnualIncome() {
		return crAnnualIncome;
	}

	public void setCrAnnualIncome(String crAnnualIncome) {
		this.crAnnualIncome = crAnnualIncome;
	}

	public String getAnnualSalaryDepositedRb() {
		return annualSalaryDepositedRb;
	}

	public void setAnnualSalaryDepositedRb(String annualSalaryDepositedRb) {
		this.annualSalaryDepositedRb = annualSalaryDepositedRb;
	}

	public String getMonthlyAllowanceRange() {
		return monthlyAllowanceRange;
	}

	public void setMonthlyAllowanceRange(String monthlyAllowanceRange) {
		this.monthlyAllowanceRange = monthlyAllowanceRange;
	}

	public String getFinancialInstitutionType() {
		return financialInstitutionType;
	}

	public void setFinancialInstitutionType(String financialInstitutionType) {
		this.financialInstitutionType = financialInstitutionType;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSalesVolumeAmount() {
		return salesVolumeAmount;
	}

	public void setSalesVolumeAmount(String salesVolumeAmount) {
		this.salesVolumeAmount = salesVolumeAmount;
	}

	public String getForgedIdFlag() {
		return forgedIdFlag;
	}

	public void setForgedIdFlag(String forgedIdFlag) {
		this.forgedIdFlag = forgedIdFlag;
	}

	public String getUcmId() {
		return ucmId;
	}

	public void setUcmId(String ucmId) {
		this.ucmId = ucmId;
	}

	public String getCrOdLimit() {
		return crOdLimit;
	}

	public void setCrOdLimit(String crOdLimit) {
		this.crOdLimit = crOdLimit;
	}

	public String getBankcruptcyCd() {
		return bankcruptcyCd;
	}

	public void setBankcruptcyCd(String bankcruptcyCd) {
		this.bankcruptcyCd = bankcruptcyCd;
	}

	public String getBankcruptcyDate() {
		return bankcruptcyDate;
	}

	public void setBankcruptcyDate(String bankcruptcyDate) {
		this.bankcruptcyDate = bankcruptcyDate;
	}

	public String getNumberOfOffices() {
		return numberOfOffices;
	}

	public void setNumberOfOffices(String numberOfOffices) {
		this.numberOfOffices = numberOfOffices;
	}

	public String getLocalInstitutionCode() {
		return localInstitutionCode;
	}

	public void setLocalInstitutionCode(String localInstitutionCode) {
		this.localInstitutionCode = localInstitutionCode;
	}

	public String getBusinessLocation() {
		return businessLocation;
	}

	public void setBusinessLocation(String businessLocation) {
		this.businessLocation = businessLocation;
	}

	public String getAreasOfSales() {
		return areasOfSales;
	}

	public void setAreasOfSales(String areasOfSales) {
		this.areasOfSales = areasOfSales;
	}

	public String getImportExport() {
		return importExport;
	}

	public void setImportExport(String importExport) {
		this.importExport = importExport;
	}

	public String getPartyType() {
		return partyType;
	}

	public void setPartyType(String partyType) {
		this.partyType = partyType;
	}

	public String getDateLastTypeChange() {
		return dateLastTypeChange;
	}

	public void setDateLastTypeChange(String dateLastTypeChange) {
		this.dateLastTypeChange = dateLastTypeChange;
	}

	public String getReasonLastTypeChange() {
		return reasonLastTypeChange;
	}

	public void setReasonLastTypeChange(String reasonLastTypeChange) {
		this.reasonLastTypeChange = reasonLastTypeChange;
	}

	public String getCustomerSinceDate() {
		return customerSinceDate;
	}

	public void setCustomerSinceDate(String customerSinceDate) {
		this.customerSinceDate = customerSinceDate;
	}

	public String getLastCustomerContactDate() {
		return lastCustomerContactDate;
	}

	public void setLastCustomerContactDate(String lastCustomerContactDate) {
		this.lastCustomerContactDate = lastCustomerContactDate;
	}

	public String getBankLines() {
		return bankLines;
	}

	public void setBankLines(String bankLines) {
		this.bankLines = bankLines;
	}

	public String getNatureOfBank() {
		return natureOfBank;
	}

	public void setNatureOfBank(String natureOfBank) {
		this.natureOfBank = natureOfBank;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVostro() {
		return vostro;
	}

	public void setVostro(String vostro) {
		this.vostro = vostro;
	}

	public String getNostro() {
		return nostro;
	}

	public void setNostro(String nostro) {
		this.nostro = nostro;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getBorrowing() {
		return borrowing;
	}

	public void setBorrowing(String borrowing) {
		this.borrowing = borrowing;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getValidatedFlag() {
		return validatedFlag;
	}

	public void setValidatedFlag(String validatedFlag) {
		this.validatedFlag = validatedFlag;
	}

	public String getLastValidatedDate() {
		return lastValidatedDate;
	}

	public void setLastValidatedDate(String lastValidatedDate) {
		this.lastValidatedDate = lastValidatedDate;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getAliasEName() {
		return aliasEName;
	}

	public void setAliasEName(String aliasEName) {
		this.aliasEName = aliasEName;
	}

	public String getAliasAName() {
		return aliasAName;
	}

	public void setAliasAName(String aliasAName) {
		this.aliasAName = aliasAName;
	}

	public String getNaics() {
		return naics;
	}

	public void setNaics(String naics) {
		this.naics = naics;
	}

	public String getParentAccountName() {
		return parentAccountName;
	}

	public void setParentAccountName(String parentAccountName) {
		this.parentAccountName = parentAccountName;
	}

	public String getBusinessIncap() {
		return businessIncap;
	}

	public void setBusinessIncap(String businessIncap) {
		this.businessIncap = businessIncap;
	}

	public String getBusinessMonthlyIncome() {
		return businessMonthlyIncome;
	}

	public void setBusinessMonthlyIncome(String businessMonthlyIncome) {
		this.businessMonthlyIncome = businessMonthlyIncome;
	}

	public String getExceptionExpiryDate() {
		return exceptionExpiryDate;
	}

	public void setExceptionExpiryDate(String exceptionExpiryDate) {
		this.exceptionExpiryDate = exceptionExpiryDate;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCrType() {
		return crType;
	}

	public void setCrType(String crType) {
		this.crType = crType;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getCrStatus() {
		return crStatus;
	}

	public void setCrStatus(String crStatus) {
		this.crStatus = crStatus;
	}

	public String getShareCapital() {
		return shareCapital;
	}

	public void setShareCapital(String shareCapital) {
		this.shareCapital = shareCapital;
	}

	public String getCashCapital() {
		return cashCapital;
	}

	public void setCashCapital(String cashCapital) {
		this.cashCapital = cashCapital;
	}

	public String getPayrollStatus() {
		return payrollStatus;
	}

	public void setPayrollStatus(String payrollStatus) {
		this.payrollStatus = payrollStatus;
	}

	public String getLastPayrollDate() {
		return lastPayrollDate;
	}

	public void setLastPayrollDate(String lastPayrollDate) {
		this.lastPayrollDate = lastPayrollDate;
	}

	public String getNumberOfPayrollPayments() {
		return numberOfPayrollPayments;
	}

	public void setNumberOfPayrollPayments(String numberOfPayrollPayments) {
		this.numberOfPayrollPayments = numberOfPayrollPayments;
	}

	public String getPayrollType() {
		return payrollType;
	}

	public void setPayrollType(String payrollType) {
		this.payrollType = payrollType;
	}

	public String getRbkycRiskScoreDate() {
		return rbkycRiskScoreDate;
	}

	public void setRbkycRiskScoreDate(String rbkycRiskScoreDate) {
		this.rbkycRiskScoreDate = rbkycRiskScoreDate;
	}

	public String getRbkycRiskScore() {
		return rbkycRiskScore;
	}

	public void setRbkycRiskScore(String rbkycRiskScore) {
		this.rbkycRiskScore = rbkycRiskScore;
	}

	public String getRbkycRiskNextRevDate() {
		return rbkycRiskNextRevDate;
	}

	public void setRbkycRiskNextRevDate(String rbkycRiskNextRevDate) {
		this.rbkycRiskNextRevDate = rbkycRiskNextRevDate;
	}

	public String getRbkycRiskCategory() {
		return rbkycRiskCategory;
	}

	public void setRbkycRiskCategory(String rbkycRiskCategory) {
		this.rbkycRiskCategory = rbkycRiskCategory;
	}

	public String getLoyaltyFlag() {
		return loyaltyFlag;
	}

	public void setLoyaltyFlag(String loyaltyFlag) {
		this.loyaltyFlag = loyaltyFlag;
	}

	public String getLifeStatus() {
		return lifeStatus;
	}

	public void setLifeStatus(String lifeStatus) {
		this.lifeStatus = lifeStatus;
	}

	public String getLegalStatus() {
		return legalStatus;
	}

	public void setLegalStatus(String legalStatus) {
		this.legalStatus = legalStatus;
	}

	public String getFacebookUserId() {
		return facebookUserId;
	}

	public void setFacebookUserId(String facebookUserId) {
		this.facebookUserId = facebookUserId;
	}

	public String getTwitterUserId() {
		return twitterUserId;
	}

	public void setTwitterUserId(String twitterUserId) {
		this.twitterUserId = twitterUserId;
	}

	public String getInstagramUserId() {
		return instagramUserId;
	}

	public void setInstagramUserId(String instagramUserId) {
		this.instagramUserId = instagramUserId;
	}

	public String getSegmentCampaignId() {
		return segmentCampaignId;
	}

	public void setSegmentCampaignId(String segmentCampaignId) {
		this.segmentCampaignId = segmentCampaignId;
	}

	public String getSegmentReason() {
		return segmentReason;
	}

	public void setSegmentReason(String segmentReason) {
		this.segmentReason = segmentReason;
	}

	public String getSegmentRelatedCis() {
		return segmentRelatedCis;
	}

	public void setSegmentRelatedCis(String segmentRelatedCis) {
		this.segmentRelatedCis = segmentRelatedCis;
	}

	public String getWaselnewCitycd() {
		return waselnewCitycd;
	}

	public void setWaselnewCitycd(String waselnewCitycd) {
		this.waselnewCitycd = waselnewCitycd;
	}

	public String getWaselnewRegioncd() {
		return waselnewRegioncd;
	}

	public void setWaselnewRegioncd(String waselnewRegioncd) {
		this.waselnewRegioncd = waselnewRegioncd;
	}

	public String getWaselnewDistrictcd() {
		return waselnewDistrictcd;
	}

	public void setWaselnewDistrictcd(String waselnewDistrictcd) {
		this.waselnewDistrictcd = waselnewDistrictcd;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSourceOfIncome() {
		return sourceOfIncome;
	}

	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}

	public String getNatheerStatus() {
		return natheerStatus;
	}

	public void setNatheerStatus(String natheerStatus) {
		this.natheerStatus = natheerStatus;
	}

	public String getNatheerFreezeReason() {
		return natheerFreezeReason;
	}

	public void setNatheerFreezeReason(String natheerFreezeReason) {
		this.natheerFreezeReason = natheerFreezeReason;
	}

	public String getBusinessTypeCode() {
		return businessTypeCode;
	}

	public void setBusinessTypeCode(String businessTypeCode) {
		this.businessTypeCode = businessTypeCode;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getEddLastUpdateDate() {
		return eddLastUpdateDate;
	}

	public void setEddLastUpdateDate(String eddLastUpdateDate) {
		this.eddLastUpdateDate = eddLastUpdateDate;
	}

	public String getEddFreezeReason() {
		return eddFreezeReason;
	}

	public void setEddFreezeReason(String eddFreezeReason) {
		this.eddFreezeReason = eddFreezeReason;
	}

	public String getTaxReqistNo() {
		return taxReqistNo;
	}

	public void setTaxReqistNo(String taxReqistNo) {
		this.taxReqistNo = taxReqistNo;
	}

	public List<CustomerIdentificationDet> getCustIdentificationDetails() {
		return custIdentificationDetails;
	}

	public void setCustIdentificationDetails(List<CustomerIdentificationDet> custIdentificationDetails) {
		this.custIdentificationDetails = custIdentificationDetails;
	}

	public List<CustomerPhoneDetails> getCustomerPhoneDetails() {
		return customerPhoneDetails;
	}

	public void setCustomerPhoneDetails(List<CustomerPhoneDetails> customerPhoneDetails) {
		this.customerPhoneDetails = customerPhoneDetails;
	}

	@Override
	public String toString() {
		return "GetCustomerDetailsResponse [riyadBankHeader=" + riyadBankHeader + ", systematicsStatusMessage="
				+ systematicsStatusMessage + ", digitalSignatureFlag=" + digitalSignatureFlag + ", custFirstName="
				+ custFirstName + ", custMiddleName=" + custMiddleName + ", custGrandfatherName=" + custGrandfatherName
				+ ", custLastName=" + custLastName + ", custFirstEName=" + custFirstEName + ", custFirstAName="
				+ custFirstAName + ", custMiddleEName=" + custMiddleEName + ", custMiddleAName=" + custMiddleAName
				+ ", custGrandfatherEName=" + custGrandfatherEName + ", custGrandfatherAName=" + custGrandfatherAName
				+ ", custLastEName=" + custLastEName + ", custLastAName=" + custLastAName + ", custFullName="
				+ custFullName + ", custFullEName=" + custFullEName + ", custFullAName=" + custFullAName + ", poBox="
				+ poBox + ", address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + ", address4="
				+ address4 + ", addressCity=" + addressCity + ", zip=" + zip + ", contactName=" + contactName
				+ ", addressSeqNumber=" + addressSeqNumber + ", county=" + county + ", country=" + country + ", unitNo="
				+ unitNo + ", stateRegion=" + stateRegion + ", addressStatus=" + addressStatus + ", addressTypeCode="
				+ addressTypeCode + ", addressUseCode=" + addressUseCode + ", addressStartDate=" + addressStartDate
				+ ", addressEndDate=" + addressEndDate + ", homeNumber=" + homeNumber + ", email=" + email
				+ ", custDispName=" + custDispName + ", custTypeCd=" + custTypeCd + ", custSubTypeCd=" + custSubTypeCd
				+ ", custStatusCd=" + custStatusCd + ", custStatusChangeDate=" + custStatusChangeDate
				+ ", custStatusChangeMethod=" + custStatusChangeMethod + ", preferredCurrCd=" + preferredCurrCd
				+ ", shortName=" + shortName + ", combinedStatementInd=" + combinedStatementInd + ", officerCd="
				+ officerCd + ", relationshipPricingInd=" + relationshipPricingInd + ", securityId=" + securityId
				+ ", languageCd=" + languageCd + ", refusedServiceInd=" + refusedServiceInd + ", regulatorClass="
				+ regulatorClass + ", samaClass=" + samaClass + ", officerEmployeeDirectorCd="
				+ officerEmployeeDirectorCd + ", institutionOfOfficerEmployeeDirector="
				+ institutionOfOfficerEmployeeDirector + ", insiderCd=" + insiderCd + ", institutionOfInsiderCd="
				+ institutionOfInsiderCd + ", relationToInsiderCd=" + relationToInsiderCd + ", vipCd=" + vipCd
				+ ", boardStaffCd=" + boardStaffCd + ", stockholderInd=" + stockholderInd + ", regionCd=" + regionCd
				+ ", openingBranch=" + openingBranch + ", responsibleBranch=" + responsibleBranch + ", preferredBranch="
				+ preferredBranch + ", marketingOfficerCd=" + marketingOfficerCd + ", loanOfficerCd=" + loanOfficerCd
				+ ", depositOfficerCd=" + depositOfficerCd + ", addedDate=" + addedDate + ", firstAcctDate="
				+ firstAcctDate + ", deletedDate=" + deletedDate + ", dateLastCustActivity=" + dateLastCustActivity
				+ ", inactiveDate=" + inactiveDate + ", dateLastCustContact=" + dateLastCustContact + ", dateLostCust="
				+ dateLostCust + ", reasonLostCustCd=" + reasonLostCustCd + ", frozenDate=" + frozenDate
				+ ", frozenFlag=" + frozenFlag + ", economicSector=" + economicSector + ", dobG=" + dobG + ", dobH="
				+ dobH + ", placeOfBirth=" + placeOfBirth + ", countryOfBirth=" + countryOfBirth + ", gender=" + gender
				+ ", raceCd=" + raceCd + ", educationLevel=" + educationLevel + ", deceasedDate=" + deceasedDate
				+ ", maritalCd=" + maritalCd + ", numberOfWives=" + numberOfWives + ", rbStaffFlag=" + rbStaffFlag
				+ ", rbStaffPosition=" + rbStaffPosition + ", citizenshipCountryCd=" + citizenshipCountryCd
				+ ", citizenAlienCd=" + citizenAlienCd + ", dateOfResidence=" + dateOfResidence + ", dateOfResidenceH="
				+ dateOfResidenceH + ", ownRentCd=" + ownRentCd + ", motherMaidenName=" + motherMaidenName
				+ ", numberOfChildren=" + numberOfChildren + ", numberOfDependents=" + numberOfDependents
				+ ", spouseName=" + spouseName + ", spouseMaidenName=" + spouseMaidenName + ", spouseDob=" + spouseDob
				+ ", driverLicense=" + driverLicense + ", driverLicenseSt=" + driverLicenseSt + ", passportIdNumber="
				+ passportIdNumber + ", passportIdCountry=" + passportIdCountry + ", webAdress=" + webAdress
				+ ", businessEstablishedDate=" + businessEstablishedDate + ", businessEstablishedDateH="
				+ businessEstablishedDateH + ", businessPrimaryBankName=" + businessPrimaryBankName
				+ ", numberOfEmployees=" + numberOfEmployees + ", ownerTypeCd=" + ownerTypeCd + ", smallBusinessInd="
				+ smallBusinessInd + ", lineOfBusiness1=" + lineOfBusiness1 + ", lineOfBusiness2=" + lineOfBusiness2
				+ ", lineOfBusiness3=" + lineOfBusiness3 + ", standardIndustrialClass1=" + standardIndustrialClass1
				+ ", standardIndustrialClass1Pct=" + standardIndustrialClass1Pct + ", standardIndustrialClass2="
				+ standardIndustrialClass2 + ", standardIndustrialClass2Pct=" + standardIndustrialClass2Pct
				+ ", crDebtClass=" + crDebtClass + ", kycDate=" + kycDate + ", interactionPreference="
				+ interactionPreference + ", willingToPay=" + willingToPay + ", riskPreference=" + riskPreference
				+ ", spendPreference=" + spendPreference + ", islamicPreference=" + islamicPreference
				+ ", contactPreference=" + contactPreference + ", billDeliveryType=" + billDeliveryType + ", callFlag="
				+ callFlag + ", emailFlag=" + emailFlag + ", mailFlag=" + mailFlag + ", sensitivityDegree="
				+ sensitivityDegree + ", annualResidenceRentalAmount=" + annualResidenceRentalAmount
				+ ", crAnnualIncome=" + crAnnualIncome + ", annualSalaryDepositedRb=" + annualSalaryDepositedRb
				+ ", monthlyAllowanceRange=" + monthlyAllowanceRange + ", financialInstitutionType="
				+ financialInstitutionType + ", salutation=" + salutation + ", emailAddress=" + emailAddress
				+ ", salesVolumeAmount=" + salesVolumeAmount + ", forgedIdFlag=" + forgedIdFlag + ", ucmId=" + ucmId
				+ ", crOdLimit=" + crOdLimit + ", bankcruptcyCd=" + bankcruptcyCd + ", bankcruptcyDate="
				+ bankcruptcyDate + ", numberOfOffices=" + numberOfOffices + ", localInstitutionCode="
				+ localInstitutionCode + ", businessLocation=" + businessLocation + ", areasOfSales=" + areasOfSales
				+ ", importExport=" + importExport + ", partyType=" + partyType + ", dateLastTypeChange="
				+ dateLastTypeChange + ", reasonLastTypeChange=" + reasonLastTypeChange + ", customerSinceDate="
				+ customerSinceDate + ", lastCustomerContactDate=" + lastCustomerContactDate + ", bankLines="
				+ bankLines + ", natureOfBank=" + natureOfBank + ", swiftCode=" + swiftCode + ", remarks=" + remarks
				+ ", history=" + history + ", version=" + version + ", vostro=" + vostro + ", nostro=" + nostro
				+ ", priority=" + priority + ", borrowing=" + borrowing + ", borrower=" + borrower + ", validatedFlag="
				+ validatedFlag + ", lastValidatedDate=" + lastValidatedDate + ", aliasName=" + aliasName
				+ ", aliasEName=" + aliasEName + ", aliasAName=" + aliasAName + ", naics=" + naics
				+ ", parentAccountName=" + parentAccountName + ", businessIncap=" + businessIncap
				+ ", businessMonthlyIncome=" + businessMonthlyIncome + ", exceptionExpiryDate=" + exceptionExpiryDate
				+ ", businessType=" + businessType + ", crType=" + crType + ", activity=" + activity + ", crStatus="
				+ crStatus + ", shareCapital=" + shareCapital + ", cashCapital=" + cashCapital + ", payrollStatus="
				+ payrollStatus + ", lastPayrollDate=" + lastPayrollDate + ", numberOfPayrollPayments="
				+ numberOfPayrollPayments + ", payrollType=" + payrollType + ", rbkycRiskScoreDate="
				+ rbkycRiskScoreDate + ", rbkycRiskScore=" + rbkycRiskScore + ", rbkycRiskNextRevDate="
				+ rbkycRiskNextRevDate + ", rbkycRiskCategory=" + rbkycRiskCategory + ", loyaltyFlag=" + loyaltyFlag
				+ ", lifeStatus=" + lifeStatus + ", legalStatus=" + legalStatus + ", facebookUserId=" + facebookUserId
				+ ", twitterUserId=" + twitterUserId + ", instagramUserId=" + instagramUserId + ", segmentCampaignId="
				+ segmentCampaignId + ", segmentReason=" + segmentReason + ", segmentRelatedCis=" + segmentRelatedCis
				+ ", waselnewCitycd=" + waselnewCitycd + ", waselnewRegioncd=" + waselnewRegioncd
				+ ", waselnewDistrictcd=" + waselnewDistrictcd + ", position=" + position + ", sourceOfIncome="
				+ sourceOfIncome + ", natheerStatus=" + natheerStatus + ", natheerFreezeReason=" + natheerFreezeReason
				+ ", businessTypeCode=" + businessTypeCode + ", branchCode=" + branchCode + ", eddLastUpdateDate="
				+ eddLastUpdateDate + ", eddFreezeReason=" + eddFreezeReason + ", taxReqistNo=" + taxReqistNo
				+ ", custIdentificationDetails=" + custIdentificationDetails + ", customerPhoneDetails="
				+ customerPhoneDetails + "]";
	}

	public GetCustomerDetailsResponse(GetCustomerDetailsBankHeaderResponse riyadBankHeader,
			SystematicsStatusMessage systematicsStatusMessage, String digitalSignatureFlag, String custFirstName,
			String custMiddleName, String custGrandfatherName, String custLastName, String custFirstEName,
			String custFirstAName, String custMiddleEName, String custMiddleAName, String custGrandfatherEName,
			String custGrandfatherAName, String custLastEName, String custLastAName, String custFullName,
			String custFullEName, String custFullAName, String poBox, String address1, String address2, String address3,
			String address4, String addressCity, String zip, String contactName, String addressSeqNumber, String county,
			String country, String unitNo, String stateRegion, String addressStatus, String addressTypeCode,
			String addressUseCode, String addressStartDate, String addressEndDate, String homeNumber, String email,
			String custDispName, String custTypeCd, String custSubTypeCd, String custStatusCd,
			String custStatusChangeDate, String custStatusChangeMethod, String preferredCurrCd, String shortName,
			String combinedStatementInd, String officerCd, String relationshipPricingInd, String securityId,
			String languageCd, String refusedServiceInd, String regulatorClass, String samaClass,
			String officerEmployeeDirectorCd, String institutionOfOfficerEmployeeDirector, String insiderCd,
			String institutionOfInsiderCd, String relationToInsiderCd, String vipCd, String boardStaffCd,
			String stockholderInd, String regionCd, String openingBranch, String responsibleBranch,
			String preferredBranch, String marketingOfficerCd, String loanOfficerCd, String depositOfficerCd,
			String addedDate, String firstAcctDate, String deletedDate, String dateLastCustActivity,
			String inactiveDate, String dateLastCustContact, String dateLostCust, String reasonLostCustCd,
			String frozenDate, String frozenFlag, String economicSector, String dobG, String dobH, String placeOfBirth,
			String countryOfBirth, String gender, String raceCd, String educationLevel, String deceasedDate,
			String maritalCd, String numberOfWives, String rbStaffFlag, String rbStaffPosition,
			String citizenshipCountryCd, String citizenAlienCd, String dateOfResidence, String dateOfResidenceH,
			String ownRentCd, String motherMaidenName, String numberOfChildren, String numberOfDependents,
			String spouseName, String spouseMaidenName, String spouseDob, String driverLicense, String driverLicenseSt,
			String passportIdNumber, String passportIdCountry, String webAdress, String businessEstablishedDate,
			String businessEstablishedDateH, String businessPrimaryBankName, String numberOfEmployees,
			String ownerTypeCd, String smallBusinessInd, String lineOfBusiness1, String lineOfBusiness2,
			String lineOfBusiness3, String standardIndustrialClass1, String standardIndustrialClass1Pct,
			String standardIndustrialClass2, String standardIndustrialClass2Pct, String crDebtClass, String kycDate,
			String interactionPreference, String willingToPay, String riskPreference, String spendPreference,
			String islamicPreference, String contactPreference, String billDeliveryType, String callFlag,
			String emailFlag, String mailFlag, String sensitivityDegree, String annualResidenceRentalAmount,
			String crAnnualIncome, String annualSalaryDepositedRb, String monthlyAllowanceRange,
			String financialInstitutionType, String salutation, String emailAddress, String salesVolumeAmount,
			String forgedIdFlag, String ucmId, String crOdLimit, String bankcruptcyCd, String bankcruptcyDate,
			String numberOfOffices, String localInstitutionCode, String businessLocation, String areasOfSales,
			String importExport, String partyType, String dateLastTypeChange, String reasonLastTypeChange,
			String customerSinceDate, String lastCustomerContactDate, String bankLines, String natureOfBank,
			String swiftCode, String remarks, String history, String version, String vostro, String nostro,
			String priority, String borrowing, String borrower, String validatedFlag, String lastValidatedDate,
			String aliasName, String aliasEName, String aliasAName, String naics, String parentAccountName,
			String businessIncap, String businessMonthlyIncome, String exceptionExpiryDate, String businessType,
			String crType, String activity, String crStatus, String shareCapital, String cashCapital,
			String payrollStatus, String lastPayrollDate, String numberOfPayrollPayments, String payrollType,
			String rbkycRiskScoreDate, String rbkycRiskScore, String rbkycRiskNextRevDate, String rbkycRiskCategory,
			String loyaltyFlag, String lifeStatus, String legalStatus, String facebookUserId, String twitterUserId,
			String instagramUserId, String segmentCampaignId, String segmentReason, String segmentRelatedCis,
			String waselnewCitycd, String waselnewRegioncd, String waselnewDistrictcd, String position,
			String sourceOfIncome, String natheerStatus, String natheerFreezeReason, String businessTypeCode,
			String branchCode, String eddLastUpdateDate, String eddFreezeReason, String taxReqistNo,
			List<CustomerIdentificationDet> custIdentificationDetails,
			List<CustomerPhoneDetails> customerPhoneDetails) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.systematicsStatusMessage = systematicsStatusMessage;
		this.digitalSignatureFlag = digitalSignatureFlag;
		this.custFirstName = custFirstName;
		this.custMiddleName = custMiddleName;
		this.custGrandfatherName = custGrandfatherName;
		this.custLastName = custLastName;
		this.custFirstEName = custFirstEName;
		this.custFirstAName = custFirstAName;
		this.custMiddleEName = custMiddleEName;
		this.custMiddleAName = custMiddleAName;
		this.custGrandfatherEName = custGrandfatherEName;
		this.custGrandfatherAName = custGrandfatherAName;
		this.custLastEName = custLastEName;
		this.custLastAName = custLastAName;
		this.custFullName = custFullName;
		this.custFullEName = custFullEName;
		this.custFullAName = custFullAName;
		this.poBox = poBox;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.address4 = address4;
		this.addressCity = addressCity;
		this.zip = zip;
		this.contactName = contactName;
		this.addressSeqNumber = addressSeqNumber;
		this.county = county;
		this.country = country;
		this.unitNo = unitNo;
		this.stateRegion = stateRegion;
		this.addressStatus = addressStatus;
		this.addressTypeCode = addressTypeCode;
		this.addressUseCode = addressUseCode;
		this.addressStartDate = addressStartDate;
		this.addressEndDate = addressEndDate;
		this.homeNumber = homeNumber;
		this.email = email;
		this.custDispName = custDispName;
		this.custTypeCd = custTypeCd;
		this.custSubTypeCd = custSubTypeCd;
		this.custStatusCd = custStatusCd;
		this.custStatusChangeDate = custStatusChangeDate;
		this.custStatusChangeMethod = custStatusChangeMethod;
		this.preferredCurrCd = preferredCurrCd;
		this.shortName = shortName;
		this.combinedStatementInd = combinedStatementInd;
		this.officerCd = officerCd;
		this.relationshipPricingInd = relationshipPricingInd;
		this.securityId = securityId;
		this.languageCd = languageCd;
		this.refusedServiceInd = refusedServiceInd;
		this.regulatorClass = regulatorClass;
		this.samaClass = samaClass;
		this.officerEmployeeDirectorCd = officerEmployeeDirectorCd;
		this.institutionOfOfficerEmployeeDirector = institutionOfOfficerEmployeeDirector;
		this.insiderCd = insiderCd;
		this.institutionOfInsiderCd = institutionOfInsiderCd;
		this.relationToInsiderCd = relationToInsiderCd;
		this.vipCd = vipCd;
		this.boardStaffCd = boardStaffCd;
		this.stockholderInd = stockholderInd;
		this.regionCd = regionCd;
		this.openingBranch = openingBranch;
		this.responsibleBranch = responsibleBranch;
		this.preferredBranch = preferredBranch;
		this.marketingOfficerCd = marketingOfficerCd;
		this.loanOfficerCd = loanOfficerCd;
		this.depositOfficerCd = depositOfficerCd;
		this.addedDate = addedDate;
		this.firstAcctDate = firstAcctDate;
		this.deletedDate = deletedDate;
		this.dateLastCustActivity = dateLastCustActivity;
		this.inactiveDate = inactiveDate;
		this.dateLastCustContact = dateLastCustContact;
		this.dateLostCust = dateLostCust;
		this.reasonLostCustCd = reasonLostCustCd;
		this.frozenDate = frozenDate;
		this.frozenFlag = frozenFlag;
		this.economicSector = economicSector;
		this.dobG = dobG;
		this.dobH = dobH;
		this.placeOfBirth = placeOfBirth;
		this.countryOfBirth = countryOfBirth;
		this.gender = gender;
		this.raceCd = raceCd;
		this.educationLevel = educationLevel;
		this.deceasedDate = deceasedDate;
		this.maritalCd = maritalCd;
		this.numberOfWives = numberOfWives;
		this.rbStaffFlag = rbStaffFlag;
		this.rbStaffPosition = rbStaffPosition;
		this.citizenshipCountryCd = citizenshipCountryCd;
		this.citizenAlienCd = citizenAlienCd;
		this.dateOfResidence = dateOfResidence;
		this.dateOfResidenceH = dateOfResidenceH;
		this.ownRentCd = ownRentCd;
		this.motherMaidenName = motherMaidenName;
		this.numberOfChildren = numberOfChildren;
		this.numberOfDependents = numberOfDependents;
		this.spouseName = spouseName;
		this.spouseMaidenName = spouseMaidenName;
		this.spouseDob = spouseDob;
		this.driverLicense = driverLicense;
		this.driverLicenseSt = driverLicenseSt;
		this.passportIdNumber = passportIdNumber;
		this.passportIdCountry = passportIdCountry;
		this.webAdress = webAdress;
		this.businessEstablishedDate = businessEstablishedDate;
		this.businessEstablishedDateH = businessEstablishedDateH;
		this.businessPrimaryBankName = businessPrimaryBankName;
		this.numberOfEmployees = numberOfEmployees;
		this.ownerTypeCd = ownerTypeCd;
		this.smallBusinessInd = smallBusinessInd;
		this.lineOfBusiness1 = lineOfBusiness1;
		this.lineOfBusiness2 = lineOfBusiness2;
		this.lineOfBusiness3 = lineOfBusiness3;
		this.standardIndustrialClass1 = standardIndustrialClass1;
		this.standardIndustrialClass1Pct = standardIndustrialClass1Pct;
		this.standardIndustrialClass2 = standardIndustrialClass2;
		this.standardIndustrialClass2Pct = standardIndustrialClass2Pct;
		this.crDebtClass = crDebtClass;
		this.kycDate = kycDate;
		this.interactionPreference = interactionPreference;
		this.willingToPay = willingToPay;
		this.riskPreference = riskPreference;
		this.spendPreference = spendPreference;
		this.islamicPreference = islamicPreference;
		this.contactPreference = contactPreference;
		this.billDeliveryType = billDeliveryType;
		this.callFlag = callFlag;
		this.emailFlag = emailFlag;
		this.mailFlag = mailFlag;
		this.sensitivityDegree = sensitivityDegree;
		this.annualResidenceRentalAmount = annualResidenceRentalAmount;
		this.crAnnualIncome = crAnnualIncome;
		this.annualSalaryDepositedRb = annualSalaryDepositedRb;
		this.monthlyAllowanceRange = monthlyAllowanceRange;
		this.financialInstitutionType = financialInstitutionType;
		this.salutation = salutation;
		this.emailAddress = emailAddress;
		this.salesVolumeAmount = salesVolumeAmount;
		this.forgedIdFlag = forgedIdFlag;
		this.ucmId = ucmId;
		this.crOdLimit = crOdLimit;
		this.bankcruptcyCd = bankcruptcyCd;
		this.bankcruptcyDate = bankcruptcyDate;
		this.numberOfOffices = numberOfOffices;
		this.localInstitutionCode = localInstitutionCode;
		this.businessLocation = businessLocation;
		this.areasOfSales = areasOfSales;
		this.importExport = importExport;
		this.partyType = partyType;
		this.dateLastTypeChange = dateLastTypeChange;
		this.reasonLastTypeChange = reasonLastTypeChange;
		this.customerSinceDate = customerSinceDate;
		this.lastCustomerContactDate = lastCustomerContactDate;
		this.bankLines = bankLines;
		this.natureOfBank = natureOfBank;
		this.swiftCode = swiftCode;
		this.remarks = remarks;
		this.history = history;
		this.version = version;
		this.vostro = vostro;
		this.nostro = nostro;
		this.priority = priority;
		this.borrowing = borrowing;
		this.borrower = borrower;
		this.validatedFlag = validatedFlag;
		this.lastValidatedDate = lastValidatedDate;
		this.aliasName = aliasName;
		this.aliasEName = aliasEName;
		this.aliasAName = aliasAName;
		this.naics = naics;
		this.parentAccountName = parentAccountName;
		this.businessIncap = businessIncap;
		this.businessMonthlyIncome = businessMonthlyIncome;
		this.exceptionExpiryDate = exceptionExpiryDate;
		this.businessType = businessType;
		this.crType = crType;
		this.activity = activity;
		this.crStatus = crStatus;
		this.shareCapital = shareCapital;
		this.cashCapital = cashCapital;
		this.payrollStatus = payrollStatus;
		this.lastPayrollDate = lastPayrollDate;
		this.numberOfPayrollPayments = numberOfPayrollPayments;
		this.payrollType = payrollType;
		this.rbkycRiskScoreDate = rbkycRiskScoreDate;
		this.rbkycRiskScore = rbkycRiskScore;
		this.rbkycRiskNextRevDate = rbkycRiskNextRevDate;
		this.rbkycRiskCategory = rbkycRiskCategory;
		this.loyaltyFlag = loyaltyFlag;
		this.lifeStatus = lifeStatus;
		this.legalStatus = legalStatus;
		this.facebookUserId = facebookUserId;
		this.twitterUserId = twitterUserId;
		this.instagramUserId = instagramUserId;
		this.segmentCampaignId = segmentCampaignId;
		this.segmentReason = segmentReason;
		this.segmentRelatedCis = segmentRelatedCis;
		this.waselnewCitycd = waselnewCitycd;
		this.waselnewRegioncd = waselnewRegioncd;
		this.waselnewDistrictcd = waselnewDistrictcd;
		this.position = position;
		this.sourceOfIncome = sourceOfIncome;
		this.natheerStatus = natheerStatus;
		this.natheerFreezeReason = natheerFreezeReason;
		this.businessTypeCode = businessTypeCode;
		this.branchCode = branchCode;
		this.eddLastUpdateDate = eddLastUpdateDate;
		this.eddFreezeReason = eddFreezeReason;
		this.taxReqistNo = taxReqistNo;
		this.custIdentificationDetails = custIdentificationDetails;
		this.customerPhoneDetails = customerPhoneDetails;
	}

	public GetCustomerDetailsResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
