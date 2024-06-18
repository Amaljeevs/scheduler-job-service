package com.alfaris.esb.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RepeatingGroupSection {

	@JsonProperty("Customer_Detail")
	private List<CustomerDetails> customerDetail;

	@JsonProperty("Account_Detail")
	private List<AccountDetails> accountDetail;

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

	@Override
	public String toString() {
		return "RepeatingGroupSection [customerDetail=" + customerDetail + ", accountDetail=" + accountDetail + "]";
	}

	public RepeatingGroupSection(List<CustomerDetails> customerDetail, List<AccountDetails> accountDetail) {
		super();
		this.customerDetail = customerDetail;
		this.accountDetail = accountDetail;
	}

	public RepeatingGroupSection() {
		super();
		// TODO Auto-generated constructor stub
	}

}
