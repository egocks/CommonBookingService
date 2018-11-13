package com.webservice.server;

import javax.xml.ws.Endpoint;

import com.webservice.service.impl.CommonsBookingServiceImpl;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		CommonsBookingServiceImpl impl = new CommonsBookingServiceImpl();
		String address = "http://localhost:9090/CommonsBookingService";
		Endpoint.publish(address, impl);
		System.out.println("Server ready...");
		Thread.sleep(99 * 60 * 1000);
		System.out.println("Server exiting...");
		System.exit(0);
	}
}
