package com.alfaris.esb.dto;

public class MoreKey {
	private String fromEntCd;	
	private String fromEntKey;	
	private String toEntCd;
	private String toApplCd;	
	private String priSecOth;	
	private String ownerLiab;	
	private String fromRelCd;	
	private String toRelCd;
	private String toEntKey;
	public String getFromEntCd() {
		return fromEntCd;
	}
	public void setFromEntCd(String fromEntCd) {
		this.fromEntCd = fromEntCd;
	}
	public String getFromEntKey() {
		return fromEntKey;
	}
	public void setFromEntKey(String fromEntKey) {
		this.fromEntKey = fromEntKey;
	}
	public String getToEntCd() {
		return toEntCd;
	}
	public void setToEntCd(String toEntCd) {
		this.toEntCd = toEntCd;
	}
	public String getToApplCd() {
		return toApplCd;
	}
	public void setToApplCd(String toApplCd) {
		this.toApplCd = toApplCd;
	}
	public String getPriSecOth() {
		return priSecOth;
	}
	public void setPriSecOth(String priSecOth) {
		this.priSecOth = priSecOth;
	}
	public String getOwnerLiab() {
		return ownerLiab;
	}
	public void setOwnerLiab(String ownerLiab) {
		this.ownerLiab = ownerLiab;
	}
	public String getFromRelCd() {
		return fromRelCd;
	}
	public void setFromRelCd(String fromRelCd) {
		this.fromRelCd = fromRelCd;
	}
	public String getToRelCd() {
		return toRelCd;
	}
	public void setToRelCd(String toRelCd) {
		this.toRelCd = toRelCd;
	}
	public String getToEntKey() {
		return toEntKey;
	}
	public void setToEntKey(String toEntKey) {
		this.toEntKey = toEntKey;
	}
	@Override
	public String toString() {
		return "MoreKey [fromEntCd=" + fromEntCd + ", fromEntKey=" + fromEntKey + ", toEntCd=" + toEntCd + ", toApplCd="
				+ toApplCd + ", priSecOth=" + priSecOth + ", ownerLiab=" + ownerLiab + ", fromRelCd=" + fromRelCd
				+ ", toRelCd=" + toRelCd + ", toEntKey=" + toEntKey + "]";
	}
	public MoreKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MoreKey(String fromEntCd, String fromEntKey, String toEntCd, String toApplCd, String priSecOth,
			String ownerLiab, String fromRelCd, String toRelCd, String toEntKey) {
		super();
		this.fromEntCd = fromEntCd;
		this.fromEntKey = fromEntKey;
		this.toEntCd = toEntCd;
		this.toApplCd = toApplCd;
		this.priSecOth = priSecOth;
		this.ownerLiab = ownerLiab;
		this.fromRelCd = fromRelCd;
		this.toRelCd = toRelCd;
		this.toEntKey = toEntKey;
	}	
	
	
}
