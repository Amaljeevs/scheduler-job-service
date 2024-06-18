package com.alfaris.esb.dto;

public class CustomerCrossreference {

	private String crossSysName;
	private String crossRefNum;

	public String getCrossSysName() {
		return crossSysName;
	}

	public void setCrossSysName(String crossSysName) {
		this.crossSysName = crossSysName;
	}

	public String getCrossRefNum() {
		return crossRefNum;
	}

	public void setCrossRefNum(String crossRefNum) {
		this.crossRefNum = crossRefNum;
	}

	public CustomerCrossreference(String crossSysName, String crossRefNum) {
		super();
		this.crossSysName = crossSysName;
		this.crossRefNum = crossRefNum;
	}

	public CustomerCrossreference() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerCrossreference [crossSysName=" + crossSysName + ", crossRefNum=" + crossRefNum + "]";
	}

}
