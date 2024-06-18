package com.alfaris.esb.dto;

public class AccountCreationDTO {

	
	private String accType;
	
	private String cisNumber;
	
	private String branchNumber;
	
	private String mobilenumber;
	
	private String employeeId;
	
	private String acctProductType;
	
	private String shortName;
	
	private String standerdIndustrial;
	
	private String validSaudiId;
	
	private String custTypeCd;
	
	private String custSubTypeCd;
	
	private String acctNameAddressLine;
	
	private String accntNameAddress;

	
	public AccountCreationDTO(String accType, String cisNumber, String branchNumber, String mobilenumber,
			String employeeId, String acctProductType, String shortName, String standerdIndustrial, String validSaudiId,
			String custTypeCd, String custSubTypeCd, String acctNameAddressLine, String accntNameAddress) {
		super();
		this.accType = accType;
		this.cisNumber = cisNumber;
		this.branchNumber = branchNumber;
		this.mobilenumber = mobilenumber;
		this.employeeId = employeeId;
		this.acctProductType = acctProductType;
		this.shortName = shortName;
		this.standerdIndustrial = standerdIndustrial;
		this.validSaudiId = validSaudiId;
		this.custTypeCd = custTypeCd;
		this.custSubTypeCd = custSubTypeCd;
		this.acctNameAddressLine = acctNameAddressLine;
		this.accntNameAddress = accntNameAddress;
	}

	public AccountCreationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public String getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getAcctProductType() {
		return acctProductType;
	}

	public void setAcctProductType(String acctProductType) {
		this.acctProductType = acctProductType;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getStanderdIndustrial() {
		return standerdIndustrial;
	}

	public void setStanderdIndustrial(String standerdIndustrial) {
		this.standerdIndustrial = standerdIndustrial;
	}

	public String getValidSaudiId() {
		return validSaudiId;
	}

	public void setValidSaudiId(String validSaudiId) {
		this.validSaudiId = validSaudiId;
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

	

	public String getAcctNameAddressLine() {
		return acctNameAddressLine;
	}

	public void setAcctNameAddressLine(String acctNameAddressLine) {
		this.acctNameAddressLine = acctNameAddressLine;
	}

	public String getAccntNameAddress() {
		return accntNameAddress;
	}

	public void setAccntNameAddress(String accntNameAddress) {
		this.accntNameAddress = accntNameAddress;
	}
	
	
	
	
	
	
}
