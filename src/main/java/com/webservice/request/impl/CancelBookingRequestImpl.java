package com.webservice.request.impl;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractRequest;
import com.webservice.request.CancelBookingRequest;

@XmlType(namespace = "cancelBookingRequest")
public class CancelBookingRequestImpl extends AbstractRequest implements CancelBookingRequest {
	protected String locator;

	CancelBookingRequest rq;

	CancelBookingRequestImpl() {
	}

	public CancelBookingRequestImpl(CancelBookingRequest rq) {
		this.rq = rq;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
}
