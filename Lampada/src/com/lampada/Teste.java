package com.lampada;

public class Teste {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
				
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
