package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class State {
	protected String id;
    protected String name;
    protected List<City> cities = new ArrayList<City>();
	protected List<Airport> airports = new ArrayList<Airport>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public List<Airport> getAirports() {
		return airports;
	}

	public void setAirports(List<Airport> airports) {
		this.airports = airports;
	}
}
