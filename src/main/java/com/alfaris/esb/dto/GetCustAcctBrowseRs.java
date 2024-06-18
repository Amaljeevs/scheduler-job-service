package com.alfaris.esb.dto;

import java.util.ArrayList;

public class GetCustAcctBrowseRs {
	private Integer ctl1;
	private Integer ctl2;	
	private Integer ctl3;	
	private Integer ctl4;	
	private Integer custNbr;	
	private String acctTypeFilter;
	private String statFilter;	
	private String nameLine1;	
	private String custTypCd;	
	private String CustStatCd;	
	private ArrayList<RelData> RelData;
	private Integer recsRequested;
	private String moreInd;
	private ArrayList<MoreKeyRs> moreKey;
	public Integer getCtl1() {
		return ctl1;
	}
	public void setCtl1(Integer ctl1) {
		this.ctl1 = ctl1;
	}
	public Integer getCtl2() {
		return ctl2;
	}
	public void setCtl2(Integer ctl2) {
		this.ctl2 = ctl2;
	}
	public Integer getCtl3() {
		return ctl3;
	}
	public void setCtl3(Integer ctl3) {
		this.ctl3 = ctl3;
	}
	public Integer getCtl4() {
		return ctl4;
	}
	public void setCtl4(Integer ctl4) {
		this.ctl4 = ctl4;
	}
	public Integer getCustNbr() {
		return custNbr;
	}
	public void setCustNbr(Integer custNbr) {
		this.custNbr = custNbr;
	}
	public String getAcctTypeFilter() {
		return acctTypeFilter;
	}
	public void setAcctTypeFilter(String acctTypeFilter) {
		this.acctTypeFilter = acctTypeFilter;
	}
	public String getStatFilter() {
		return statFilter;
	}
	public void setStatFilter(String statFilter) {
		this.statFilter = statFilter;
	}
	public String getNameLine1() {
		return nameLine1;
	}
	public void setNameLine1(String nameLine1) {
		this.nameLine1 = nameLine1;
	}
	public String getCustTypCd() {
		return custTypCd;
	}
	public void setCustTypCd(String custTypCd) {
		this.custTypCd = custTypCd;
	}
	public String getCustStatCd() {
		return CustStatCd;
	}
	public void setCustStatCd(String custStatCd) {
		CustStatCd = custStatCd;
	}
	public ArrayList<RelData> getRelData() {
		return RelData;
	}
	public void setRelData(ArrayList<RelData> relData) {
		RelData = relData;
	}
	public Integer getRecsRequested() {
		return recsRequested;
	}
	public void setRecsRequested(Integer recsRequested) {
		this.recsRequested = recsRequested;
	}
	public String getMoreInd() {
		return moreInd;
	}
	public void setMoreInd(String moreInd) {
		this.moreInd = moreInd;
	}
	public ArrayList<MoreKeyRs> getMoreKey() {
		return moreKey;
	}
	public void setMoreKey(ArrayList<MoreKeyRs> moreKey) {
		this.moreKey = moreKey;
	}
	@Override
	public String toString() {
		return "GetCustAcctBrowseRs [ctl1=" + ctl1 + ", ctl2=" + ctl2 + ", ctl3=" + ctl3 + ", ctl4=" + ctl4
				+ ", custNbr=" + custNbr + ", acctTypeFilter=" + acctTypeFilter + ", statFilter=" + statFilter
				+ ", nameLine1=" + nameLine1 + ", custTypCd=" + custTypCd + ", CustStatCd=" + CustStatCd + ", RelData="
				+ RelData + ", recsRequested=" + recsRequested + ", moreInd=" + moreInd + ", moreKey=" + moreKey + "]";
	}
	public GetCustAcctBrowseRs(Integer ctl1, Integer ctl2, Integer ctl3, Integer ctl4, Integer custNbr,
			String acctTypeFilter, String statFilter, String nameLine1, String custTypCd, String custStatCd,
			ArrayList<RelData> relData, Integer recsRequested, String moreInd,
			ArrayList<MoreKeyRs> moreKey) {
		super();
		this.ctl1 = ctl1;
		this.ctl2 = ctl2;
		this.ctl3 = ctl3;
		this.ctl4 = ctl4;
		this.custNbr = custNbr;
		this.acctTypeFilter = acctTypeFilter;
		this.statFilter = statFilter;
		this.nameLine1 = nameLine1;
		this.custTypCd = custTypCd;
		CustStatCd = custStatCd;
		RelData = relData;
		this.recsRequested = recsRequested;
		this.moreInd = moreInd;
		this.moreKey = moreKey;
	}
	public GetCustAcctBrowseRs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
