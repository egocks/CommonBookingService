package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class Country {
	protected String id;
	protected String name;
	protected List<State> states = new ArrayList<State>();

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

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
}
