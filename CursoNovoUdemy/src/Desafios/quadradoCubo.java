package Desafios;

import java.util.Scanner;

public class quadradoCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ler número: ");
		int numUm = sc.nextInt();
				
		int quadrado = (int) Math.pow(numUm, 2);
		int cubo = (int) Math.pow(numUm, 3);
		
		System.out.printf("Número = %d \n"
				+ "Quadrado = %d \n"
				+ "Cubo = %d", numUm, quadrado, cubo);


		
		sc.close();

	}

}
