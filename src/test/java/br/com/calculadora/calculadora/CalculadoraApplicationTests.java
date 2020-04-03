package br.com.calculadora.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.calculadora.core.IControlador;

@SpringBootTest
class CalculadoraApplicationTests {

	@Autowired
	IControlador controlador;
	
	@Test
	void testeCalculo() {
		assertEquals(new BigDecimal("135.0"), controlador.obterValorAtualizado(new BigDecimal("150"), 1));
		assertEquals(new BigDecimal("138.00"), controlador.obterValorAtualizado(new BigDecimal("150"), 2));
		assertEquals(new BigDecimal("141.00"), controlador.obterValorAtualizado(new BigDecimal("150"), 3));
		assertEquals(new BigDecimal("144.00"), controlador.obterValorAtualizado(new BigDecimal("150"), 4));
		assertEquals(new BigDecimal("147.00"), controlador.obterValorAtualizado(new BigDecimal("150"), 5));
		assertEquals(new BigDecimal("150"), controlador.obterValorAtualizado(new BigDecimal("150"), 6));
		assertEquals(new BigDecimal("0.0"), controlador.obterValorAtualizado(new BigDecimal("0"), 1));
	}

}
