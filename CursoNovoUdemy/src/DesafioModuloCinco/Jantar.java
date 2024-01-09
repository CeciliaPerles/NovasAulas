package DesafioModuloCinco;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Salada", 2);
		Comida comida2 = new Comida("Salada", 3);
		
		Pessoa pessoa1 = new Pessoa("Cecília", 70);
		System.out.println(pessoa1.toString());
		Pessoa pessoa2 = new Pessoa("Murilo", 120);
		System.out.println(pessoa2.toString());
		
		pessoa1.comer(comida1);
		pessoa2.comer(comida2);

		System.out.println(pessoa1.toString());
		System.out.println(pessoa2.toString());
		
		
		
	}


}
