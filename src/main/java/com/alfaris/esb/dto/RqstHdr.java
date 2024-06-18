package com.alfaris.esb.dto;

public class RqstHdr {

	private String lclPref;

	public String getLclPref() {
		return lclPref;
	}

	public void setLclPref(String lclPref) {
		this.lclPref = lclPref;
	}

	@Override
	public String toString() {
		return "RqstHdr [lclPref=" + lclPref + "]";
	}

	public RqstHdr(String lclPref) {
		super();
		this.lclPref = lclPref;
	}

	public RqstHdr() {
		super();
	}

}
