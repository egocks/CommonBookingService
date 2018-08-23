package com.webservice.request.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.webservice.request.GetListOfBookingsRequest;
import com.webservice.request.impl.GetListOfBookingsRequestImpl;

public class GetListOfBookingsRequestAdapter extends XmlAdapter<GetListOfBookingsRequestImpl, GetListOfBookingsRequest> {

	@Override
	public GetListOfBookingsRequest unmarshal(GetListOfBookingsRequestImpl GetListOfBookingsRequest) throws Exception {
		return (GetListOfBookingsRequest) GetListOfBookingsRequest;
	}

	@Override
	public GetListOfBookingsRequestImpl marshal(GetListOfBookingsRequest getListOfBookingsRequest) throws Exception {
		if (getListOfBookingsRequest instanceof GetListOfBookingsRequestImpl) {
			return (GetListOfBookingsRequestImpl) getListOfBookingsRequest;
		}
		return new GetListOfBookingsRequestImpl(getListOfBookingsRequest);
	}

}
