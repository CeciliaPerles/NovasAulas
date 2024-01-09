package Exercicios;

import java.util.Scanner;

public class Tentativa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		boolean acertou = false;
		while (acertou == true) {
		int numeroAleatorio = 20;
			
			System.out.print("Escolha um número: ");
			int numeroEscolhido = sc.nextInt();

			if (numeroEscolhido != numeroAleatorio) {
				acertou = false;
				System.out.println("Errou.");
								
				
			} else {
				System.out.print("Acertou.");
				acertou = true;
			
			}
		}

	}

}
