package projetos_aulas_arrays;

import java.util.Scanner;

public class ArrayFor {

	static void imprimirArray(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

	/*private static int quantidadePares (int[] vetor) {
		int quantidadeNumerosPares = 0;
		for (int i = 0; i < vetor.length; i++) {
		if (vetor[i] % 2 == 0) {
			quantidadeNumerosPares++;
		}
		}
		
		return quantidadeNumerosPares;
	}

	static void imprimirPares(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
			}
		}
	}*/
	
	static void substituir(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 3 == 0) {
				vetor[i]= vetor[i] + 1;
				System.out.println(vetor[i]);
			}
		}
	}
	
	private static int[] criarArray(int tamanho) {

		int[] vect = new int[tamanho];
		int i = 0;
		while (i < vect.length) {
			vect[i] = (int) (Math.random() * 100);
			i++;
		}
		;
		return vect;
	}
	
	public static void main(String[] args) {

		System.out.println("Digite o tamanho do vetor:");
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		int[] meuVetor;
		int meusPares;
		
		meuVetor = criarArray(tamanho);
		System.out.println("\nTodos os números: ");
		imprimirArray(meuVetor);
		/*System.out.println("\nApenas os pares: ");
		imprimirPares(meuVetor);
		meusPares = quantidadePares(meuVetor);
		System.out.println("\nQuantidade números pares: " + meusPares);*/
		System.out.println("\nSubstituído: ");
		substituir(meuVetor);
		
		
		sc.close();
		
		

	}

}
