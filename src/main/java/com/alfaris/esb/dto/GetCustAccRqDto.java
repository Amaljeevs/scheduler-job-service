package com.alfaris.esb.dto;

public class GetCustAccRqDto {

	private GetCustAccRqHeader riyadBankHeader;
//	private GetCustAccRqDetails getCustAccRqDetails;

	public GetCustAccRqHeader getRiyadBankHeader() {
		return riyadBankHeader;
	}

	public void setRiyadBankHeader(GetCustAccRqHeader riyadBankHeader) {
		this.riyadBankHeader = riyadBankHeader;
	}

	

	@Override
	public String toString() {
		return "GetCustAccRqDto [riyadBankHeader=" + riyadBankHeader + ",]";
	}

	public GetCustAccRqDto(GetCustAccRqHeader riyadBankHeader, String acctNumber, String pageMarker, String pageSize,
			String forwardBackwardInd) {
		super();
		this.riyadBankHeader = riyadBankHeader;
	}

	public GetCustAccRqDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
