package AulaSeteComposicao;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	String cliente;
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.preco * item.quantidade;
		}
		
		return total;
		
	}
}
