package com.alfaris.esb.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
	
	@JsonProperty("$")
    private String $;

    public String get$() {
        return $;
    }

    public void set$(String $) {
        this.$ = $;
    }

	@Override
	public String toString() {
		return "Value [$=" + $ + "]";
	}

	public Value(String $) {
		super();
		this.$ = $;
	}

	public Value() {
		super();
		// TODO Auto-generated constructor stub
	}
}