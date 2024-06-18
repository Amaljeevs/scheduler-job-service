package com.alfaris.esb.dto;

public class StmRqHdr {
	private String lclPref;

	public String getLclPref() {
		return lclPref;
	}

	public void setLclPref(String lclPref) {
		this.lclPref = lclPref;
	}

	@Override
	public String toString() {
		return "StmRqHdr [lclPref=" + lclPref + "]";
	}

	public StmRqHdr(String lclPref) {
		super();
		this.lclPref = lclPref;
	}

	public StmRqHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
