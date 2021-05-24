package com.portfolio.sales.api.v1.dto.response;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.function.Function;

public class SaleRs implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private SellerRs sellerRs;
	
	@Deprecated
	public SaleRs() { }
	
    public SaleRs(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerRs sellerRs) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.sellerRs = sellerRs;
	}

	public <R> R map(Function<SaleRs, R> func) {
        return func.apply(this);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public SellerRs getSellerRs() {
		return sellerRs;
	}
	
	public void setSellerRs(SellerRs sellerRs) {
		this.sellerRs = sellerRs;
	}
}
