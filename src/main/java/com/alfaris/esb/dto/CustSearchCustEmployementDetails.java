package com.alfaris.esb.dto;

public class CustSearchCustEmployementDetails {

	private String salary;

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public CustSearchCustEmployementDetails() {
		super();
	}

	@Override
	public String toString() {
		return "CustSearchCustEmployementDetails [salary=" + salary + "]";
	}

}
