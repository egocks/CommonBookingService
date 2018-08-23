package com.webservice.request;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.webservice.request.adapter.CancelBookingRequestAdapter;

@XmlJavaTypeAdapter(CancelBookingRequestAdapter.class)
public interface CancelBookingRequest {
	
}
