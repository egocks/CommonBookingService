package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class TransferService {
	protected String id;
    protected String status;
    protected String transferId;
    protected String transferType;
    protected String shortDescription;
    protected String longDescription;
    protected String transportArrivalInstructions;
    protected String transportDepartureInstructions;
    protected String duration;
    protected String estimatedPickupTime;
    protected List<Pickup> pickups = new ArrayList<Pickup>();
    protected List<Dropoff> dropoffs = new ArrayList<Dropoff>();
    protected Amount netPrice;
    protected Amount grossPrice;
    protected String commentForTransfer;
    protected String commentForBookingDepartment;
	protected String voucherText;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTransferId() {
		return transferId;
	}

	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}

	public String getTransferType() {
		return transferType;
	}

	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getTransportArrivalInstructions() {
		return transportArrivalInstructions;
	}

	public void setTransportArrivalInstructions(String transportArrivalInstructions) {
		this.transportArrivalInstructions = transportArrivalInstructions;
	}

	public String getTransportDepartureInstructions() {
		return transportDepartureInstructions;
	}

	public void setTransportDepartureInstructions(String transportDepartureInstructions) {
		this.transportDepartureInstructions = transportDepartureInstructions;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEstimatedPickupTime() {
		return estimatedPickupTime;
	}

	public void setEstimatedPickupTime(String estimatedPickupTime) {
		this.estimatedPickupTime = estimatedPickupTime;
	}

	public List<Pickup> getPickups() {
		return pickups;
	}

	public void setPickups(List<Pickup> pickups) {
		this.pickups = pickups;
	}

	public List<Dropoff> getDropoffs() {
		return dropoffs;
	}

	public void setDropoffs(List<Dropoff> dropoffs) {
		this.dropoffs = dropoffs;
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

	public String getCommentForTransfer() {
		return commentForTransfer;
	}

	public void setCommentForTransfer(String commentForTransfer) {
		this.commentForTransfer = commentForTransfer;
	}

	public String getCommentForBookingDepartment() {
		return commentForBookingDepartment;
	}

	public void setCommentForBookingDepartment(String commentForBookingDepartment) {
		this.commentForBookingDepartment = commentForBookingDepartment;
	}

	public String getVoucherText() {
		return voucherText;
	}

	public void setVoucherText(String voucherText) {
		this.voucherText = voucherText;
	}
}
