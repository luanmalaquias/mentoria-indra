package com.minsait.GerenciadorDeGastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minsait.GerenciadorDeGastos.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{
	
}
