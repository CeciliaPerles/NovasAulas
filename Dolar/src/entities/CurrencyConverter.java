package entities;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	/*public static double cambio(double precoDolar, double valorComprado) {
		double valorDeCambio = precoDolar * valorComprado;
		return valorDeCambio;
}*/
	
	public static double total(double precoDolar, double valorComprado) {
		double valorEmReais = precoDolar * valorComprado;
		return valorEmReais + calcularIof(precoDolar, valorComprado);
		
}
	
	
	public static double calcularIof(double precoDolar, double valorComprado) {
		return precoDolar * valorComprado * IOF;
	}

}
