package Desafios;

public class Produto {
	
	String name;
	double price;
	static double discount = 0.25;
	
	double calcularPrecoComDesconto() {
		return price - discount;
		
	
	}

}
