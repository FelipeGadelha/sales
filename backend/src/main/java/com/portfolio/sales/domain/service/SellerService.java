package com.portfolio.sales.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.sales.domain.entity.Seller;
import com.portfolio.sales.domain.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;
	
	public List<Seller> findAll(){
		return sellerRepository.findAll();
	}
	
}
