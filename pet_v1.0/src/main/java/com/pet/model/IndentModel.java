package com.pet.model;

import java.math.BigDecimal;
import java.util.Date;

public class IndentModel {

	private String indentID; // 订单ID
	private Date indentDate; // 下单时间
	private BigDecimal indentAmount; // 订单金额
	private int indentStatus; // 订单状态
	private int userID; // 客户ID
	private int sellerID; // 商家ID
	private int commodityID; // 商品ID
	private String userName; // 客户姓名
	private String userPhone; // 客户联系方式
	private String remarks; // 备注
	private String sendAddress; // 发件地址
	private String receiveAddress; // 收件地址
	private String sellerName; // 发件人
	private String sellerPhone; // 发件联系方式
	private int flag; // 是否评价
	public String getIndentID() {
		return indentID;
	}
	public void setIndentID(String indentID) {
		this.indentID = indentID;
	}
	public Date getIndentDate() {
		return indentDate;
	}
	public void setIndentDate(Date indentDate) {
		this.indentDate = indentDate;
	}
	public BigDecimal getIndentAmount() {
		return indentAmount;
	}
	public void setIndentAmount(BigDecimal indentAmount) {
		this.indentAmount = indentAmount;
	}
	public int getIndentStatus() {
		return indentStatus;
	}
	public void setIndentStatus(int indentStatus) {
		this.indentStatus = indentStatus;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getSellerID() {
		return sellerID;
	}
	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}
	public int getCommodityID() {
		return commodityID;
	}
	public void setCommodityID(int commodityID) {
		this.commodityID = commodityID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSendAddress() {
		return sendAddress;
	}
	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}
	public String getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}

}
