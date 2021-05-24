package com.portfolio.sales.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.sales.api.v1.dto.response.SaleSuccessRs;
import com.portfolio.sales.api.v1.dto.response.SaleSumRs;
import com.portfolio.sales.domain.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.portfolio.sales.api.v1.dto.response.SaleSumRs(obj.seller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumRs> amountGroupedBySeller();
	
	@Query("SELECT new com.portfolio.sales.api.v1.dto.response.SaleSuccessRs(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessRs> successGroupedBySeller();
	
}
