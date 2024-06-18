package com.alfaris.esb.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRepeatingGroupSection {

	@JsonProperty("repeatingGroup")
	private List<ResponseRepeatingGroup> repeatingGroup;

	public ResponseRepeatingGroupSection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<ResponseRepeatingGroup> getRepeatingGroup() {
		return repeatingGroup;
	}

	public void setRepeatingGroup(List<ResponseRepeatingGroup> repeatingGroup) {
		this.repeatingGroup = repeatingGroup;
	}

	@Override
	public String toString() {
		return "ResponseRepeatingGroupSection [repeatingGroup=" + repeatingGroup + "]";
	}

	public ResponseRepeatingGroupSection(List<ResponseRepeatingGroup> repeatingGroup) {
		super();
		this.repeatingGroup = repeatingGroup;
	}

}
