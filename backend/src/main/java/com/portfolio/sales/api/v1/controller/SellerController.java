package com.portfolio.sales.api.v1.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.sales.api.v1.dto.response.SellerRs;
import com.portfolio.sales.domain.service.SellerService;

@RestController
@RequestMapping("/v1/sellers")
public class SellerController {

	
	@Autowired
	private SellerService sellerService;
	
	@GetMapping
	public ResponseEntity<List<SellerRs>> findAll() {
		return ResponseEntity.ok(sellerService.findAll()
				.stream()
				.map(s -> new SellerRs(s.getId(), s.getName()))
				.collect(Collectors.toList()));
	}
}
