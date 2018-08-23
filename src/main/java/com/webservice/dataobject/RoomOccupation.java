package com.webservice.dataobject;

import java.util.ArrayList;
import java.util.List;

public class RoomOccupation {
	String checkIn = "";
	String checkOut = "";
	String roomCode = "";
	String roomName = "";
	int adultsPerRoom;
	int childrenPerRoom;
	int infantsPerRoom;
	List<Integer> childrenAges = new ArrayList<Integer>();
	int numberOfRooms;

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public void setAdultsPerRoom(int adultsPerRoom) {
		this.adultsPerRoom = adultsPerRoom;
	}

	public int getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public void setChildrenPerRoom(int childrenPerRoom) {
		this.childrenPerRoom = childrenPerRoom;
	}

	public int getInfantsPerRoom() {
		return infantsPerRoom;
	}

	public void setInfantsPerRoom(int infantsPerRoom) {
		this.infantsPerRoom = infantsPerRoom;
	}

	public List<Integer> getChildrenAges() {
		return childrenAges;
	}

	public void setChildrenAges(List<Integer> childrenAges) {
		this.childrenAges = childrenAges;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
}
