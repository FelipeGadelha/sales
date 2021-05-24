package com.portfolio.sales.api.v1.dto.request;

import java.io.Serializable;
import java.util.function.Function;

public class SellerRq implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	@Deprecated
	public SellerRq() {	}

	public SellerRq(Long id, String name) {
		this.id = id;
		this.name = name;
	}

    public <R> R map(Function<SellerRq, R> func) {
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
