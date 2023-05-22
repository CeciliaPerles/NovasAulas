package Desafios;

import java.util.Scanner;

public class WhileEstudo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nota = 0;
		int total = 0;
		int quantidadeNotas = 0;

		while (nota != -1) {

			System.out.println("Digite a nota ou -1 para sair: ");
			nota = sc.nextInt();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				quantidadeNotas++;
			} else if (nota != -1){
				System.out.println("Informe nota válida");
			}

		}
		float media = total / quantidadeNotas;

		System.out.println(total + " e " + quantidadeNotas + " e " + media);

		sc.close();
	}

}
