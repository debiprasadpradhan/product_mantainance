package com.monamitech.productmaintainance.auditclient;

public class AuditTrailRequest {
	private String systemName;

	private String data;

	private String eventName;

	private String user;

	private String activity;
	private String logType;

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	@Override
	public String toString() {
		return "AuditTrailRequest [systemName=" + systemName + ", data=" + data + ", eventName=" + eventName + ", user="
				+ user + ", activity=" + activity + ", logType=" + logType + "]";
	}

}