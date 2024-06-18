package com.alfaris.esb.dto;

public class StmGetCustAcctBrowseHeaderRq {
	private StmRqHdr rqstHdr;
	private TestRqHdr tsRqHdr;
	private GetCustAcctBrowseRq getCustAcctBrowseRq;
	public StmRqHdr getRqstHdr() {
		return rqstHdr;
	}
	public void setRqstHdr(StmRqHdr rqstHdr) {
		this.rqstHdr = rqstHdr;
	}
	public TestRqHdr getTsRqHdr() {
		return tsRqHdr;
	}
	public void setTsRqHdr(TestRqHdr tsRqHdr) {
		this.tsRqHdr = tsRqHdr;
	}
	public GetCustAcctBrowseRq getGetCustAcctBrowseRq() {
		return getCustAcctBrowseRq;
	}
	public void setGetCustAcctBrowseRq(GetCustAcctBrowseRq getCustAcctBrowseRq) {
		this.getCustAcctBrowseRq = getCustAcctBrowseRq;
	}
	@Override
	public String toString() {
		return "StmGetCustAcctBrowseHeaderRq [rqstHdr=" + rqstHdr + ", tsRqHdr=" + tsRqHdr + ", getCustAcctBrowseRq="
				+ getCustAcctBrowseRq + "]";
	}
	public StmGetCustAcctBrowseHeaderRq(StmRqHdr rqstHdr, TestRqHdr tsRqHdr, GetCustAcctBrowseRq getCustAcctBrowseRq) {
		super();
		this.rqstHdr = rqstHdr;
		this.tsRqHdr = tsRqHdr;
		this.getCustAcctBrowseRq = getCustAcctBrowseRq;
	}
	public StmGetCustAcctBrowseHeaderRq() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
