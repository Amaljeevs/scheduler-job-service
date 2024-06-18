package com.alfaris.esb.dto;

public class FatcaCorpDetails {

	private String fatcaCustomerType;
	private String fatcaEntityClass;
	private String fatcacrsEntityClass;
	private String fatcagiin;
	private String fatcaTaxReport;

	public String getFatcaCustomerType() {
		return fatcaCustomerType;
	}

	public void setFatcaCustomerType(String fatcaCustomerType) {
		this.fatcaCustomerType = fatcaCustomerType;
	}

	public String getFatcaEntityClass() {
		return fatcaEntityClass;
	}

	public void setFatcaEntityClass(String fatcaEntityClass) {
		this.fatcaEntityClass = fatcaEntityClass;
	}

	public String getFatcacrsEntityClass() {
		return fatcacrsEntityClass;
	}

	public void setFatcacrsEntityClass(String fatcacrsEntityClass) {
		this.fatcacrsEntityClass = fatcacrsEntityClass;
	}

	public String getFatcagiin() {
		return fatcagiin;
	}

	public void setFatcagiin(String fatcagiin) {
		this.fatcagiin = fatcagiin;
	}

	public String getFatcaTaxReport() {
		return fatcaTaxReport;
	}

	public void setFatcaTaxReport(String fatcaTaxReport) {
		this.fatcaTaxReport = fatcaTaxReport;
	}

	public FatcaCorpDetails(String fatcaCustomerType, String fatcaEntityClass, String fatcacrsEntityClass,
			String fatcagiin, String fatcaTaxReport) {
		super();
		this.fatcaCustomerType = fatcaCustomerType;
		this.fatcaEntityClass = fatcaEntityClass;
		this.fatcacrsEntityClass = fatcacrsEntityClass;
		this.fatcagiin = fatcagiin;
		this.fatcaTaxReport = fatcaTaxReport;
	}

	public FatcaCorpDetails() {
		super();
	}

	@Override
	public String toString() {
		return "FatcaCorpDetails [fatcaCustomerType=" + fatcaCustomerType + ", fatcaEntityClass=" + fatcaEntityClass
				+ ", fatcacrsEntityClass=" + fatcacrsEntityClass + ", fatcagiin=" + fatcagiin + ", fatcaTaxReport="
				+ fatcaTaxReport + "]";
	}

}
