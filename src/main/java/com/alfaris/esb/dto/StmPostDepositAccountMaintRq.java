package com.alfaris.esb.dto;

import java.util.ArrayList;

public class StmPostDepositAccountMaintRq {
	
	private String accountType;
	private String accountCurrencyCode;
	private String branchNumber;
	private String acctId;
	private ArrayList<GenericFieldList> genericFieldList;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountCurrencyCode() {
		return accountCurrencyCode;
	}
	public void setAccountCurrencyCode(String accountCurrencyCode) {
		this.accountCurrencyCode = accountCurrencyCode;
	}
	public String getBranchNumber() {
		return branchNumber;
	}
	public void setBranchNumber(String branchNumber) {
		this.branchNumber = branchNumber;
	}
	public String getAcctId() {
		return acctId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}
	public ArrayList<GenericFieldList> getGenericFieldList() {
		return genericFieldList;
	}
	public void setGenericFieldList(ArrayList<GenericFieldList> genericFieldList) {
		this.genericFieldList = genericFieldList;
	}
	public StmPostDepositAccountMaintRq(String accountType, String accountCurrencyCode, String branchNumber,
			String acctId, ArrayList<GenericFieldList> genericFieldList, FalconData falconData) {
		super();
		this.accountType = accountType;
		this.accountCurrencyCode = accountCurrencyCode;
		this.branchNumber = branchNumber;
		this.acctId = acctId;
		this.genericFieldList = genericFieldList;
	}
	public StmPostDepositAccountMaintRq() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StmPostDepositAccountMaintRq [accountType=" + accountType + ", accountCurrencyCode="
				+ accountCurrencyCode + ", branchNumber=" + branchNumber + ", acctId=" + acctId + ", genericFieldList="
				+ genericFieldList + "]";
	}
	
	

}
