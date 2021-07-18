package com.du.asl.domain;

public class YearSearch {
	private int year;

	public YearSearch() {
		this.year = 2016;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "YearSearch [year=" + year + ", + ]";
	}
	
	
}
