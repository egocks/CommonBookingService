package com.webservice.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractResponse;
import com.webservice.dataobject.Country;

@XmlType(namespace = "getWholeSupportedMapResponse")
public class GetWholeSupportedMapResponse extends AbstractResponse {
	protected List<Country> countries = new ArrayList<Country>();

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
}
