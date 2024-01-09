package DesafioModuloCinco;


public class Pessoa {

	String nome;
	double peso;
	
	public Pessoa(String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
	}
	
	double comer(Comida comida) {
		this.peso += comida.peso;
		return this.peso; 	
	}

	
	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + " e peso = " + peso + "]";
	}
	
	
}
