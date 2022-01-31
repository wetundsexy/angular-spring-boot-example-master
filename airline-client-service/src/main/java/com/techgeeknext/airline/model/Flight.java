package com.techgeeknext.airline.model;

public class Flight {
	private String flightNumber;
	private String origin;
	private String destination;
	
	public Flight(String flightNumber, String origin, String destination) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return this.flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}