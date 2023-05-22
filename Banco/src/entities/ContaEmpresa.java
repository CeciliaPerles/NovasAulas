package entities;

public class ContaEmpresa extends Conta {

	private Double limiteEmprestimo;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(String nomeTitular, Integer numeroConta, Double depositoInicial, Double limiteEmprestimo) {
		super(nomeTitular, numeroConta, depositoInicial);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestimo){
			extrato =+ quantia - 10;
		}
	}
}
