package com.alfaris.esb.dto;

public class GetVipAccountRsDto {
	
	private GetVipAccountRsHeader riyadBankHeader;
	
	private String mode;
	 
	private String acctPattern;
	
	private String acctCurrency;
	
	private String acctType;
	
	private String acctNumber;
	
	private String pageSize;
	
	private String forwardBackwardInd;
	
	private String pageMarker;
	
	private GetVipAccountRepeatingGroupSection repeatingGroupSection;

	public GetVipAccountRsHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(GetVipAccountRsHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getAcctPattern() {
		return acctPattern;
	}

	public void setAcctPattern(String acctPattern) {
		this.acctPattern = acctPattern;
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

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getForwardBackwardInd() {
		return forwardBackwardInd;
	}

	public void setForwardBackwardInd(String forwardBackwardInd) {
		this.forwardBackwardInd = forwardBackwardInd;
	}

	public String getPageMarker() {
		return pageMarker;
	}

	public void setPageMarker(String pageMarker) {
		this.pageMarker = pageMarker;
	}

	public GetVipAccountRepeatingGroupSection getRepeatingGroupSection() {
		return repeatingGroupSection;
	}

	public void setRepeatingGroupSection(GetVipAccountRepeatingGroupSection repeatingGroupSection) {
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public GetVipAccountRsDto(GetVipAccountRsHeader riyadBankHeader, String mode, String acctPattern,
			String acctCurrency, String acctType, String acctNumber, String pageSize, String forwardBackwardInd,
			String pageMarker, GetVipAccountRepeatingGroupSection repeatingGroupSection) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.mode = mode;
		this.acctPattern = acctPattern;
		this.acctCurrency = acctCurrency;
		this.acctType = acctType;
		this.acctNumber = acctNumber;
		this.pageSize = pageSize;
		this.forwardBackwardInd = forwardBackwardInd;
		this.pageMarker = pageMarker;
		this.repeatingGroupSection = repeatingGroupSection;
	}

	@Override
	public String toString() {
		return "GetVipAccountRsDto [riyadBankHeader=" + riyadBankHeader + ", mode=" + mode + ", acctPattern="
				+ acctPattern + ", acctCurrency=" + acctCurrency + ", acctType=" + acctType + ", acctNumber="
				+ acctNumber + ", pageSize=" + pageSize + ", forwardBackwardInd=" + forwardBackwardInd + ", pageMarker="
				+ pageMarker + ", repeatingGroupSection=" + repeatingGroupSection + "]";
	}

	public GetVipAccountRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
