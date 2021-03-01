package com.springbatch.faturacartaodecredito.dominio;

import java.util.Date;

public class Transacao {
	// atributos
	private int id;
	private CartaoCredito cartaoCredito;
	private String descricao;
	private Double valor;
	private Date data;
	
	// getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}