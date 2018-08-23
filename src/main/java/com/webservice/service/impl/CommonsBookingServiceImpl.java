package com.webservice.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.webservice.dataobject.Amount;
import com.webservice.dataobject.Booking;
import com.webservice.request.CancelBookingRequest;
import com.webservice.request.GetBookingRequest;
import com.webservice.request.GetListOfBookingsRequest;
import com.webservice.request.GetWholeSupportedMapRequest;
import com.webservice.response.CancelBookingResponse;
import com.webservice.response.GetBookingResponse;
import com.webservice.response.GetListOfBookingsResponse;
import com.webservice.response.GetWholeSupportedMapResponse;
import com.webservice.service.CommonsBookingService;

@WebService(endpointInterface = "com.webservice.service.CommonsBookingService")
public class CommonsBookingServiceImpl implements CommonsBookingService {

	public CancelBookingResponse cancelBooking(CancelBookingRequest rq) {
		CancelBookingResponse rs = new CancelBookingResponse();
		rs.setMessage("Message...");
		rs.setCpuTime("Cpu Time...");
		rs.setDateAtServer("Date At Server...");
		rs.setRqId("Rq Id...");

		return rs;
	}

	public GetBookingResponse getBooking(GetBookingRequest rq) {
		GetBookingResponse rs = new GetBookingResponse();
		rs.setLocator("Locator...");
		rs.setYourReference("Your Reference...");
		rs.setTitular("Titular...");
		rs.setFormalizationDate("FormalizationDate...");
		rs.setLastModificationDate("LastModificationDate...");
		rs.setStatus("Status...");
		
		Amount netPrice = new Amount();
		netPrice.setCurrencyCode("PHP");
		netPrice.setValue(100.00);
		rs.setNetPrice(netPrice);
		
		Amount grossPrice = new Amount();
		grossPrice.setCurrencyCode("PHP");
		grossPrice.setValue(100.00);
		rs.setGrossPrice(grossPrice);
		
		return rs;
	}

	public GetListOfBookingsResponse getListOfBookings(GetListOfBookingsRequest rq) {
		GetListOfBookingsResponse rs = new GetListOfBookingsResponse();
		List<Booking> bookingList = new ArrayList<Booking>();
		Booking booking = new Booking();
		booking.setDescription("Booking description...");
		bookingList.add(booking);
		rs.setMessage("Message...");
		rs.setCpuTime("Cpu Time...");
		rs.setDateAtServer("Date At Server...");
		rs.setRqId("Rq Id...");
		rs.setBookings(bookingList);
		
		return rs;
	}

	public GetWholeSupportedMapResponse getWholeSupportedMap(GetWholeSupportedMapRequest rq) {
		GetWholeSupportedMapResponse rs = new GetWholeSupportedMapResponse();
		rs.setMessage("Message...");
		rs.setCpuTime("Cpu Time...");
		rs.setDateAtServer("Date At Server...");
		rs.setRqId("Rq Id...");
		
		return rs;
	}
}
