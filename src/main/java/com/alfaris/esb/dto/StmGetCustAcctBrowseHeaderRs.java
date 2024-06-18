package com.alfaris.esb.dto;

import java.util.ArrayList;

public class StmGetCustAcctBrowseHeaderRs {
	private TestHdrRs tsRsHdr;
	private ArrayList<GetCustAcctBrowseRs> getCustAcctBrowseRs;
	public TestHdrRs getTsRsHdr() {
		return tsRsHdr;
	}
	public void setTsRsHdr(TestHdrRs tsRsHdr) {
		this.tsRsHdr = tsRsHdr;
	}
	public ArrayList<GetCustAcctBrowseRs> getGetCustAcctBrowseRs() {
		return getCustAcctBrowseRs;
	}
	public void setGetCustAcctBrowseRs(ArrayList<GetCustAcctBrowseRs> getCustAcctBrowseRs) {
		this.getCustAcctBrowseRs = getCustAcctBrowseRs;
	}
	@Override
	public String toString() {
		return "StmGetCustAcctBrowseHeaderRs [tsRsHdr=" + tsRsHdr + ", getCustAcctBrowseRs=" + getCustAcctBrowseRs
				+ "]";
	}
	public StmGetCustAcctBrowseHeaderRs(TestHdrRs tsRsHdr, ArrayList<GetCustAcctBrowseRs> getCustAcctBrowseRs) {
		super();
		this.tsRsHdr = tsRsHdr;
		this.getCustAcctBrowseRs = getCustAcctBrowseRs;
	}
	public StmGetCustAcctBrowseHeaderRs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
