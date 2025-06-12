package com.teste.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="modulo")
public class MODULO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "modulo_id")
	private Long modulo_id;
	
	@Column(name = "NOME")
	private String nome;
	
	public Long getId() { return modulo_id; }
	public void setId(Long id) { this.modulo_id = id; }
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
}
