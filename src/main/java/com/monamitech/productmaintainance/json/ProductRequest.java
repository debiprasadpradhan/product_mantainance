package com.monamitech.productmaintainance.json;

import java.util.Date;

public class ProductRequest {
	private String organization;
	private String productCode;
	private String productName;
	private double productMinValue;
	private double productMaxValue;
	private Date productStartDate;
	private Date productEndDate;
	private Integer productStatusCode;
	private double startValue;
	private double endValue;
	private Integer term;
	private float intRate;

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductMinValue() {
		return productMinValue;
	}

	public void setProductMinValue(double productMinValue) {
		this.productMinValue = productMinValue;
	}

	public double getProductMaxValue() {
		return productMaxValue;
	}

	public void setProductMaxValue(double productMaxValue) {
		this.productMaxValue = productMaxValue;
	}

	public Date getProductStartDate() {
		return productStartDate;
	}

	public void setProductStartDate(Date productStartDate) {
		this.productStartDate = productStartDate;
	}

	public Date getProductEndDate() {
		return productEndDate;
	}

	public void setProductEndDate(Date productEndDate) {
		this.productEndDate = productEndDate;
	}

	public Integer getProductStatusCode() {
		return productStatusCode;
	}

	public void setProductStatusCode(Integer productStatusCode) {
		this.productStatusCode = productStatusCode;
	}

	public double getStartValue() {
		return startValue;
	}

	public void setStartValue(double startValue) {
		this.startValue = startValue;
	}

	public double getEndValue() {
		return endValue;
	}

	public void setEndValue(double endValue) {
		this.endValue = endValue;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public float getIntRate() {
		return intRate;
	}

	public void setIntRate(float intRate) {
		this.intRate = intRate;
	}

}
