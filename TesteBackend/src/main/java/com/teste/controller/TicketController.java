package com.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.modelo.TICKET;
import com.teste.service.TicketService;

@RestController
@RequestMapping("/Ticket")
public class TicketController {
	@Autowired
    private TicketService ticketService;

    @GetMapping("/Get")
    public ResponseEntity<List<TICKET>> listarTicketsPorMesEAno(
            @RequestParam int mes,
            @RequestParam int ano
        ) {
            List<TICKET> tickets = ticketService.listarTicketsPorMesEAno(mes, ano);
            return ResponseEntity.ok(tickets);
        }
    
    
    @PostMapping("/Post")
    public TICKET criarTicket(@RequestBody TICKET ticket) {
        return ticketService.criarTicket(ticket);
    }
}
