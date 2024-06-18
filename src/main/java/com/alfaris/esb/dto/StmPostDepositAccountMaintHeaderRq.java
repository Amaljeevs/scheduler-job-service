package com.alfaris.esb.dto;

public class StmPostDepositAccountMaintHeaderRq {
	
	private StmPostRqstHdr rqstHdr;
	private StmTsRqHdr tsRqHdr;
    private StmPostDepositAccountMaintRq postDepositAccountMaintRq;
	public StmPostRqstHdr getRqstHdr() {
		return rqstHdr;
	}
	public void setRqstHdr(StmPostRqstHdr rqstHdr) {
		this.rqstHdr = rqstHdr;
	}
	public StmTsRqHdr getTsRqHdr() {
		return tsRqHdr;
	}
	public void setTsRqHdr(StmTsRqHdr tsRqHdr) {
		this.tsRqHdr = tsRqHdr;
	}
	public StmPostDepositAccountMaintRq getPostDepositAccountMaintRq() {
		return postDepositAccountMaintRq;
	}
	public void setPostDepositAccountMaintRq(StmPostDepositAccountMaintRq postDepositAccountMaintRq) {
		this.postDepositAccountMaintRq = postDepositAccountMaintRq;
	}
	public StmPostDepositAccountMaintHeaderRq(StmPostRqstHdr rqstHdr, StmTsRqHdr tsRqHdr,
			StmPostDepositAccountMaintRq postDepositAccountMaintRq) {
		super();
		this.rqstHdr = rqstHdr;
		this.tsRqHdr = tsRqHdr;
		this.postDepositAccountMaintRq = postDepositAccountMaintRq;
	}
	public StmPostDepositAccountMaintHeaderRq() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StmPostDepositAccountMaintHeaderRq [rqstHdr=" + rqstHdr + ", tsRqHdr=" + tsRqHdr
				+ ", postDepositAccountMaintRq=" + postDepositAccountMaintRq + "]";
	}
    
    
}
