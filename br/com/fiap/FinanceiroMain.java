package br.com.fiap;

public class FinanceiroMain {
	
	
	public static void main(String[] args) {
		Financeiro financeiro = new Financeiro();
		
		System.out.println(financeiro.calcularCPMF(100d));
		System.out.println(financeiro.calcularIRRF(100d));
	}
}
