package entities;

public final class Poupanca extends Conta{

	private Double taxaJuros;
	
	public Poupanca(){
		super();
	}

	public Poupanca(String nomeTitular, Integer numeroConta, Double depositoInicial, Double taxaJuros) {
		super(nomeTitular, numeroConta, depositoInicial);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void extratoAtualizado() {
		extrato += extrato * taxaJuros;
	}
	
	@Override
	public void sacarValor(double quantia) {
		extrato -= quantia;
	}
	
}
