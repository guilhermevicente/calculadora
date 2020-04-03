package br.com.calculadora.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculadora.core.IControlador;

@RestController
public class CalculadoraController {

	@Autowired
	IControlador controlador;
	
	@GetMapping("/calcular/{valor}/{parcelas}")
	public ResponseEntity<String> calcularValor(@PathVariable(value = "valor") String valor, @PathVariable(value = "parcelas") String parcelas) {
		
		BigDecimal valorValidado = null;
		
		Integer quantidadeParcelas = null;
		
		try {
			valorValidado = new BigDecimal(valor);
			quantidadeParcelas = new Integer(parcelas);
		} catch (NumberFormatException nfe) {
			return new ResponseEntity<String>("Parâmetros inválidos", HttpStatus.BAD_REQUEST);
		}
		
		BigDecimal valorCorrigido = null;
		
		try {
			valorCorrigido = controlador.obterValorAtualizado(valorValidado, quantidadeParcelas.intValue());
		} catch (Exception e) {
			return new ResponseEntity<String>("Ocorreu um erro interno", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>(valorCorrigido.toString(), HttpStatus.OK);
	}
}
