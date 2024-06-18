package com.alfaris.esb.dto;

public class StmPostRqstHdr {
	
	private String lclPref;

	public String getLclPref() {
		return lclPref;
	}

	public void setLclPref(String lclPref) {
		this.lclPref = lclPref;
	}

	public StmPostRqstHdr(String lclPref) {
		super();
		this.lclPref = lclPref;
	}

	public StmPostRqstHdr() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "stmpostrqstHdr [lclPref=" + lclPref + "]";
	}
	
	

}
