package com.portfolio.sales.api.v1.dto.response;

import java.io.Serializable;
import java.util.function.Function;

public class SellerRs implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	@Deprecated
	public SellerRs() {	}

	public SellerRs(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
    public <R> R map(Function<SellerRs, R> func) {
        return func.apply(this);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
