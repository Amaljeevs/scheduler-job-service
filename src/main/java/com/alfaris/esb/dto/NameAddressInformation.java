package com.alfaris.esb.dto;

public class NameAddressInformation {
	
	private String acctNameAddressLineFlag;

	private String acctNameAddress;

	public String getAcctNameAddressLineFlag() {
		return acctNameAddressLineFlag;
	}

	public void setAcctNameAddressLineFlag(String acctNameAddressLineFlag) {
		this.acctNameAddressLineFlag = acctNameAddressLineFlag;
	}

	public String getAcctNameAddress() {
		return acctNameAddress;
	}

	public void setAcctNameAddress(String acctNameAddress) {
		this.acctNameAddress = acctNameAddress;
	}

	public NameAddressInformation(String acctNameAddressLineFlag, String acctNameAddress) {
		super();
		this.acctNameAddressLineFlag = acctNameAddressLineFlag;
		this.acctNameAddress = acctNameAddress;
	}

	public NameAddressInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NameAddressInformation [acctNameAddressLineFlag=" + acctNameAddressLineFlag + ", acctNameAddress="
				+ acctNameAddress + "]";
	}

}
