package entities;

public class Conta {
	
	private Integer numeroConta;
	private String nomeTitular;
	protected Double extrato;
	
	public Conta() {
		
	}
	
	public Conta(String nomeTitular, Integer numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}
		
	public Conta(String nomeTitular, Integer numeroConta, Double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		depositarValor(depositoInicial);
	}
		
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getExtrato() {
		return extrato;
	}
	
	public void depositarValor(double quantia) {
		extrato += quantia;
	}
	
	public void sacarValor(double quantia) {
		extrato -= quantia + 5;
	}
	public String toString() {
		return "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Extrato: R$ "
				+ String.format("%.2f", extrato)
				+ ".";
	}
}
