package Exercicios;

import java.util.Scanner;

public class SomarNumerosPositivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;
		int somaDosNumeros = 0;
		do {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();

			if (numero > 0) {

				somaDosNumeros += numero;
			}
		} while (numero > 0);
		
		System.out.println("A soma dos números é = " + somaDosNumeros);
		sc.close();
	}

}
