package br.com.calculadora.core;

import java.math.BigDecimal;

public interface IControlador {

	public BigDecimal obterValorAtualizado(BigDecimal valor, int parcelas);
}
