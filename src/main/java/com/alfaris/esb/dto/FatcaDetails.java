package com.alfaris.esb.dto;

public class FatcaDetails {

	private String taxPayer;
	private String taxCountry1;
	private String taxCountry2;
	private String usTaxReason;
	private String tin;
	private String tinReason;
	private String fatca;

	public String getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(String taxPayer) {
		this.taxPayer = taxPayer;
	}

	public String getTaxCountry1() {
		return taxCountry1;
	}

	public void setTaxCountry1(String taxCountry1) {
		this.taxCountry1 = taxCountry1;
	}

	public String getTaxCountry2() {
		return taxCountry2;
	}

	public void setTaxCountry2(String taxCountry2) {
		this.taxCountry2 = taxCountry2;
	}

	public String getUsTaxReason() {
		return usTaxReason;
	}

	public void setUsTaxReason(String usTaxReason) {
		this.usTaxReason = usTaxReason;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getTinReason() {
		return tinReason;
	}

	public void setTinReason(String tinReason) {
		this.tinReason = tinReason;
	}

	public String getFatca() {
		return fatca;
	}

	public void setFatca(String fatca) {
		this.fatca = fatca;
	}

	public FatcaDetails(String taxPayer, String taxCountry1, String taxCountry2, String usTaxReason, String tin,
			String tinReason, String fatca) {
		super();
		this.taxPayer = taxPayer;
		this.taxCountry1 = taxCountry1;
		this.taxCountry2 = taxCountry2;
		this.usTaxReason = usTaxReason;
		this.tin = tin;
		this.tinReason = tinReason;
		this.fatca = fatca;
	}

	public FatcaDetails() {
		super();
	}

	@Override
	public String toString() {
		return "FatcaDetails [taxPayer=" + taxPayer + ", taxCountry1=" + taxCountry1 + ", taxCountry2=" + taxCountry2
				+ ", usTaxReason=" + usTaxReason + ", tin=" + tin + ", tinReason=" + tinReason + ", fatca=" + fatca
				+ "]";
	}

}
