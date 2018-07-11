package com.pet.model;

import java.math.BigDecimal;
import java.util.Date;
/***
 * 商家信息表
 * */
public class SellerModel {

	private int userId;
	private int sellerId;
	private String sellerName;
	private int scopeOfBusiness;
	private int starLevel;
	private BigDecimal deposit;
	private Date recordDate;
	private String headImgLocation;
	private String sellerSite;
	private int fansCount;
	private BigDecimal sumMonth;
	private BigDecimal total;
	private String statement;
	private int status;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getScopeOfBusiness() {
		return scopeOfBusiness;
	}
	public void setScopeOfBusiness(int scopeOfBusiness) {
		this.scopeOfBusiness = scopeOfBusiness;
	}
	public int getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(int starLevel) {
		this.starLevel = starLevel;
	}
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public String getHeadImgLocation() {
		return headImgLocation;
	}
	public void setHeadImgLocation(String headImgLocation) {
		this.headImgLocation = headImgLocation;
	}
	public String getSellerSite() {
		return sellerSite;
	}
	public void setSellerSite(String sellerSite) {
		this.sellerSite = sellerSite;
	}
	public int getFansCount() {
		return fansCount;
	}
	public void setFansCount(int fansCount) {
		this.fansCount = fansCount;
	}
	public BigDecimal getSumMonth() {
		return sumMonth;
	}
	public void setSumMonth(BigDecimal sumMonth) {
		this.sumMonth = sumMonth;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public int getTalkID() {
		return talkID;
	}
	public void setTalkID(int talkID) {
		this.talkID = talkID;
	}
	public int getCommoditySum() {
		return commoditySum;
	}
	public void setCommoditySum(int commoditySum) {
		this.commoditySum = commoditySum;
	}
	public int getNewCommodity() {
		return newCommodity;
	}
	public void setNewCommodity(int newCommodity) {
		this.newCommodity = newCommodity;
	}
	public int getHotCommodity() {
		return hotCommodity;
	}
	public void setHotCommodity(int hotCommodity) {
		this.hotCommodity = hotCommodity;
	}
	private int talkID;
	private int commoditySum;
	private int newCommodity;
	private int hotCommodity;

}
