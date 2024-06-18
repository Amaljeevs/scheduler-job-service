package com.alfaris.esb.dto;

public class GetCustomerDetailsRequest {

	private GetCustomerDetailsBankHeaderRequest riyadBankHeader;
	private String actionRequired;

	private CustIdDetails custIdentificationDetails;

	public CustIdDetails getCustIdentificationDetails() {
		return custIdentificationDetails;
	}

	public void setCustIdentificationDetails(CustIdDetails custIdentificationDetails) {
		this.custIdentificationDetails = custIdentificationDetails;
	}

	public GetCustomerDetailsBankHeaderRequest getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(GetCustomerDetailsBankHeaderRequest riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getActionRequired() {
		return actionRequired;
	}

	public void setActionRequired(String actionRequired) {
		this.actionRequired = actionRequired;
	}

	public GetCustomerDetailsRequest(GetCustomerDetailsBankHeaderRequest riyadBankHeader, String actionRequired,
			CustIdDetails custIdentificationDetails) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.actionRequired = actionRequired;
		this.custIdentificationDetails = custIdentificationDetails;
	}

	public GetCustomerDetailsRequest() {
		super();
	}

	@Override
	public String toString() {
		return "GetCustomerDetailsRequest [riyadBankHeader=" + riyadBankHeader + ", actionRequired=" + actionRequired
				+ "]";
	}

}
