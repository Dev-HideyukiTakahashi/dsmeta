package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmeta.model.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
