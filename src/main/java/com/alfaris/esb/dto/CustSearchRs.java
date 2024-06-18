package com.alfaris.esb.dto;

public class CustSearchRs {

	private CustSearchHeaderRs riyadBankHeader;
	private String pageSize;
	private String forwardBackwardInd;
	private String pageMarker;
	private String repeatingGroupSection;
	private CustSearchRepeatingGroup repeatingGroup;
	private CustSearchSystematicsStatusMsg systematicsStatusMessage;

	public CustSearchSystematicsStatusMsg getSystematicsStatusMessage() {
		return systematicsStatusMessage;
	}

	public void setSystematicsStatusMessage(CustSearchSystematicsStatusMsg systematicsStatusMessage) {
		this.systematicsStatusMessage = systematicsStatusMessage;
	}

	public CustSearchHeaderRs getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(CustSearchHeaderRs riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
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

	public String getRepeatingGroupSection() {
		return repeatingGroupSection;
	}

	public void setRepeatingGroupSection(String repeatingGroupSection) {
		this.repeatingGroupSection = repeatingGroupSection;
	}

	public CustSearchRepeatingGroup getRepeatingGroup() {
		return repeatingGroup;
	}

	public void setRepeatingGroup(CustSearchRepeatingGroup repeatingGroup) {
		this.repeatingGroup = repeatingGroup;
	}

	public CustSearchRs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CustSearchRs [riyadBankHeader=" + riyadBankHeader + ", pageSize=" + pageSize + ", forwardBackwardInd="
				+ forwardBackwardInd + ", pageMarker=" + pageMarker + ", repeatingGroupSection=" + repeatingGroupSection
				+ ", repeatingGroup=" + repeatingGroup + ", systematicsStatusMessage=" + systematicsStatusMessage + "]";
	}

	

}
