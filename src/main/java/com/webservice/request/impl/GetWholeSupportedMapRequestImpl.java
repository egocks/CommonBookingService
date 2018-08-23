package com.webservice.request.impl;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractRequest;
import com.webservice.request.GetWholeSupportedMapRequest;

@XmlType(namespace = "getWholeSupportedMapRequest")
public class GetWholeSupportedMapRequestImpl extends AbstractRequest implements GetWholeSupportedMapRequest {
	protected String locator;

	GetWholeSupportedMapRequest rq;

	GetWholeSupportedMapRequestImpl() {
	}

	public GetWholeSupportedMapRequestImpl(GetWholeSupportedMapRequest rq) {
		this.rq = rq;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
}
