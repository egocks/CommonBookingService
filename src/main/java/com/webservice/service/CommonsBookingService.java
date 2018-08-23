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
	public CancelBookingResponse cancelBooking(CancelBookingRequest rq);
	public GetBookingResponse getBooking(GetBookingRequest rq);
	public GetListOfBookingsResponse getListOfBookings(GetListOfBookingsRequest rq);
	public GetWholeSupportedMapResponse getWholeSupportedMap(GetWholeSupportedMapRequest rq);
}
