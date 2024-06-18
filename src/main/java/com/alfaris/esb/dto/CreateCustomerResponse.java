package com.alfaris.esb.dto;

public class CreateCustomerResponse {

	private ResponseRiyadBankHeader riyadBankHeader;

	private ResponseSystematicsStatusMessage systematicsStatusMessage;

	private String cisNumber;

	public ResponseRiyadBankHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(ResponseRiyadBankHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public ResponseSystematicsStatusMessage getSystematicsStatusMessage() {
		return systematicsStatusMessage;
	}

	public void setSystematicsStatusMessage(ResponseSystematicsStatusMessage systematicsStatusMessage) {
		this.systematicsStatusMessage = systematicsStatusMessage;
	}

	public String getCisNumber() {
		return cisNumber;
	}

	public void setCisNumber(String cisNumber) {
		this.cisNumber = cisNumber;
	}

	public CreateCustomerResponse(ResponseRiyadBankHeader riyadBankHeader,
			ResponseSystematicsStatusMessage systematicsStatusMessage, String cisNumber) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.systematicsStatusMessage = systematicsStatusMessage;
		this.cisNumber = cisNumber;
	}

	public CreateCustomerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CreateCustomerResponse [riyadBankHeader=" + riyadBankHeader + ", systematicsStatusMessage="
				+ systematicsStatusMessage + ", cisNumber=" + cisNumber + "]";
	}

}
