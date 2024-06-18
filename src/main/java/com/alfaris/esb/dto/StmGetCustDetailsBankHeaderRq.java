package com.alfaris.esb.dto;

public class StmGetCustDetailsBankHeaderRq {

	private RqstHdr rqstHdr;
	private TsRqHdr tsRqHdr;
	private GetCustDetailsRq getCustDetailsRq;

	public RqstHdr getRqstHdr() {
		return rqstHdr;
	}

	public void setRqstHdr(RqstHdr rqstHdr) {
		this.rqstHdr = rqstHdr;
	}

	public TsRqHdr getTsRqHdr() {
		return tsRqHdr;
	}

	public void setTsRqHdr(TsRqHdr tsRqHdr) {
		this.tsRqHdr = tsRqHdr;
	}

	public GetCustDetailsRq getGetCustDetailsRq() {
		return getCustDetailsRq;
	}

	public void setGetCustDetailsRq(GetCustDetailsRq getCustDetailsRq) {
		this.getCustDetailsRq = getCustDetailsRq;
	}

	@Override
	public String toString() {
		return "StmGetCustDetailsBankHeaderRq [rqstHdr=" + rqstHdr + ", tsRqHdr=" + tsRqHdr + ", getCustDetailsRq="
				+ getCustDetailsRq + "]";
	}

	public StmGetCustDetailsBankHeaderRq() {
		super();
	}

	public StmGetCustDetailsBankHeaderRq(RqstHdr rqstHdr, TsRqHdr tsRqHdr, GetCustDetailsRq getCustDetailsRq) {
		super();
		this.rqstHdr = rqstHdr;
		this.tsRqHdr = tsRqHdr;
		this.getCustDetailsRq = getCustDetailsRq;
	}

}
