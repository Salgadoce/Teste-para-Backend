package com.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.modelo.MODULO;

@Repository
public interface Module_Repository extends JpaRepository<MODULO, Long>{
	
}
