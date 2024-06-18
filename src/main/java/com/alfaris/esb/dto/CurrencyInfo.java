package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class CurrencyInfo {
	
	private String currencyCd;
	
	private String currencyDec;
	
	private BigDecimal tranAmt;
	
	private BigDecimal rate;
	
	private String xChgRateOverrideInd;

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getCurrencyDec() {
		return currencyDec;
	}

	public void setCurrencyDec(String currencyDec) {
		this.currencyDec = currencyDec;
	}

	public BigDecimal getTranAmt() {
		return tranAmt;
	}

	public void setTranAmt(BigDecimal tranAmt) {
		this.tranAmt = tranAmt;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getxChgRateOverrideInd() {
		return xChgRateOverrideInd;
	}

	public void setxChgRateOverrideInd(String xChgRateOverrideInd) {
		this.xChgRateOverrideInd = xChgRateOverrideInd;
	}

	public CurrencyInfo(String currencyCd, String currencyDec, BigDecimal tranAmt, BigDecimal rate,
			String xChgRateOverrideInd) {
		super();
		this.currencyCd = currencyCd;
		this.currencyDec = currencyDec;
		this.tranAmt = tranAmt;
		this.rate = rate;
		this.xChgRateOverrideInd = xChgRateOverrideInd;
	}

	public CurrencyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrencyInfo [currencyCd=" + currencyCd + ", currencyDec=" + currencyDec + ", tranAmt=" + tranAmt
				+ ", rate=" + rate + ", xChgRateOverrideInd=" + xChgRateOverrideInd + "]";
	}
	
	

}
