package com.portfolio.sales.api.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.sales.api.v1.dto.response.SaleRs;
import com.portfolio.sales.api.v1.dto.response.SaleSuccessRs;
import com.portfolio.sales.api.v1.dto.response.SaleSumRs;
import com.portfolio.sales.api.v1.dto.response.SellerRs;
import com.portfolio.sales.domain.service.SaleService;

@RestController
@RequestMapping("/v1/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleRs>> findAll(Pageable pageable) {
		return ResponseEntity.ok(saleService.findAll(pageable)
				.map(s -> new SaleRs(s.getId(), s.getVisited(), s.getDeals(), s.getAmount(), s.getDate(), 
						new SellerRs(s.getSeller().getId(), s.getSeller().getName()))));
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SaleSumRs>> amountGroupBySeller() {
		return ResponseEntity.ok(saleService.amountGroupBySeller());
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SaleSuccessRs>> successGroupBySeller() {
		return ResponseEntity.ok(saleService.successGroupBySeller());
	}
}
