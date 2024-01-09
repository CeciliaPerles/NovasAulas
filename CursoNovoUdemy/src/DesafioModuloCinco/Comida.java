package DesafioModuloCinco;

public class Comida {

	String nome;
	double peso;
	
		
	public Comida(String nome, double peso) {
		
		this.nome = nome;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Comida [nome=" + nome + ", peso=" + peso + "]";
	}
}
