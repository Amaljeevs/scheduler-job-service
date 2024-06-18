package com.alfaris.esb.dto;

public class AccountTransferResponseDTO {

	private AccountTransferBankHeaderResponse riyadBankHeader;
	private String availableBalance;
	private String availableBalanceSign; 
	private OverrideMessage overrideMessage;
	private SamaExceptionList samaExceptionList;

	public AccountTransferBankHeaderResponse getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(AccountTransferBankHeaderResponse riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	public String getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getAvailableBalanceSign() {
		return availableBalanceSign;
	}

	public void setAvailableBalanceSign(String availableBalanceSign) {
		this.availableBalanceSign = availableBalanceSign;
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

	public AccountTransferResponseDTO(AccountTransferBankHeaderResponse riyadBankHeader, String availableBalance, String availableBalanceSign,
			OverrideMessage overrideMessage, SamaExceptionList samaExceptionList) {
		super();
		this.riyadBankHeader = riyadBankHeader;
		this.availableBalance = availableBalance;
		this.availableBalanceSign = availableBalanceSign;
		this.overrideMessage = overrideMessage;
		this.samaExceptionList = samaExceptionList;
	}

	public AccountTransferResponseDTO() {
		super();
	}

	@Override
	public String toString() {
		return "Response [riyadBankHeader=" + riyadBankHeader + ", availableBalance=" + availableBalance
				+ ", availableBalanceSign=" + availableBalanceSign + ", overrideMessage=" + overrideMessage
				+ ", samaExceptionList=" + samaExceptionList + "]";
	}

}
