package Exercicios;

import java.util.Scanner;

public class JogodaAdivinhacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 100);
		System.out.println(numeroAleatorio);

		int numeroEscolhido;
		boolean acertou = false;
		int tentativa = 5;

		while (tentativa > 0 ^ acertou == true) {

			if (tentativa == 1) {
				System.out.print("Resta " + tentativa + " tentativa. Escolha um número: ");
				numeroEscolhido = sc.nextInt();
			} else {
				System.out.print("Restam " + tentativa + " tentativas. Escolha um número: ");
				numeroEscolhido = sc.nextInt();
			}

			if (numeroEscolhido != numeroAleatorio) {
				System.out.println("Errou.");
				tentativa--;
				acertou = false;

				if (numeroEscolhido < numeroAleatorio) {
					System.out.println("O número escolhido é menor que o número armazenado.");
				} else {
					System.out.println("O número escolhido é maior que o número armazenado.");
				}

			} else {
				System.out.println("Acertou.");
				acertou = true;
			}
		}

		sc.close();
	}

}
