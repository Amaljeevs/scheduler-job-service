package com.alfaris.esb.dto;

public class GetCustDetailsRq {

	private int custCtl1;
	private int custCtl2;
	private int custCtl3;
	private int custCtl4;
	private int custNbr;
	private String idType;
	private String idNumber;


	private StmMoreKey moreKey;


	public int getCustCtl1() {
		return custCtl1;
	}


	public void setCustCtl1(int custCtl1) {
		this.custCtl1 = custCtl1;
	}


	public int getCustCtl2() {
		return custCtl2;
	}


	public void setCustCtl2(int custCtl2) {
		this.custCtl2 = custCtl2;
	}


	public int getCustCtl3() {
		return custCtl3;
	}


	public void setCustCtl3(int custCtl3) {
		this.custCtl3 = custCtl3;
	}


	public int getCustCtl4() {
		return custCtl4;
	}


	public void setCustCtl4(int custCtl4) {
		this.custCtl4 = custCtl4;
	}


	public int getCustNbr() {
		return custNbr;
	}


	public void setCustNbr(int custNbr) {
		this.custNbr = custNbr;
	}


	public String getIdType() {
		return idType;
	}


	public void setIdType(String idType) {
		this.idType = idType;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public StmMoreKey getMoreKey() {
		return moreKey;
	}


	public void setMoreKey(StmMoreKey moreKey) {
		this.moreKey = moreKey;
	}


	public GetCustDetailsRq(int custCtl1, int custCtl2, int custCtl3, int custCtl4, int custNbr, String idType,
			String idNumber, StmMoreKey moreKey) {
		super();
		this.custCtl1 = custCtl1;
		this.custCtl2 = custCtl2;
		this.custCtl3 = custCtl3;
		this.custCtl4 = custCtl4;
		this.custNbr = custNbr;
		this.idType = idType;
		this.idNumber = idNumber;
		this.moreKey = moreKey;
	}


	public GetCustDetailsRq() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "GetCustDetailsRq [custCtl1=" + custCtl1 + ", custCtl2=" + custCtl2 + ", custCtl3=" + custCtl3
				+ ", custCtl4=" + custCtl4 + ", custNbr=" + custNbr + ", idType=" + idType + ", idNumber=" + idNumber
				+ ", moreKey=" + moreKey + "]";
	}

	

}
