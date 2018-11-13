package com.webservice.server;

import javax.xml.ws.Endpoint;

import com.webservice.service.impl.CommonsBookingServiceImpl;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		CommonsBookingServiceImpl impl = new CommonsBookingServiceImpl();
		String address = "http://localhost:8080/CommonsBookingService/example";
		Endpoint.publish(address, impl);
		System.out.println("Server ready...");
		Thread.sleep(99 * 60 * 1000);
		System.out.println("Server exciting...");
		System.exit(0);
	}
}
