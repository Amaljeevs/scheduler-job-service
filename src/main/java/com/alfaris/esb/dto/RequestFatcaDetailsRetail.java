package com.alfaris.esb.dto;

public class RequestFatcaDetailsRetail {

	private String fatcaNational2;

	private String fatcasSnItin;

	private String fatcaTaxReport;

	private String fatcaNational3;

	public String getFatcaNational2() {
		return fatcaNational2;
	}

	public void setFatcaNational2(String fatcaNational2) {
		this.fatcaNational2 = fatcaNational2;
	}

	public String getFatcasSnItin() {
		return fatcasSnItin;
	}

	public void setFatcasSnItin(String fatcasSnItin) {
		this.fatcasSnItin = fatcasSnItin;
	}

	public String getFatcaTaxReport() {
		return fatcaTaxReport;
	}

	public void setFatcaTaxReport(String fatcaTaxReport) {
		this.fatcaTaxReport = fatcaTaxReport;
	}

	public String getFatcaNational3() {
		return fatcaNational3;
	}

	public void setFatcaNational3(String fatcaNational3) {
		this.fatcaNational3 = fatcaNational3;
	}

	public RequestFatcaDetailsRetail(String fatcaNational2, String fatcasSnItin, String fatcaTaxReport,
			String fatcaNational3) {
		super();
		this.fatcaNational2 = fatcaNational2;
		this.fatcasSnItin = fatcasSnItin;
		this.fatcaTaxReport = fatcaTaxReport;
		this.fatcaNational3 = fatcaNational3;
	}

	public RequestFatcaDetailsRetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RequestFatcaDetailsRetail [fatcaNational2=" + fatcaNational2 + ", fatcasSnItin=" + fatcasSnItin
				+ ", fatcaTaxReport=" + fatcaTaxReport + ", fatcaNational3=" + fatcaNational3 + "]";
	}

}
