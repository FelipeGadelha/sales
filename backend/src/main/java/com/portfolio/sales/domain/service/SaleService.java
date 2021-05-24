package com.portfolio.sales.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portfolio.sales.api.v1.dto.response.SaleSuccessRs;
import com.portfolio.sales.api.v1.dto.response.SaleSumRs;
import com.portfolio.sales.domain.entity.Sale;
import com.portfolio.sales.domain.repository.SaleRepository;
import com.portfolio.sales.domain.repository.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<Sale> findAll(Pageable pageable) {
		sellerRepository.findAll();
		return saleRepository.findAll(pageable);
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumRs> amountGroupBySeller() {
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessRs> successGroupBySeller() {
		return saleRepository.successGroupedBySeller();
	}

}
