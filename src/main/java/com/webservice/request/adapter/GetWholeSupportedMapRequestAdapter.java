package com.webservice.request.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.webservice.request.GetWholeSupportedMapRequest;
import com.webservice.request.impl.GetWholeSupportedMapRequestImpl;

public class GetWholeSupportedMapRequestAdapter extends XmlAdapter<GetWholeSupportedMapRequestImpl, GetWholeSupportedMapRequest> {

	@Override
	public GetWholeSupportedMapRequest unmarshal(GetWholeSupportedMapRequestImpl GetWholeSupportedMapRequest) throws Exception {
		return (GetWholeSupportedMapRequest) GetWholeSupportedMapRequest;
	}

	@Override
	public GetWholeSupportedMapRequestImpl marshal(GetWholeSupportedMapRequest getWholeSupportedMapRequest) throws Exception {
		if (getWholeSupportedMapRequest instanceof GetWholeSupportedMapRequestImpl) {
			return (GetWholeSupportedMapRequestImpl) getWholeSupportedMapRequest;
		}
		return new GetWholeSupportedMapRequestImpl(getWholeSupportedMapRequest);
	}

}
