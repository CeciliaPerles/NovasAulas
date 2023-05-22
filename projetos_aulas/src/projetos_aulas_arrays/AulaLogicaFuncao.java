package projetos_aulas_arrays;

import java.util.Scanner;

public class AulaLogicaFuncao {
	
	
	public static String verifica(String resultado) {
		
		
		return resultado;
	}
	
	
	
	public static void verificaSePar(int numero) {
		
				
		if (numero % 2 ==0) {
			System.out.println("Número é par.");
		} else {
			System.out.println("Número é ímpar.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numeroDigitado = sc.nextInt();
				
		verificaSePar(numeroDigitado);
		
		sc.close();
	}

}
