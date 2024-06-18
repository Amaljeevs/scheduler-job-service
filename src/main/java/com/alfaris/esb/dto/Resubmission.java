package com.alfaris.esb.dto;

public class Resubmission {

	private String resubmitFlag;
	private String resubmitLastTransactionFlag;
	private String resubmitFromAmount;
	private String resubmitToAmount;
	private String resubmitBuyRate;
	private String resubmitSellRate;
	private String resubmitProfitAmount;
	private String resubmitLossAmount;
	private String resubmitSarEquivalentAmount;

	public String getResubmitFlag() {
		return resubmitFlag;
	}

	public void setResubmitFlag(String resubmitFlag) {
		this.resubmitFlag = resubmitFlag;
	}

	public String getResubmitLastTransactionFlag() {
		return resubmitLastTransactionFlag;
	}

	public void setResubmitLastTransactionFlag(String resubmitLastTransactionFlag) {
		this.resubmitLastTransactionFlag = resubmitLastTransactionFlag;
	}

	public String getResubmitFromAmount() {
		return resubmitFromAmount;
	}

	public void setResubmitFromAmount(String resubmitFromAmount) {
		this.resubmitFromAmount = resubmitFromAmount;
	}

	public String getResubmitToAmount() {
		return resubmitToAmount;
	}

	public void setResubmitToAmount(String resubmitToAmount) {
		this.resubmitToAmount = resubmitToAmount;
	}

	public String getResubmitBuyRate() {
		return resubmitBuyRate;
	}

	public void setResubmitBuyRate(String resubmitBuyRate) {
		this.resubmitBuyRate = resubmitBuyRate;
	}

	public String getResubmitSellRate() {
		return resubmitSellRate;
	}

	public void setResubmitSellRate(String resubmitSellRate) {
		this.resubmitSellRate = resubmitSellRate;
	}

	public String getResubmitProfitAmount() {
		return resubmitProfitAmount;
	}

	public void setResubmitProfitAmount(String resubmitProfitAmount) {
		this.resubmitProfitAmount = resubmitProfitAmount;
	}

	public String getResubmitLossAmount() {
		return resubmitLossAmount;
	}

	public void setResubmitLossAmount(String resubmitLossAmount) {
		this.resubmitLossAmount = resubmitLossAmount;
	}

	public String getResubmitSarEquivalentAmount() {
		return resubmitSarEquivalentAmount;
	}

	public void setResubmitSarEquivalentAmount(String resubmitSarEquivalentAmount) {
		this.resubmitSarEquivalentAmount = resubmitSarEquivalentAmount;
	}

	public Resubmission(String resubmitFlag, String resubmitLastTransactionFlag, String resubmitFromAmount,
			String resubmitToAmount, String resubmitBuyRate, String resubmitSellRate, String resubmitProfitAmount,
			String resubmitLossAmount, String resubmitSarEquivalentAmount) {
		super();
		this.resubmitFlag = resubmitFlag;
		this.resubmitLastTransactionFlag = resubmitLastTransactionFlag;
		this.resubmitFromAmount = resubmitFromAmount;
		this.resubmitToAmount = resubmitToAmount;
		this.resubmitBuyRate = resubmitBuyRate;
		this.resubmitSellRate = resubmitSellRate;
		this.resubmitProfitAmount = resubmitProfitAmount;
		this.resubmitLossAmount = resubmitLossAmount;
		this.resubmitSarEquivalentAmount = resubmitSarEquivalentAmount;
	}

	public Resubmission() {
		super();
	}

	@Override
	public String toString() {
		return "Resubmission [resubmitFlag=" + resubmitFlag + ", resubmitLastTransactionFlag="
				+ resubmitLastTransactionFlag + ", resubmitFromAmount=" + resubmitFromAmount + ", resubmitToAmount="
				+ resubmitToAmount + ", resubmitBuyRate=" + resubmitBuyRate + ", resubmitSellRate=" + resubmitSellRate
				+ ", resubmitProfitAmount=" + resubmitProfitAmount + ", resubmitLossAmount=" + resubmitLossAmount
				+ ", resubmitSarEquivalentAmount=" + resubmitSarEquivalentAmount + "]";
	}

}
