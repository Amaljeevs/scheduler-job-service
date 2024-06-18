package com.alfaris.esb.dto;

import java.util.ArrayList;

public class PhoneInfo {
	
	private ArrayList<Phone> phone;

	public ArrayList<Phone> getPhone() {
		return phone;
	}

	public void setPhone(ArrayList<Phone> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PhoneInfo [phone=" + phone + "]";
	}
	
	

}
