package Exercicios;

import java.util.Scanner;

public class ImprimirLetras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavraDigitada = sc.next();
		
		for (int i = 0; i < palavraDigitada.length(); i++) {
			
			System.out.println(palavraDigitada.charAt(i));
		}
		
		sc.close();
	}

}
