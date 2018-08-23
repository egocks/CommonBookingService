package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class DestinationActivityService {
	protected String id;
	protected String status;
	protected Amount netPrice;
	protected Amount grossPrice;
	protected String destinationActivityId;
	protected String destinationActivityName;
	protected String destinationActivityDescription;
	protected String destinationActivityDate;
	protected String meetingPointId;
	protected String meetingPointName;
	protected String meetingPointDescription;
	protected List<DestinationActivitySupplement> supplements = new ArrayList<DestinationActivitySupplement>();
	protected String commentForDestinationActivity;
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

	public String getDestinationActivityId() {
		return destinationActivityId;
	}

	public void setDestinationActivityId(String destinationActivityId) {
		this.destinationActivityId = destinationActivityId;
	}

	public String getDestinationActivityName() {
		return destinationActivityName;
	}

	public void setDestinationActivityName(String destinationActivityName) {
		this.destinationActivityName = destinationActivityName;
	}

	public String getDestinationActivityDescription() {
		return destinationActivityDescription;
	}

	public void setDestinationActivityDescription(String destinationActivityDescription) {
		this.destinationActivityDescription = destinationActivityDescription;
	}

	public String getDestinationActivityDate() {
		return destinationActivityDate;
	}

	public void setDestinationActivityDate(String destinationActivityDate) {
		this.destinationActivityDate = destinationActivityDate;
	}

	public String getMeetingPointId() {
		return meetingPointId;
	}

	public void setMeetingPointId(String meetingPointId) {
		this.meetingPointId = meetingPointId;
	}

	public String getMeetingPointName() {
		return meetingPointName;
	}

	public void setMeetingPointName(String meetingPointName) {
		this.meetingPointName = meetingPointName;
	}

	public String getMeetingPointDescription() {
		return meetingPointDescription;
	}

	public void setMeetingPointDescription(String meetingPointDescription) {
		this.meetingPointDescription = meetingPointDescription;
	}

	public List<DestinationActivitySupplement> getSupplements() {
		return supplements;
	}

	public void setSupplements(List<DestinationActivitySupplement> supplements) {
		this.supplements = supplements;
	}

	public String getCommentForDestinationActivity() {
		return commentForDestinationActivity;
	}

	public void setCommentForDestinationActivity(String commentForDestinationActivity) {
		this.commentForDestinationActivity = commentForDestinationActivity;
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
