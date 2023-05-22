package projetos_aulas_arrays;

import java.util.Scanner;

public class MediaComWhile {

	public static void main(String[] args) {
		
		System.out.println("Quantos alunos?");
		Scanner sc = new Scanner(System.in);
		
		int numeroDeAlunos = sc.nextInt();
		int[] notas = new int [numeroDeAlunos];
		int i=0;
		
		while (i < numeroDeAlunos) {
			System.out.println("Digite a " + (i+1) + "ª nota: ");
			notas[i] = sc.nextInt();
			i++;
		}
		
		int soma = 0;
		i=0;
		while (i < numeroDeAlunos) {
			soma = soma + notas[i];
			i++;
		}
		
		int media = soma/numeroDeAlunos;
		System.out.println("Média = " + media + ".");
		sc.close();
	}

}
