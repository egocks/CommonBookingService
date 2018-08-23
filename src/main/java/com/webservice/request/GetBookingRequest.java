package com.webservice.request;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.webservice.request.adapter.GetBookingRequestAdapter;

@XmlJavaTypeAdapter(GetBookingRequestAdapter.class)
public interface GetBookingRequest {

}
