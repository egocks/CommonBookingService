package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class City {
	protected String id;
    protected String name;
	protected List<Hotel> hotels = new ArrayList<Hotel>();

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

	public List<Hotel> getHotels() {
		return hotels;
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}

}
