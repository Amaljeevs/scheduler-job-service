package com.alfaris.esb.dto;

public class SendSystemNotifRsDto {
	
	private SendSystemNotifRsHeader riyadBankHeader;

	public SendSystemNotifRsHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(SendSystemNotifRsHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	@Override
	public String toString() {
		return "SendSystemNotifRsDto [riyadBankHeader=" + riyadBankHeader + "]";
	}

	public SendSystemNotifRsDto(SendSystemNotifRsHeader riyadBankHeader) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public SendSystemNotifRsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
   
	
		

}
