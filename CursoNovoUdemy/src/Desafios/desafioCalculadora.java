package Desafios;

import java.util.Scanner;

public class desafioCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ler número 1: ");
		int numUm = sc.nextInt();
		System.out.print("Ler número 2: ");
		int numDois = sc.nextInt();
		System.out.print("Qual operação? ");
		String operacao = sc.next();
		
		int resultado = "+".equals(operacao) ? numUm + numDois : 0;
		resultado = "-".equals(operacao)? numUm - numDois : resultado;
		resultado = "*".equals(operacao)? numUm * numDois : resultado;
		resultado = "/".equals(operacao)? numUm / numDois : resultado;
		resultado = "%".equals(operacao)? numUm % numDois : resultado;
		
		System.out.printf("%d %s %d = %d", numUm, operacao, numDois, resultado);	
		sc.close();
	}

}
