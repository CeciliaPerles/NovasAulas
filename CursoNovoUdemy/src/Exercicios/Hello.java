package Exercicios;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//			
//		int somaNumeros = 0;
//		System.out.print("Quantos números irá digitar? ");
//		int numeros = sc.nextInt();
//		
//		for (int i = 1; i <=numeros; i++) {
//			System.out.print("Digite o número " + i + ": ");
//			int numero = sc.nextInt();
//			somaNumeros+=numero;
//					
//		}
//		System.out.print("A soma é de " + somaNumeros + ".");
				
////	Scanner sc = new Scanner(System.in);
//		System.out.print("Digite um número: ");
//		int numero = sc.nextInt();
//		
//		System.out.print("O antecessor de " + numero + " é " + (numero - 1) + " e o sucessor de " + numero + " é " + (numero + 1) + ".");
//		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		
		System.out.printf("O dobro de " + (int) numero + " é " + (int) (numero * 2) + " e a terça parte"
				+ " de " + (int) numero + " é " + (numero / 3) + ".");
	}

}
