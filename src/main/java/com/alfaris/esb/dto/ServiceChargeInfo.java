package com.alfaris.esb.dto;

import java.math.BigDecimal;

public class ServiceChargeInfo {
	
	private int tranCount;
	
	private BigDecimal earnCreditTotal;
	
	private BigDecimal reserveAmt;
	
	private BigDecimal earnCreditBal;
	
	private BigDecimal earnCreditRate;

	public int getTranCount() {
		return tranCount;
	}

	public void setTranCount(int tranCount) {
		this.tranCount = tranCount;
	}

	public BigDecimal getEarnCreditTotal() {
		return earnCreditTotal;
	}

	public void setEarnCreditTotal(BigDecimal earnCreditTotal) {
		this.earnCreditTotal = earnCreditTotal;
	}

	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}

	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}

	public BigDecimal getEarnCreditBal() {
		return earnCreditBal;
	}

	public void setEarnCreditBal(BigDecimal earnCreditBal) {
		this.earnCreditBal = earnCreditBal;
	}

	public BigDecimal getEarnCreditRate() {
		return earnCreditRate;
	}

	public void setEarnCreditRate(BigDecimal earnCreditRate) {
		this.earnCreditRate = earnCreditRate;
	}

	public ServiceChargeInfo(int tranCount, BigDecimal earnCreditTotal, BigDecimal reserveAmt, BigDecimal earnCreditBal,
			BigDecimal earnCreditRate) {
		super();
		this.tranCount = tranCount;
		this.earnCreditTotal = earnCreditTotal;
		this.reserveAmt = reserveAmt;
		this.earnCreditBal = earnCreditBal;
		this.earnCreditRate = earnCreditRate;
	}

	public ServiceChargeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ServiceChargeInfo [tranCount=" + tranCount + ", earnCreditTotal=" + earnCreditTotal + ", reserveAmt="
				+ reserveAmt + ", earnCreditBal=" + earnCreditBal + ", earnCreditRate=" + earnCreditRate + "]";
	}
	
	

}
