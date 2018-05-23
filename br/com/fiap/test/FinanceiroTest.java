package br.com.fiap.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.fiap.Financeiro;

public class FinanceiroTest {
	private Financeiro financeiro;
	
	@Before
	public void setUp() {
		financeiro = new Financeiro();
	}
	
	public void testCalcularCPMF() {
		double resultadoObtido = financeiro.calcularCPMF(100d);
		assertEquals(0.38, resultadoObtido);
	}
	
	@Test(expected = RuntimeException.class) 
	public void testValorNegativoCPMF() {
		financeiro.calcularCPMF(-100d);
	}
	
	@Test
	public void testCalcularIRRF() {
		Double resultadoObtido = financeiro.calcularIRRF(100d);
		assertEquals(new Double(27.0), resultadoObtido);
	}
	
	@Test(expected = RuntimeException.class) 
	public void testValorNegativoIRRF() {
		financeiro.calcularIRRF(-100d);
	}
}
