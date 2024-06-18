package com.alfaris.esb.dto;

public class ListOfIsicCodes {

	private IsiCcode isiCcode;

	public IsiCcode getIsiCcode() {
		return isiCcode;
	}

	public void setIsiCcode(IsiCcode isiCcode) {
		this.isiCcode = isiCcode;
	}

	public ListOfIsicCodes(IsiCcode isiCcode) {
		super();
		this.isiCcode = isiCcode;
	}

	public ListOfIsicCodes() {
		super();
	}

	@Override
	public String toString() {
		return "ListOfIsicCodes [isiCcode=" + isiCcode + "]";
	}

}
