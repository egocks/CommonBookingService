package com.webservice.response;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import com.webservice.dataobject.AbstractResponse;
import com.webservice.dataobject.Amount;
import com.webservice.dataobject.CancellationCost;
import com.webservice.dataobject.DestinationActivityService;
import com.webservice.dataobject.HotelService;
import com.webservice.dataobject.SaleDetail;
import com.webservice.dataobject.TransferService;

@XmlType(namespace = "getBookingResponse")
public class GetBookingResponse extends AbstractResponse {
	protected String locator;
	protected String yourReference;
	protected String titular;
	protected String formalizationDate;
	protected String lastModificationDate;
	protected String status;
	protected List<HotelService> hotelServices;
	protected List<TransferService> transferServices;
	protected List<DestinationActivityService> destinationActivityServices;
	protected Amount netPrice;
	protected Amount grossPrice;
	protected List<CancellationCost> cancellationCosts;
	protected List<SaleDetail> saleDetail;

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

	public String getFormalizationDate() {
		return formalizationDate;
	}

	public void setFormalizationDate(String formalizationDate) {
		this.formalizationDate = formalizationDate;
	}

	public String getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(String lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<HotelService> getHotelServices() {
		return hotelServices;
	}

	public void setHotelServices(List<HotelService> hotelServices) {
		this.hotelServices = hotelServices;
	}

	public List<TransferService> getTransferServices() {
		return transferServices;
	}

	public void setTransferServices(List<TransferService> transferServices) {
		this.transferServices = transferServices;
	}

	public List<DestinationActivityService> getDestinationActivityServices() {
		return destinationActivityServices;
	}

	public void setDestinationActivityServices(List<DestinationActivityService> destinationActivityServices) {
		this.destinationActivityServices = destinationActivityServices;
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

	public List<CancellationCost> getCancellationCosts() {
		return cancellationCosts;
	}

	public void setCancellationCosts(List<CancellationCost> cancellationCosts) {
		this.cancellationCosts = cancellationCosts;
	}

	public List<SaleDetail> getSaleDetail() {
		return saleDetail;
	}

	public void setSaleDetail(List<SaleDetail> saleDetail) {
		this.saleDetail = saleDetail;
	}

}
