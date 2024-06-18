package com.alfaris.esb.dto;

public class ListOfAddlInfo {

	private AddlInfo addlInfo;

	public AddlInfo getAddlInfo() {
		return addlInfo;
	}

	public void setAddlInfo(AddlInfo addlInfo) {
		this.addlInfo = addlInfo;
	}

	public ListOfAddlInfo(AddlInfo addlInfo) {
		super();
		this.addlInfo = addlInfo;
	}

	public ListOfAddlInfo() {
		super();
	}

	@Override
	public String toString() {
		return "ListOfAddlInfo [addlInfo=" + addlInfo + "]";
	}

}
