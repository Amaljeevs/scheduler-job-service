package com.alfaris.esb.dto;

public class PaymentSchedules {
	private Schedule schedule;

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public PaymentSchedules(Schedule schedule) {
		super();
		this.schedule = schedule;
	}

	public PaymentSchedules() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PaymentSchedules [schedule=" + schedule + "]";
	}
	 
	
}
