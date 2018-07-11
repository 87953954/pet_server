package com.pet.model;

public class LogidticsInfoModel {
	private String logidticsID; // 物流ID
	private String indentID; // 订单ID
	private int logidticsStatus; // 物流状态
	private String logidtics; // 物流公司
	private String currentSite; // 当前位置
	private String sendPerson; // 配送员
	private String sendPhone; // 配送员电话
	
	
	
	public String getLogidticsID() {
		return logidticsID;
	}
	public void setLogidticsID(String logidticsID) {
		this.logidticsID = logidticsID;
	}
	public String getIndentID() {
		return indentID;
	}
	public void setIndentID(String indentID) {
		this.indentID = indentID;
	}
	public int getLogidticsStatus() {
		return logidticsStatus;
	}
	public void setLogidticsStatus(int logidticsStatus) {
		this.logidticsStatus = logidticsStatus;
	}
	public String getLogidtics() {
		return logidtics;
	}
	public void setLogidtics(String logidtics) {
		this.logidtics = logidtics;
	}
	public String getCurrentSite() {
		return currentSite;
	}
	public void setCurrentSite(String currentSite) {
		this.currentSite = currentSite;
	}
	public String getSendPerson() {
		return sendPerson;
	}
	public void setSendPerson(String sendPerson) {
		this.sendPerson = sendPerson;
	}
	public String getSendPhone() {
		return sendPhone;
	}
	public void setSendPhone(String sendPhone) {
		this.sendPhone = sendPhone;
	}

}
