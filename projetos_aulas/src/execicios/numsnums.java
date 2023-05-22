package execicios;

import java.util.Scanner;

public class numsnums {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		final double IPI = 30;
		
		System.out.println("Informe cod1: ");
		String cod1 = sc.next();
		
		System.out.println("Informe valor1: ");
		double valor1 = sc.nextDouble();
		
		System.out.println("Informe quant1: ");
		double quant1 = sc.nextDouble();
		
		System.out.println("Informe cod2: ");
		String cod2 = sc.next();
		
		System.out.println("Informe valor2: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("Informe quant2: ");
		double quant2 = sc.nextDouble();
		
		
		
		
		
		
		double valorTotal = (valor1 * quant1 + valor2 * quant2)*(IPI/100 + 1);
		
		System.out.println(valorTotal);
	
		sc.close();
	}
}
