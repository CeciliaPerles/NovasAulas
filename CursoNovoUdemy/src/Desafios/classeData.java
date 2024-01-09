package Desafios;

public class classeData {

	int dia;
	int mes;
	int ano;
	
	public classeData(int diaInicial, int mesInicial, int anoInicial) {
		
		this.dia = diaInicial;
		this.mes = mesInicial;
		this.ano = anoInicial;
	}
	
	public classeData() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	String retornarDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		 System.out.println(retornarDataFormatada());
	}
		
}
