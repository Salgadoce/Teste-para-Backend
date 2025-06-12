package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.modelo.CLIENTE;

@Repository
public interface Client_Repository extends JpaRepository<CLIENTE, Long>{
	
}

