package br.com.calculadora.core.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.calculadora.core.ICalculadora;

@Service
public class Calculadora implements ICalculadora {

	public BigDecimal calcularValor(BigDecimal valor, BigDecimal porcentagem) {
		return valor.subtract(porcentagem.divide(new BigDecimal("100")).multiply(valor));
	}
}
