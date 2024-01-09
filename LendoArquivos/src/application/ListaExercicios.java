package application;

import java.util.Scanner;

public class ListaExercicios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Leia número A: ");
		int numeroA = sc.nextInt();
		
		System.out.println("Leia número B: ");
		int numeroB = sc.nextInt();
		
		for(int i = numeroA; i < numeroB; i++) {
			if (i % 2 != 0) {
			System.out.println(i);
			}
			
		}
		System.out.println();
		
		sc.close();
	}

}
