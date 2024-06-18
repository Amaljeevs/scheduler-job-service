package com.alfaris.esb.dto;

public class RepeatingGroup {
	
	private String acctNumber;

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public RepeatingGroup(String acctNumber) {
		super();
		this.acctNumber = acctNumber;
	}

	@Override
	public String toString() {
		return "RepeatingGroup [acctNumber=" + acctNumber + "]";
	}

	public RepeatingGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
