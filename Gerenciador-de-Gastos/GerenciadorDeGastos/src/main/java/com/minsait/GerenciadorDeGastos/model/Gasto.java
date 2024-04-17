package com.minsait.GerenciadorDeGastos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Gasto {	

	public Gasto(String descricao, String valor, String data) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
	}
	
	public Gasto() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "descricao", length = 50, nullable = false)
	private String descricao;
	
	@Column(name = "valor", length = 10, nullable = false)
	private String valor;
	
	@Column(name = "data", length = 10, nullable = false)
	private String data;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Long getId() {
		return id;
	}
}
