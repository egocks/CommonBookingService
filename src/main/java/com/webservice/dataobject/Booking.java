package com.webservice.dataobject;

public class Booking {
	protected String locator;
	protected String yourReference;
	protected String titular;
	protected String status;
	protected String description;
	protected String formalizationDate;
	protected String fromDate;
	protected String toDate;
	protected Amount netPrice;
	protected Amount grossPrice;

	public String getLocator() {
		return locator;
	}

	public void setLocator(String locator) {
		this.locator = locator;
	}

	public String getYourReference() {
		return yourReference;
	}

	public void setYourReference(String yourReference) {
		this.yourReference = yourReference;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormalizationDate() {
		return formalizationDate;
	}

	public void setFormalizationDate(String formalizationDate) {
		this.formalizationDate = formalizationDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
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
