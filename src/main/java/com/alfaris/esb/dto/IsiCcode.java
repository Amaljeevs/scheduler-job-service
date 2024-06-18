package com.alfaris.esb.dto;

public class IsiCcode {

	private String isiCcode;

	public String getIsiCcode() {
		return isiCcode;
	}

	public void setIsiCcode(String isiCcode) {
		this.isiCcode = isiCcode;
	}

	public IsiCcode(String isiCcode) {
		super();
		this.isiCcode = isiCcode;
	}

	public IsiCcode() {
		super();
	}

	@Override
	public String toString() {
		return "IsiCcode [isiCcode=" + isiCcode + "]";
	}

}
