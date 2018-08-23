package com.webservice.dataobject;

public abstract class AbstractRequest {
	protected String login;
	protected String password;
	protected boolean gzipResponse;
	protected String rqId;
	protected String agentId;
	protected String language;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isGzipResponse() {
		return gzipResponse;
	}

	public void setGzipResponse(boolean gzipResponse) {
		this.gzipResponse = gzipResponse;
	}

	public String getRqId() {
		return rqId;
	}

	public void setRqId(String rqId) {
		this.rqId = rqId;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
