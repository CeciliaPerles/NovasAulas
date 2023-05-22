package com.lampada;

public class Lampada {
	
	private String cor;
	private String modelo;

	private Boolean ligada;
	
	public Boolean isLigada() {
		return ligada;
	}

	public void setLigada(Boolean ligada) {
		this.ligada = ligada;
	}

	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if(isLigada()) {
			System.out.println("A lâmpada está ligada.");
		}else {
			System.out.println("A lâmpada está desligada.");
		}
	}
	
	void mudarEstado() {
		if(isLigada()) {
			desligar();
		}else {
			ligar();
		}
	}
}
