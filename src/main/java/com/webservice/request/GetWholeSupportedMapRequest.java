package com.webservice.request;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.webservice.request.adapter.GetWholeSupportedMapRequestAdapter;

@XmlJavaTypeAdapter(GetWholeSupportedMapRequestAdapter.class)
public interface GetWholeSupportedMapRequest {

}
