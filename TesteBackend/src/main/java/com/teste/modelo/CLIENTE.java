package com.teste.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name ="cliente")
public class CLIENTE {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cliente_id")
	private Long cliente_id;
	
	@Column(name = "NOME")
	private String nome;
	
	public Long getId() { return cliente_id; }
	public void setId(Long id) { this.cliente_id = id; }
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
}
