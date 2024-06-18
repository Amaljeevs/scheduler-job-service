package com.alfaris.esb.dto;

public class Collateral {
	private int collateralNum;
    private String collateralPlaceIssued;
    
	public int getCollateralNum() {
		return collateralNum;
	}
	public void setCollateralNum(int collateralNum) {
		this.collateralNum = collateralNum;
	}
	public String getCollateralPlaceIssued() {
		return collateralPlaceIssued;
	}
	public void setCollateralPlaceIssued(String collateralPlaceIssued) {
		this.collateralPlaceIssued = collateralPlaceIssued;
	}
	public Collateral(int collateralNum, String collateralPlaceIssued) {
		super();
		this.collateralNum = collateralNum;
		this.collateralPlaceIssued = collateralPlaceIssued;
	}
	public Collateral() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Collateral [collateralNum=" + collateralNum + ", collateralPlaceIssued=" + collateralPlaceIssued + "]";
	}
    
    
	
}
