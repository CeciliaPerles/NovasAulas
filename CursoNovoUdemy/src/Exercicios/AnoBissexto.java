package Exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int anoDigitado = sc.nextInt();
		
		if (anoDigitado % 4 == 0) {
			
			System.out.println("O ano de " + anoDigitado + " é bissexto.");
			
		} else {
			System.out.println("O ano de " + anoDigitado + " não é bissexto.");
		}
		
		
		
		sc.close();

	}

}
