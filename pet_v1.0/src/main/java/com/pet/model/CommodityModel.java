package com.pet.model;

import java.math.BigDecimal;

public class CommodityModel {
	private int commodityID;
	private int sellerID;
	private String commodityName;
	private int IType;
	private int IIType;
	private String statement;
	private int specificationID;
	private int residue;
	private int sellSum;
	private BigDecimal price;
	private BigDecimal currentPrice;
	private double rebate;
	private int salesID;
	private double level;
	private int status;
	private BigDecimal freight;
	private int freightflag;
	public int getCommodityID() {
		return commodityID;
	}
	public void setCommodityID(int commodityID) {
		this.commodityID = commodityID;
	}
	public int getSellerID() {
		return sellerID;
	}
	public void setSellerID(int sellerID) {
		this.sellerID = sellerID;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public int getIType() {
		return IType;
	}
	public void setIType(int iType) {
		IType = iType;
	}
	public int getIIType() {
		return IIType;
	}
	public void setIIType(int iIType) {
		IIType = iIType;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public int getSpecificationID() {
		return specificationID;
	}
	public void setSpecificationID(int specificationID) {
		this.specificationID = specificationID;
	}
	public int getResidue() {
		return residue;
	}
	public void setResidue(int residue) {
		this.residue = residue;
	}
	public int getSellSum() {
		return sellSum;
	}
	public void setSellSum(int sellSum) {
		this.sellSum = sellSum;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(BigDecimal currentPrice) {
		this.currentPrice = currentPrice;
	}
	public double getRebate() {
		return rebate;
	}
	public void setRebate(double rebate) {
		this.rebate = rebate;
	}
	public int getSalesID() {
		return salesID;
	}
	public void setSalesID(int salesID) {
		this.salesID = salesID;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public BigDecimal getFreight() {
		return freight;
	}
	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}
	public int getFreightflag() {
		return freightflag;
	}
	public void setFreightflag(int freightflag) {
		this.freightflag = freightflag;
	}

}
