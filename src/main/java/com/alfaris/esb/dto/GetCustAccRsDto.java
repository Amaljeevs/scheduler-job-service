package com.alfaris.esb.dto;

import java.io.Serializable;
import java.util.List;

public class GetCustAccRsDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private RiyadBankHeader riyadBankHeader;
//    private RepeatingGroupSection repeatingGroupSection;

//	@JsonProperty("Customer_Detail")
	private List<CustomerDetails> customerDetail;

//	@JsonProperty("Account_Detail")
	private List<AccountDetails> accountDetail;

	// RiyadBankHeader getters and setters
	public RiyadBankHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(RiyadBankHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public GetCustAccRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GetCustAccRsDto [riyadBankHeader=" + riyadBankHeader + ", customerDetail=" + customerDetail
				+ ", accountDetail=" + accountDetail + "]";
	}

	public GetCustAccRsDto(RiyadBankHeader riyadBankHeader, List<CustomerDetails> customerDetail,
			List<AccountDetails> accountDetail) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.customerDetail = customerDetail;
		this.accountDetail = accountDetail;
	}

	public List<CustomerDetails> getCustomerDetail() {
		return customerDetail;
	}

	public void setCustomerDetail(List<CustomerDetails> customerDetail) {
		this.customerDetail = customerDetail;
	}

	public List<AccountDetails> getAccountDetail() {
		return accountDetail;
	}

	public void setAccountDetail(List<AccountDetails> accountDetail) {
		this.accountDetail = accountDetail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
