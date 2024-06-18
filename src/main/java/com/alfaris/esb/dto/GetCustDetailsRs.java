package com.alfaris.esb.dto;

import java.util.ArrayList;

public class GetCustDetailsRs {

	private ArrayList<CustInfo> custInfo;
	private int recsReturned;
	private String moreInd;
	private ArrayList<StmMoreKey> moreKey;

	public ArrayList<CustInfo> getCustInfo() {
		return custInfo;
	}

	public void setCustInfo(ArrayList<CustInfo> custInfo) {
		this.custInfo = custInfo;
	}

	public int getRecsReturned() {
		return recsReturned;
	}

	public void setRecsReturned(int recsReturned) {
		this.recsReturned = recsReturned;
	}

	public String getMoreInd() {
		return moreInd;
	}

	public void setMoreInd(String moreInd) {
		this.moreInd = moreInd;
	}

	public ArrayList<StmMoreKey> getMoreKey() {
		return moreKey;
	}

	public void setMoreKey(ArrayList<StmMoreKey> moreKey) {
		this.moreKey = moreKey;
	}

	@Override
	public String toString() {
		return "GetCustDetailsRs [custInfo=" + custInfo + ", recsReturned=" + recsReturned + ", moreInd=" + moreInd
				+ ", moreKey=" + moreKey + "]";
	}

	public GetCustDetailsRs() {
		super();
	}

	public GetCustDetailsRs(ArrayList<CustInfo> custInfo, int recsReturned, String moreInd,
			ArrayList<StmMoreKey> moreKey) {
		super();
		this.custInfo = custInfo;
		this.recsReturned = recsReturned;
		this.moreInd = moreInd;
		this.moreKey = moreKey;
	}

}
