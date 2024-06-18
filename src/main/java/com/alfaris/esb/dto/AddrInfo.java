package com.alfaris.esb.dto;

import java.util.ArrayList;

public class AddrInfo {

	
	 private ArrayList<Addr> addr;

	public ArrayList<Addr> getAddr() {
		return addr;
	}

	public void setAddr(ArrayList<Addr> addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "AddrInfo [addr=" + addr + "]";
	}
	 
	 
}
