package Exercicios;

import java.util.Scanner;

public class NumeroPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numero = sc.nextInt();
		
		if (numero >=0 && numero <= 10) {
			if (numero % 2 == 0) {
			System.out.println("O número " + numero + " está entre 0 e 10 e é par.");
			}
			else {
			System.out.println("O número " + numero + " está entre 0 e 10 e é ímpar.");
			}
		} else {
			System.out.println("O número " + numero + " não está entre 0 e 10.");
		}
		
		
		
		sc.close();

	}

}
