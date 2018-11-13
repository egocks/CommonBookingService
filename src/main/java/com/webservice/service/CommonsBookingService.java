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
	/**
Method for Canceling booking
*/
	public CancelBookingResponse cancelBooking(CancelBookingRequest request);
/**
Method for Getting booking
*/
	public GetBookingResponse getBooking(GetBookingRequest request);
/**
Method for Getting list if booking
*/
	public GetListOfBookingsResponse getListOfBookings(GetListOfBookingsRequest request);
/**
Method for Getting whole supported map response
*/
	public GetWholeSupportedMapResponse getWholeSupportedMap(GetWholeSupportedMapRequest request);
}
