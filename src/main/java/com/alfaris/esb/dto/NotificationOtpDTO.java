package com.alfaris.esb.dto;

public class NotificationOtpDTO {

	private String otp;

	private String smsDestination;

	public NotificationOtpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public String getSmsDestination() {
		return smsDestination;
	}

	public void setSmsDestination(String smsDestination) {
		this.smsDestination = smsDestination;
	}

	@Override
	public String toString() {
		return "NotificationOtpDTO [otp=" + otp + ", smsDestination=" + smsDestination + "]";
	}

	public NotificationOtpDTO(String otp, String smsDestination) {
		super();
		this.otp = otp;
		this.smsDestination = smsDestination;
	}

}
