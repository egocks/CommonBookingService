package com.webservice.request;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.webservice.request.adapter.GetListOfBookingsRequestAdapter;

@XmlJavaTypeAdapter(GetListOfBookingsRequestAdapter.class)
public interface GetListOfBookingsRequest {

}
