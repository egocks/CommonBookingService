package com.webservice.dataobject;

public class CancellationCost {
	protected String from;
	protected Amount netPrice;
	protected Amount grossPrice;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Amount getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(Amount netPrice) {
		this.netPrice = netPrice;
	}

	public Amount getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(Amount grossPrice) {
		this.grossPrice = grossPrice;
	}
}
