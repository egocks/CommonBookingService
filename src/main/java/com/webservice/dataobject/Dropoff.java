package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class Dropoff {
	protected String airportId;
	protected String flightNumber;
	protected String flightDate;
	protected String flightTime;
	protected String flightOriginOrDestination;
	protected String resortId;
	protected String hotelId;
	protected String hotelName;
	protected String address;
	protected int totalPax;
	protected int totalChildren;
	protected int totalInfants;
	protected int totalWheelChairs;
	protected int totalBigLuggages;
	protected List<Passenger> passengers = new ArrayList<Passenger>();
	protected String comments;

	public String getAirportId() {
		return airportId;
	}

	public void setAirportId(String airportId) {
		this.airportId = airportId;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(String flightDate) {
		this.flightDate = flightDate;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	public String getFlightOriginOrDestination() {
		return flightOriginOrDestination;
	}

	public void setFlightOriginOrDestination(String flightOriginOrDestination) {
		this.flightOriginOrDestination = flightOriginOrDestination;
	}

	public String getResortId() {
		return resortId;
	}

	public void setResortId(String resortId) {
		this.resortId = resortId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTotalPax() {
		return totalPax;
	}

	public void setTotalPax(int totalPax) {
		this.totalPax = totalPax;
	}

	public int getTotalChildren() {
		return totalChildren;
	}

	public void setTotalChildren(int totalChildren) {
		this.totalChildren = totalChildren;
	}

	public int getTotalInfants() {
		return totalInfants;
	}

	public void setTotalInfants(int totalInfants) {
		this.totalInfants = totalInfants;
	}

	public int getTotalWheelChairs() {
		return totalWheelChairs;
	}

	public void setTotalWheelChairs(int totalWheelChairs) {
		this.totalWheelChairs = totalWheelChairs;
	}

	public int getTotalBigLuggages() {
		return totalBigLuggages;
	}

	public void setTotalBigLuggages(int totalBigLuggages) {
		this.totalBigLuggages = totalBigLuggages;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
