package com.webservice.response;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractResponse;
import com.webservice.dataobject.Booking;

@XmlType(namespace = "getListOfBookingsResponse")
public class GetListOfBookingsResponse extends AbstractResponse {
	protected List<Booking> bookings = new ArrayList<Booking>();
	
	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

}
