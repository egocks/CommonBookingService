package com.webservice.dataobject;

public abstract class AbstractResponse {
	protected int resultCode;
	protected String message;
	protected String cpuTime;
	protected String dateAtServer;
	protected String rqId;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCpuTime() {
		return cpuTime;
	}

	public void setCpuTime(String cpuTime) {
		this.cpuTime = cpuTime;
	}

	public String getDateAtServer() {
		return dateAtServer;
	}

	public void setDateAtServer(String dateAtServer) {
		this.dateAtServer = dateAtServer;
	}

	public String getRqId() {
		return rqId;
	}

	public void setRqId(String rqId) {
		this.rqId = rqId;
	}
}
