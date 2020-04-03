package br.com.calculadora.core.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.calculadora.core.ICalculadora;
import br.com.calculadora.core.IControlador;

@Service
public class Controlador implements IControlador {

	@Autowired
	ICalculadora calculadora;
	
	public BigDecimal obterValorAtualizado(BigDecimal valor, int parcelas) {
		
		BigDecimal porcentagem;
		
		switch (parcelas) {
		case 1:
			porcentagem = new BigDecimal("10");
			break;
		case 2:
			porcentagem = new BigDecimal("8");
			break;
		case 3:
			porcentagem = new BigDecimal("6");
			break;
		case 4:
			porcentagem = new BigDecimal("4");
			break;
		case 5:
			porcentagem = new BigDecimal("2");
			break;
		default:
			porcentagem = new BigDecimal("0");
			break;
		}
		
		return calculadora.calcularValor(valor, porcentagem);
	}
}
