package Exercicios;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maiorNumero = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Escreva um número: ");
			int numero = sc.nextInt();
			if (maiorNumero < numero) {
				maiorNumero = numero;
			}
		}
		System.out.println("O maior número é: " + maiorNumero + ".");

	}

}
