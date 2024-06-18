package com.alfaris.esb.dto;

public class VipAccountEscRq {

	private String cisNumber;

	private String branchNumber;

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

	@Override
	public String toString() {
		return "VipAccountEscRq [cisNumber=" + cisNumber + ", branchNumber=" + branchNumber + "]";
	}

	public VipAccountEscRq(String cisNumber, String branchNumber) {
		super();
		this.cisNumber = cisNumber;
		this.branchNumber = branchNumber;

	}

	public VipAccountEscRq() {
		super();
		// TODO Auto-generated constructor stub
	}

}
