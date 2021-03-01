package com.springbatch.faturacartaodecredito.dominio;

public class CartaoCredito {
	// atributos
	private int numeroCartaoCredito;
	private Cliente cliente;
	
	// getters and setters
	public int getNumeroCartaoCredito() {
		return numeroCartaoCredito;
	}
	public void setNumeroCartaoCredito(int numeroCartaoCredito) {
		this.numeroCartaoCredito = numeroCartaoCredito;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}