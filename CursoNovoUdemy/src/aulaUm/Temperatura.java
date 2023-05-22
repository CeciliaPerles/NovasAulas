package aulaUm;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double f = 86;
		final double CONSTUM = 32;
		final double CONSTDOIS = 5.0/9.0;
		
		double c = (f - CONSTUM) * CONSTDOIS;
		
		f = 50;
		c = (f - CONSTUM) * CONSTDOIS;
		
		Circunferencia.imprimir(c);
	}

}
