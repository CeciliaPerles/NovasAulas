package application;

import java.util.Scanner;

import entities.CurrencyConverter;

public class Conversor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("cotação dólar: ");
		double valor = sc.nextDouble();
		
		System.out.println("quantos dólares: ");
		double valorComprado = sc.nextDouble();

		System.out.println("valor total: " + CurrencyConverter.total(valor, valorComprado));
		System.out.println("valor total: " + CurrencyConverter.calcularIof(valor, valorComprado));
		
		sc.close();

	}

}
