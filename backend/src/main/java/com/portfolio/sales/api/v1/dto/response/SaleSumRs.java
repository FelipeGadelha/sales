package com.portfolio.sales.api.v1.dto.response;

import java.io.Serializable;

import com.portfolio.sales.domain.entity.Seller;

public class SaleSumRs implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;
	
	@Deprecated
	public SaleSumRs() { }

	public SaleSumRs(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
}
