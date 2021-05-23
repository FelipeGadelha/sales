package com.portfolio.sales.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.sales.domain.entity.Sale;
import com.portfolio.sales.domain.entity.Seller;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
