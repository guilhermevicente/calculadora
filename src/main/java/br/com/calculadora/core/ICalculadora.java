package br.com.calculadora.core;

import java.math.BigDecimal;

public interface ICalculadora {

	public BigDecimal calcularValor(BigDecimal valor, BigDecimal porcentagem);
}
