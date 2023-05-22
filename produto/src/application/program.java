package application;

import java.util.Scanner;

import entities.Produto;

public class program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			
		System.out.println("Digite os dados do produto:\n");
		System.out.print("Nome:");
		String nomeProduto = sc.nextLine();
		
		System.out.print("Preço:");
		Double precoProduto = sc.nextDouble();
		
		/*System.out.print("Quantidade:");
		int quantidadeProduto = sc.nextInt();*/
		
		Produto produto = new Produto(nomeProduto, precoProduto);
		
		System.out.println("\n\nProduto: " + produto.nomeProduto
				+ "\nPreço: " + produto.precoProduto 
				+ "\nQuantidade: " + produto.quantidadeProduto);
		
		System.out.println("\n\nProdutos a serem adicionados: ");		
		int quantidadeProduto = sc.nextInt();
		produto.adicionarProdutos(quantidadeProduto);
		
		System.out.println("\n\nProduto: " + produto.nomeProduto
				+ "\nPreço: " + produto.precoProduto 
				+ "\nQuantidade: " + produto.quantidadeProduto);
		
		System.out.println("\n\nProdutos a serem removidos: ");		
		quantidadeProduto = sc.nextInt();
		produto.removerProdutos(quantidadeProduto);
		
		System.out.println("\n\nProduto: " + produto.nomeProduto
				+ "\nPreço: " + produto.precoProduto 
				+ "\nQuantidade: " + produto.quantidadeProduto);
		
		sc.close();
	}

}
