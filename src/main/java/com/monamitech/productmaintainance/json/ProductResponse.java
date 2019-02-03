package com.monamitech.productmaintainance.json;

import java.util.Date;
import java.util.List;

public class ProductResponse {
	private int status;
	private String productCode;
	private String productName;
	private String productCurrency;
	private double productMinValue;
	private double productMaxValue;
	private Date productStartDate;
	private Date productEndDate;
	private String function_id;
	private String function_name;
	private Integer productStatusCode;

	private List<ProductTier> productTiers;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
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

	public String getProductCurrency() {
		return productCurrency;
	}

	public void setProductCurrency(String productCurrency) {
		this.productCurrency = productCurrency;
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

	public String getFunction_id() {
		return function_id;
	}

	public void setFunction_id(String function_id) {
		this.function_id = function_id;
	}

	public String getFunction_name() {
		return function_name;
	}

	public void setFunction_name(String function_name) {
		this.function_name = function_name;
	}

	public Integer getProductStatusCode() {
		return productStatusCode;
	}

	public void setProductStatusCode(Integer productStatusCode) {
		this.productStatusCode = productStatusCode;
	}

	public List<ProductTier> getProductTiers() {
		return productTiers;
	}

	public void setProductTiers(List<ProductTier> productTiers) {
		this.productTiers = productTiers;
	}

}
