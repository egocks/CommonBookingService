package com.webservice.request.impl;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractRequest;
import com.webservice.request.GetBookingRequest;

@XmlType(namespace = "getBookingRequest")
public class GetBookingRequestImpl extends AbstractRequest implements GetBookingRequest {
	protected String locator;

	GetBookingRequest rq;

	GetBookingRequestImpl() {
	}

	public GetBookingRequestImpl(GetBookingRequest rq) {
		this.rq = rq;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
}
