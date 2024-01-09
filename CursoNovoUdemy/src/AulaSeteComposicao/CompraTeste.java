package AulaSeteComposicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Jão";
		c1.itens.add(new Item("Caneta", 7, 1));
		c1.itens.add(new Item("Lápis", 5, 2));
		c1.itens.add(new Item("Borracha", 2, 4));
		
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}

}
