package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StmPostDepositAccountMaintHeaderRs {

	@JsonProperty("tsRsHdr")
	private StmTSRsHdr tSRsHdr;

	public StmTSRsHdr gettSRsHdr() {
		return tSRsHdr;
	}

	public void settSRsHdr(StmTSRsHdr tSRsHdr) {
		this.tSRsHdr = tSRsHdr;
	}

	public StmPostDepositAccountMaintHeaderRs(StmTSRsHdr tSRsHdr) {
		super();
		this.tSRsHdr = tSRsHdr;
	}

	public StmPostDepositAccountMaintHeaderRs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StmPostDepositAccountMaintHeaderRs [tSRsHdr=" + tSRsHdr + "]";
	}

}
