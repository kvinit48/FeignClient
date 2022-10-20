package com.feign.demo.dto;

public class User {
	String name;
	String firstlineAddress;
	String landmarkAddress;
	String residingState;
	String residingCapital;

	public String getName() {
		return name;
	}

	public String getResidingState() {
		return residingState;
	}

	public void setResidingState(String residingState) {
		this.residingState = residingState;
	}

	public String getResidingCapital() {
		return residingCapital;
	}

	public void setResidingCapital(String residingCapital) {
		this.residingCapital = residingCapital;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstlineAddress() {
		return firstlineAddress;
	}

	public void setFirstlineAddress(String firstlineAddress) {
		this.firstlineAddress = firstlineAddress;
	}

	public String getLandmarkAddress() {
		return landmarkAddress;
	}

	public void setLandmarkAddress(String landmarkAddress) {
		this.landmarkAddress = landmarkAddress;
	}

}
