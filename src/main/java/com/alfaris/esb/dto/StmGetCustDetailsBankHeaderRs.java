package com.alfaris.esb.dto;

import java.util.ArrayList;

public class StmGetCustDetailsBankHeaderRs {

	private TsRsHdr tsRsHdr;
	private ArrayList<GetCustDetailsRs> getCustDetailsRs;
	public TsRsHdr getTsRsHdr() {
		return tsRsHdr;
	}
	public void setTsRsHdr(TsRsHdr tsRsHdr) {
		this.tsRsHdr = tsRsHdr;
	}
	public ArrayList<GetCustDetailsRs> getGetCustDetailsRs() {
		return getCustDetailsRs;
	}
	public void setGetCustDetailsRs(ArrayList<GetCustDetailsRs> getCustDetailsRs) {
		this.getCustDetailsRs = getCustDetailsRs;
	}
	public StmGetCustDetailsBankHeaderRs() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StmGetCustDetailsBankHeaderRs [tsRsHdr=" + tsRsHdr + ", getCustDetailsRs=" + getCustDetailsRs + "]";
	}

	
	
	

}
