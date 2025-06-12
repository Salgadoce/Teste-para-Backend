package com.teste.modelo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ticket")
public class TICKET {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "OPENING_DATE")
    private LocalDate openingDate;

    @Column(name = "CLOSING_DATE")
    private LocalDate closingDate;

    @ManyToOne
    @JoinColumn(name = "FK_ID_CLIENTE", referencedColumnName = "cliente_id")
    private CLIENTE cliente;

    @ManyToOne
    @JoinColumn(name = "FK_ID_MODULE", referencedColumnName = "modulo_id")
    private MODULO modulo;

    // Getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public LocalDate getOpeningDate() { return openingDate; }
    public void setOpeningDate(LocalDate openingDate) { this.openingDate = openingDate; }

    public LocalDate getClosingDate() { return closingDate; }
    public void setClosingDate(LocalDate closingDate) { this.closingDate = closingDate; }

    public CLIENTE getCliente() { return cliente; }
    public void setCliente(CLIENTE cliente) { this.cliente = cliente; }

    public MODULO getModulo() { return modulo; }
    public void setModulo(MODULO modulo) { this.modulo = modulo; }
    
    
}
