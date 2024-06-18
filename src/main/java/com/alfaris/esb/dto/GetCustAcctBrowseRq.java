package com.alfaris.esb.dto;

public class GetCustAcctBrowseRq {

	private Integer ctl1;
	private Integer ctl2;	
	private Integer ctl3;	
	private Integer ctl4;	
	private Integer custNbr;
	private String acctTypeFilter;
	private String statFilter;
	private Integer recsRequested;
	private MoreKey moreKey;
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
	public Integer getRecsRequested() {
		return recsRequested;
	}
	public void setRecsRequested(Integer recsRequested) {
		this.recsRequested = recsRequested;
	}
	public MoreKey getMoreKey() {
		return moreKey;
	}
	public void setMoreKey(MoreKey moreKey) {
		this.moreKey = moreKey;
	}
	public GetCustAcctBrowseRq(Integer ctl1, Integer ctl2, Integer ctl3, Integer ctl4, Integer custNbr,
			String acctTypeFilter, String statFilter, Integer recsRequested, MoreKey moreKey) {
		super();
		this.ctl1 = ctl1;
		this.ctl2 = ctl2;
		this.ctl3 = ctl3;
		this.ctl4 = ctl4;
		this.custNbr = custNbr;
		this.acctTypeFilter = acctTypeFilter;
		this.statFilter = statFilter;
		this.recsRequested = recsRequested;
		this.moreKey = moreKey;
	}
	public GetCustAcctBrowseRq() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GetCustAcctBrowseRq [ctl1=" + ctl1 + ", ctl2=" + ctl2 + ", ctl3=" + ctl3 + ", ctl4=" + ctl4
				+ ", custNbr=" + custNbr + ", acctTypeFilter=" + acctTypeFilter + ", statFilter=" + statFilter
				+ ", recsRequested=" + recsRequested + ", moreKey=" + moreKey + "]";
	}
	
}
