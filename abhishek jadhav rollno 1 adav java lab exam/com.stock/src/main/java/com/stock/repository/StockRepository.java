package com.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryConfigurationAware;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;
import com.stock.entity.Stock;
@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

	public Stock create();

}
