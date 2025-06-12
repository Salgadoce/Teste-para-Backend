package com.teste.repository;

import java.util.List;

/*import java.time.LocalDate;
import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.teste.modelo.TICKET;

@Repository
public interface Ticket_Repository extends JpaRepository<TICKET, Long>{
	@Query("SELECT t FROM TICKET t WHERE " +
	           "(MONTH(t.openingDate) = :mes AND YEAR(t.openingDate) = :ano) " +
	           "OR (MONTH(t.closingDate) = :mes AND YEAR(t.closingDate) = :ano)")
	    List<TICKET> findByMesEAno(@Param("mes") int mes, @Param("ano") int ano);
}
