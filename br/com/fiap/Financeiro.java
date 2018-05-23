package br.com.fiap;


public class Financeiro {

	public double calcularCPMF(double valor)  {
		if (valor < 0) 
			throw new RuntimeException("Valor nao pode ser negativo");
		
		return valor * 0.0038;
	}

	public double calcularIRRF(double valor) {
		if (valor < 0) 
			throw new RuntimeException("Valor nao pode ser negativo");
	
		return valor * 0.27;
	}
}
