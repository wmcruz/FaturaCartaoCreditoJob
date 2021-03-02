package com.springbatch.faturacartaodecredito.processor;

import javax.xml.bind.ValidationException;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.springbatch.faturacartaodecredito.dominio.Cliente;
import com.springbatch.faturacartaodecredito.dominio.FaturaCartaoCredito;

@Component
public class CarregarDadosClienteProcessor implements ItemProcessor<FaturaCartaoCredito, FaturaCartaoCredito> {
	private RestTemplate restTemplate = new RestTemplate();

	@Override
	public FaturaCartaoCredito process(FaturaCartaoCredito faturaCartaoCredito) throws Exception {
		String uri = String.format("https://my-json-server.typicode.com/giuliana-bezerra/demo/profile/%d", faturaCartaoCredito.getCliente().getId());
		ResponseEntity<Cliente> response = this.restTemplate.getForEntity(uri, Cliente.class);
		
		if (response.getStatusCode() != HttpStatus.OK)
				throw new ValidationException("Cliente não encontrado");
		
		faturaCartaoCredito.setCliente(response.getBody());
		return faturaCartaoCredito;
	}
}