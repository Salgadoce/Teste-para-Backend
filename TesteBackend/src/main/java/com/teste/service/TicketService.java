package com.teste.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.modelo.CLIENTE;
import com.teste.modelo.MODULO;
import com.teste.modelo.TICKET;
import com.teste.repository.Ticket_Repository;
import com.teste.repository.Client_Repository;
import com.teste.repository.Module_Repository;

@Service
public class TicketService {
	 @Autowired
	    private Ticket_Repository ticketRepository;
	 @Autowired
	 	private Client_Repository ClientRepository;
	 @Autowired
	 	private Module_Repository ModuleRepository;
	    
	    public  TICKET criarTicket(TICKET ticket) {
	        CLIENTE cliente = ClientRepository.findById(ticket.getCliente().getId())
	            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

	        
	        MODULO modulo = ModuleRepository.findById(ticket.getModulo().getId())
	            .orElseThrow(() -> new RuntimeException("Módulo não encontrado"));

	        ticket.setCliente(cliente);
	        ticket.setModulo(modulo);

	        
	       return ticketRepository.save(ticket);
	    }
	    public List<TICKET> listarTicketsPorMesEAno(int mes, int ano) {
	    	List<TICKET> tickets = ticketRepository.findByMesEAno(mes, ano);

	        
	        tickets.sort(Comparator
	            .comparing((TICKET t) -> t.getCliente() != null ? t.getCliente().getNome() : "")
	            .thenComparing(t -> t.getModulo() != null ? t.getModulo().getNome() : ""));

	        return tickets;
	    }
}
