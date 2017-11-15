package com.libertymutual.goforcode.vicious_valet.models;

public class Car {

	private String make;
	private String model;
	private String license;
	private String state;
	private String color;

	public Car(String license, String state, String color, String make, String model) {
		this.make = make; // 'this' refers to the class.
		this.model = model;
		this.license = license;
		this.state = state;
		this.color = color;

	}

	// we will not change the make or color or any of the car details again, which
	// is why we do not care about the Setters, only the getters
	public String getMake() { // getter method will follow this format "make" to "getMake". Methods are camel case
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}
}