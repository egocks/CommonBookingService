package com.webservice.request.impl;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractRequest;
import com.webservice.request.GetListOfBookingsRequest;

@XmlType(namespace = "getListOfBookingsRequest")
public class GetListOfBookingsRequestImpl extends AbstractRequest implements GetListOfBookingsRequest {
	protected String locator;

	GetListOfBookingsRequest rq;

	GetListOfBookingsRequestImpl() {
	}

	public GetListOfBookingsRequestImpl(GetListOfBookingsRequest rq) {
		this.rq = rq;
	}

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}
}
