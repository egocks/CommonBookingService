package com.webservice.service;

import javax.jws.WebService;

import com.webservice.request.CancelBookingRequest;
import com.webservice.request.GetBookingRequest;
import com.webservice.request.GetListOfBookingsRequest;
import com.webservice.request.GetWholeSupportedMapRequest;
import com.webservice.response.CancelBookingResponse;
import com.webservice.response.GetBookingResponse;
import com.webservice.response.GetListOfBookingsResponse;
import com.webservice.response.GetWholeSupportedMapResponse;

@WebService
public interface CommonsBookingService {
	public CancelBookingResponse cancelBooking(CancelBookingRequest request);
	public GetBookingResponse getBooking(GetBookingRequest request);
	public GetListOfBookingsResponse getListOfBookings(GetListOfBookingsRequest request);
	public GetWholeSupportedMapResponse getWholeSupportedMap(GetWholeSupportedMapRequest request);
}
