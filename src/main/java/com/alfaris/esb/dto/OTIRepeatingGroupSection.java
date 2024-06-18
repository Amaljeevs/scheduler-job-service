package com.alfaris.esb.dto;

public class OTIRepeatingGroupSection {

	private OTIRepeatingGroup repeatingGroup;

	public OTIRepeatingGroup getRepeatingGroup() {
		return repeatingGroup;
	}

	public void setRepeatingGroup(OTIRepeatingGroup repeatingGroup) {
		this.repeatingGroup = repeatingGroup;
	}

	public OTIRepeatingGroupSection(OTIRepeatingGroup repeatingGroup) {
		super();
		this.repeatingGroup = repeatingGroup;
	}

	public OTIRepeatingGroupSection() {
		super();
	}

	@Override
	public String toString() {
		return "OTIRepeatingGroupSection [repeatingGroup=" + repeatingGroup + "]";
	}

}
