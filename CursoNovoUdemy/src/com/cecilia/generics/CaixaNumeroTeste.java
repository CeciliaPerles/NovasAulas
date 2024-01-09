package com.cecilia.generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(123.0);
		
		System.out.println(caixaB.abrir());
	}

}
