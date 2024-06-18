package com.alfaris.esb.dto;

import java.util.ArrayList;

public class GetDepositTransactionHistoryRs {
	
	private ArrayList<DepAcctTrn> depAcctTrn;
	
	private String ctl1;
	
	private String ctl2;
	
	private String ctl3;
	
	private String ctl4;
	
	private String acctId;
	
	private String currencyCd;
	
	private String activityMessage;
	
	private String productCd;
	
	private String productDesc;
	
	private String acctStatusCd;
	
	private int recsReturned;
	
	private String moreInd;
	
	private int moreTranDt;
	
	private int moreTranSeq;

	public ArrayList<DepAcctTrn> getDepAcctTrn() {
		return depAcctTrn;
	}

	public void setDepAcctTrn(ArrayList<DepAcctTrn> depAcctTrn) {
		this.depAcctTrn = depAcctTrn;
	}

	public String getCtl1() {
		return ctl1;
	}

	public void setCtl1(String ctl1) {
		this.ctl1 = ctl1;
	}

	public String getCtl2() {
		return ctl2;
	}

	public void setCtl2(String ctl2) {
		this.ctl2 = ctl2;
	}

	public String getCtl3() {
		return ctl3;
	}

	public void setCtl3(String ctl3) {
		this.ctl3 = ctl3;
	}

	public String getCtl4() {
		return ctl4;
	}

	public void setCtl4(String ctl4) {
		this.ctl4 = ctl4;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getActivityMessage() {
		return activityMessage;
	}

	public void setActivityMessage(String activityMessage) {
		this.activityMessage = activityMessage;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getAcctStatusCd() {
		return acctStatusCd;
	}

	public void setAcctStatusCd(String acctStatusCd) {
		this.acctStatusCd = acctStatusCd;
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

	public int getMoreTranDt() {
		return moreTranDt;
	}

	public void setMoreTranDt(int moreTranDt) {
		this.moreTranDt = moreTranDt;
	}

	public int getMoreTranSeq() {
		return moreTranSeq;
	}

	public void setMoreTranSeq(int moreTranSeq) {
		this.moreTranSeq = moreTranSeq;
	}

	public GetDepositTransactionHistoryRs(ArrayList<DepAcctTrn> depAcctTrn, String ctl1, String ctl2, String ctl3,
			String ctl4, String acctId, String currencyCd, String activityMessage, String productCd, String productDesc,
			String acctStatusCd, int recsReturned, String moreInd, int moreTranDt, int moreTranSeq) {
		super();
		this.depAcctTrn = depAcctTrn;
		this.ctl1 = ctl1;
		this.ctl2 = ctl2;
		this.ctl3 = ctl3;
		this.ctl4 = ctl4;
		this.acctId = acctId;
		this.currencyCd = currencyCd;
		this.activityMessage = activityMessage;
		this.productCd = productCd;
		this.productDesc = productDesc;
		this.acctStatusCd = acctStatusCd;
		this.recsReturned = recsReturned;
		this.moreInd = moreInd;
		this.moreTranDt = moreTranDt;
		this.moreTranSeq = moreTranSeq;
	}

	public GetDepositTransactionHistoryRs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GetDepositTransactionHistoryRs [depAcctTrn=" + depAcctTrn + ", ctl1=" + ctl1 + ", ctl2=" + ctl2
				+ ", ctl3=" + ctl3 + ", ctl4=" + ctl4 + ", acctId=" + acctId + ", currencyCd=" + currencyCd
				+ ", activityMessage=" + activityMessage + ", productCd=" + productCd + ", productDesc=" + productDesc
				+ ", acctStatusCd=" + acctStatusCd + ", recsReturned=" + recsReturned + ", moreInd=" + moreInd
				+ ", moreTranDt=" + moreTranDt + ", moreTranSeq=" + moreTranSeq + "]";
	}
	
	
	


}


