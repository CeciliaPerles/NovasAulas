package entities;

public class Produto {
	
	public String nomeProduto;
	public double precoProduto;
	public int quantidadeProduto;

	public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public Produto(String nomeProduto, double precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
	}


	public double valorTotalEstoque() {
		return precoProduto * quantidadeProduto;
	}
	
	public void adicionarProdutos(int quantidadeProduto) {
		this.quantidadeProduto += quantidadeProduto;
	}
	
	public void removerProdutos(int quantidadeProduto) {
		this.quantidadeProduto -= quantidadeProduto;
	}

	
	
	
	
	
}
