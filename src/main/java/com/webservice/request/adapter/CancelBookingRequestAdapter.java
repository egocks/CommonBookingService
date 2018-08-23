package com.webservice.request.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.webservice.request.CancelBookingRequest;
import com.webservice.request.impl.CancelBookingRequestImpl;

public class CancelBookingRequestAdapter extends XmlAdapter<CancelBookingRequestImpl, CancelBookingRequest> {

	@Override
	public CancelBookingRequest unmarshal(CancelBookingRequestImpl cancelBookingRequest) throws Exception {
		return (CancelBookingRequest) cancelBookingRequest;
	}

	@Override
	public CancelBookingRequestImpl marshal(CancelBookingRequest cancelBookingRequest) throws Exception {
		if (cancelBookingRequest instanceof CancelBookingRequestImpl) {
			return (CancelBookingRequestImpl) cancelBookingRequest;
		}
		return new CancelBookingRequestImpl(cancelBookingRequest);
	}
}
