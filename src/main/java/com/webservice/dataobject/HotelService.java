package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
	protected String id = "";
	protected String status = "";
	protected String establishmentId = "";
	protected String establishmentName = "";
	protected String cityId = "";
	protected String cityName = "";
	protected String stateId = "";
	protected String stateName = "";
	protected String countryCode = "";
	protected String countryName = "";
	protected String boardCode = "";
	protected String boardName = "";
	protected List<RoomOccupation> roomOccupationsList = new ArrayList<RoomOccupation>();
	protected Amount netPrice;
	protected Amount grossPrice;
	protected List<String> remarks = new ArrayList<String>();
	protected String commentForHotel = "";
	protected String commentForBookingDepartment = "";
	protected String voucherText = "";

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

	public String getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(String establishmentId) {
		this.establishmentId = establishmentId;
	}

	public String getEstablishmentName() {
		return establishmentName;
	}

	public void setEstablishmentName(String establishmentName) {
		this.establishmentName = establishmentName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getBoardCode() {
		return boardCode;
	}

	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public List<RoomOccupation> getRoomOccupationsList() {
		return roomOccupationsList;
	}

	public void setRoomOccupationsList(List<RoomOccupation> roomOccupationsList) {
		this.roomOccupationsList = roomOccupationsList;
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

	public List<String> getRemarks() {
		return remarks;
	}

	public void setRemarks(List<String> remarks) {
		this.remarks = remarks;
	}

	public String getCommentForHotel() {
		return commentForHotel;
	}

	public void setCommentForHotel(String commentForHotel) {
		this.commentForHotel = commentForHotel;
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
