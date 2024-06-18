package com.alfaris.esb.dto;

public class GetVipAccountRepeatingGroupSection {
	
	private RepeatingGroup repeatingGroup;

	public RepeatingGroup getRepeatingGroup() {
		return repeatingGroup;
	}

	public void setRepeatingGroup(RepeatingGroup repeatingGroup) {
		this.repeatingGroup = repeatingGroup;
	}

	public GetVipAccountRepeatingGroupSection(RepeatingGroup repeatingGroup) {
		super();
		this.repeatingGroup = repeatingGroup;
	}

	@Override
	public String toString() {
		return "GetVipAccountRepeatingGroupSection [repeatingGroup=" + repeatingGroup + "]";
	}

	public GetVipAccountRepeatingGroupSection() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
