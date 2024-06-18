package com.alfaris.esb.dto;

public class ScoresDetails {

	private String ratingScoreType;
	private String description;
	private String value;
	private String ratingDate;
	private String nextRatingDate;

	public String getRatingScoreType() {
		return ratingScoreType;
	}

	public void setRatingScoreType(String ratingScoreType) {
		this.ratingScoreType = ratingScoreType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRatingDate() {
		return ratingDate;
	}

	public void setRatingDate(String ratingDate) {
		this.ratingDate = ratingDate;
	}

	public String getNextRatingDate() {
		return nextRatingDate;
	}

	public void setNextRatingDate(String nextRatingDate) {
		this.nextRatingDate = nextRatingDate;
	}

	public ScoresDetails(String ratingScoreType, String description, String value, String ratingDate,
			String nextRatingDate) {
		super();
		this.ratingScoreType = ratingScoreType;
		this.description = description;
		this.value = value;
		this.ratingDate = ratingDate;
		this.nextRatingDate = nextRatingDate;
	}

	public ScoresDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ScoresDetails [ratingScoreType=" + ratingScoreType + ", description=" + description + ", value=" + value
				+ ", ratingDate=" + ratingDate + ", nextRatingDate=" + nextRatingDate + "]";
	}

}
