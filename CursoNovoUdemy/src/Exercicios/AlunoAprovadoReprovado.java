package Exercicios;

import java.util.Scanner;

public class AlunoAprovadoReprovado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean continua = true;

		while (continua) {

			System.out.println("Digite uma nota: ");
			double notaDigitada = sc.nextDouble();

			if (notaDigitada >= 0 && notaDigitada <= 10) {
				continua = false;
				if (notaDigitada >= 7) {
					System.out.println("Aprovado!");
					
				} else if (notaDigitada < 7 && notaDigitada >= 4) {
					System.out.println("Recuperação!");
					
				} else {
					System.out.println("Reprovado!");			
				}

			}
		}
		sc.close();
	}

}
