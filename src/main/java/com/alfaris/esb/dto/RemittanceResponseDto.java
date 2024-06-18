package com.alfaris.esb.dto;

public class RemittanceResponseDto {
	    private RemittanceHeaderRs riyadBankHeader;
	    private String acctAvailBal;
	    private String acctAvailBalSi;
	    private String channelFee;
	    private String sourceCurrency;
	    private String sourceAmount;
	    private String feeAmountCommission;
	    private String feeAmountSwift;
	    private String targetCurrency;
	    private String targetAmount;
	    private String sarEquivalentAmount;
	    private String feeAmountCommissionSar;
	    private String feeAmountSwiftSar;
	    private String buyRate;
	    private String sellRate;
	    private String remittanceRefNo;
	    private String rejectedReason;
	    private String channelFeeVat;
	    private String feeAcctCurrencyVat;
	    private String feeAmountCommissionTotalVat;
	    private String feeAmountSwiftTotalVat;
	    private String feeAmountCommissionSarTotalVat;
	    private String feeAmountSwiftSarTotalVat;
	    private String vatPercentage;
	    private String ipsReferenceNo;
	    private RemittanceSystematicsStatusMessage systematicsStatusMessage;
	    private OverrideMessage overrideMessage;
	    private SamaExceptionList samaExceptionList;
		
	    
	    
		@Override
		public String toString() {
			return "RemittanceResponseDto [riyadBankHeader=" + riyadBankHeader + ", acctAvailBal=" + acctAvailBal
					+ ", acctAvailBalSi=" + acctAvailBalSi + ", channelFee=" + channelFee + ", sourceCurrency="
					+ sourceCurrency + ", sourceAmount=" + sourceAmount + ", feeAmountCommission=" + feeAmountCommission
					+ ", feeAmountSwift=" + feeAmountSwift + ", targetCurrency=" + targetCurrency + ", targetAmount="
					+ targetAmount + ", sarEquivalentAmount=" + sarEquivalentAmount + ", feeAmountCommissionSar="
					+ feeAmountCommissionSar + ", feeAmountSwiftSar=" + feeAmountSwiftSar + ", buyRate=" + buyRate
					+ ", sellRate=" + sellRate + ", remittanceRefNo=" + remittanceRefNo + ", rejectedReason="
					+ rejectedReason + ", channelFeeVat=" + channelFeeVat + ", feeAcctCurrencyVat=" + feeAcctCurrencyVat
					+ ", feeAmountCommissionTotalVat=" + feeAmountCommissionTotalVat + ", feeAmountSwiftTotalVat="
					+ feeAmountSwiftTotalVat + ", feeAmountCommissionSarTotalVat=" + feeAmountCommissionSarTotalVat
					+ ", feeAmountSwiftSarTotalVat=" + feeAmountSwiftSarTotalVat + ", vatPercentage=" + vatPercentage
					+ ", ipsReferenceNo=" + ipsReferenceNo + ", systematicsStatusMessage=" + systematicsStatusMessage
					+ ", overrideMessage=" + overrideMessage + ", samaExceptionList=" + samaExceptionList + "]";
		}



		public RemittanceHeaderRs getRiyadBankHeader() {
			return riyadBankHeader;
		}



		public void setRiyadBankHeader(RemittanceHeaderRs riyadBankHeader) {
			this.riyadBankHeader = riyadBankHeader;
		}



		public String getAcctAvailBal() {
			return acctAvailBal;
		}



		public void setAcctAvailBal(String acctAvailBal) {
			this.acctAvailBal = acctAvailBal;
		}



		public String getAcctAvailBalSi() {
			return acctAvailBalSi;
		}



		public void setAcctAvailBalSi(String acctAvailBalSi) {
			this.acctAvailBalSi = acctAvailBalSi;
		}



		public String getChannelFee() {
			return channelFee;
		}



		public void setChannelFee(String channelFee) {
			this.channelFee = channelFee;
		}



		public String getSourceCurrency() {
			return sourceCurrency;
		}



		public void setSourceCurrency(String sourceCurrency) {
			this.sourceCurrency = sourceCurrency;
		}



		public String getSourceAmount() {
			return sourceAmount;
		}



		public void setSourceAmount(String sourceAmount) {
			this.sourceAmount = sourceAmount;
		}



		public String getFeeAmountCommission() {
			return feeAmountCommission;
		}



		public void setFeeAmountCommission(String feeAmountCommission) {
			this.feeAmountCommission = feeAmountCommission;
		}



		public String getFeeAmountSwift() {
			return feeAmountSwift;
		}



		public void setFeeAmountSwift(String feeAmountSwift) {
			this.feeAmountSwift = feeAmountSwift;
		}



		public String getTargetCurrency() {
			return targetCurrency;
		}



		public void setTargetCurrency(String targetCurrency) {
			this.targetCurrency = targetCurrency;
		}



		public String getTargetAmount() {
			return targetAmount;
		}



		public void setTargetAmount(String targetAmount) {
			this.targetAmount = targetAmount;
		}



		public String getSarEquivalentAmount() {
			return sarEquivalentAmount;
		}



		public void setSarEquivalentAmount(String sarEquivalentAmount) {
			this.sarEquivalentAmount = sarEquivalentAmount;
		}



		public String getFeeAmountCommissionSar() {
			return feeAmountCommissionSar;
		}



		public void setFeeAmountCommissionSar(String feeAmountCommissionSar) {
			this.feeAmountCommissionSar = feeAmountCommissionSar;
		}



		public String getFeeAmountSwiftSar() {
			return feeAmountSwiftSar;
		}



		public void setFeeAmountSwiftSar(String feeAmountSwiftSar) {
			this.feeAmountSwiftSar = feeAmountSwiftSar;
		}



		public String getBuyRate() {
			return buyRate;
		}



		public void setBuyRate(String buyRate) {
			this.buyRate = buyRate;
		}



		public String getSellRate() {
			return sellRate;
		}



		public void setSellRate(String sellRate) {
			this.sellRate = sellRate;
		}



		public String getRemittanceRefNo() {
			return remittanceRefNo;
		}



		public void setRemittanceRefNo(String remittanceRefNo) {
			this.remittanceRefNo = remittanceRefNo;
		}



		public String getRejectedReason() {
			return rejectedReason;
		}



		public void setRejectedReason(String rejectedReason) {
			this.rejectedReason = rejectedReason;
		}



		public String getChannelFeeVat() {
			return channelFeeVat;
		}



		public void setChannelFeeVat(String channelFeeVat) {
			this.channelFeeVat = channelFeeVat;
		}



		public String getFeeAcctCurrencyVat() {
			return feeAcctCurrencyVat;
		}



		public void setFeeAcctCurrencyVat(String feeAcctCurrencyVat) {
			this.feeAcctCurrencyVat = feeAcctCurrencyVat;
		}



		public String getFeeAmountCommissionTotalVat() {
			return feeAmountCommissionTotalVat;
		}



		public void setFeeAmountCommissionTotalVat(String feeAmountCommissionTotalVat) {
			this.feeAmountCommissionTotalVat = feeAmountCommissionTotalVat;
		}



		public String getFeeAmountSwiftTotalVat() {
			return feeAmountSwiftTotalVat;
		}



		public void setFeeAmountSwiftTotalVat(String feeAmountSwiftTotalVat) {
			this.feeAmountSwiftTotalVat = feeAmountSwiftTotalVat;
		}



		public String getFeeAmountCommissionSarTotalVat() {
			return feeAmountCommissionSarTotalVat;
		}



		public void setFeeAmountCommissionSarTotalVat(String feeAmountCommissionSarTotalVat) {
			this.feeAmountCommissionSarTotalVat = feeAmountCommissionSarTotalVat;
		}



		public String getFeeAmountSwiftSarTotalVat() {
			return feeAmountSwiftSarTotalVat;
		}



		public void setFeeAmountSwiftSarTotalVat(String feeAmountSwiftSarTotalVat) {
			this.feeAmountSwiftSarTotalVat = feeAmountSwiftSarTotalVat;
		}



		public String getVatPercentage() {
			return vatPercentage;
		}



		public void setVatPercentage(String vatPercentage) {
			this.vatPercentage = vatPercentage;
		}



		public String getIpsReferenceNo() {
			return ipsReferenceNo;
		}



		public void setIpsReferenceNo(String ipsReferenceNo) {
			this.ipsReferenceNo = ipsReferenceNo;
		}



		public RemittanceSystematicsStatusMessage getSystematicsStatusMessage() {
			return systematicsStatusMessage;
		}



		public void setSystematicsStatusMessage(RemittanceSystematicsStatusMessage systematicsStatusMessage) {
			this.systematicsStatusMessage = systematicsStatusMessage;
		}



		public OverrideMessage getOverrideMessage() {
			return overrideMessage;
		}



		public void setOverrideMessage(OverrideMessage overrideMessage) {
			this.overrideMessage = overrideMessage;
		}



		public SamaExceptionList getSamaExceptionList() {
			return samaExceptionList;
		}



		public void setSamaExceptionList(SamaExceptionList samaExceptionList) {
			this.samaExceptionList = samaExceptionList;
		}



		public RemittanceResponseDto() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
