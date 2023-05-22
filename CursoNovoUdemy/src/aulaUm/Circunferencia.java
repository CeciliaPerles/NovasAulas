package aulaUm;

import java.util.Scanner;

public class Circunferencia {
	
	final static double PI = 3.14;
	
	public static double calcularArea(double raio) {
		
		return PI * raio * raio;
	}
	
	public static double calcularCircunferencia(double raio) {
		
		return 2 * PI * raio ;
	}
	public static void imprimir(double valor) {
		
		System.out.println(valor);
	}
		
	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		
		double valorPassadoQueSeraRaio = sc.nextDouble();
		
		double area = calcularArea(valorPassadoQueSeraRaio);
		double circunferencia = calcularCircunferencia(valorPassadoQueSeraRaio);
		
		System.out.println(area + " " + circunferencia);*/
		
		Circunferencia circunferencia = new Circunferencia();
		
				
		System.out.println(circunferencia.calcularArea(5));
		
	}

	

}
