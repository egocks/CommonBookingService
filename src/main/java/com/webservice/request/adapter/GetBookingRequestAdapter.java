package com.webservice.request.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.webservice.request.GetBookingRequest;
import com.webservice.request.impl.GetBookingRequestImpl;

public class GetBookingRequestAdapter extends XmlAdapter<GetBookingRequestImpl, GetBookingRequest> {

	@Override
	public GetBookingRequest unmarshal(GetBookingRequestImpl getBookingRequest) throws Exception {
		return (GetBookingRequest) getBookingRequest;
	}

	@Override
	public GetBookingRequestImpl marshal(GetBookingRequest getBookingRequest) throws Exception {
		if (getBookingRequest instanceof GetBookingRequestImpl) {
			return (GetBookingRequestImpl) getBookingRequest;
		}
		return new GetBookingRequestImpl(getBookingRequest);
	}

}
