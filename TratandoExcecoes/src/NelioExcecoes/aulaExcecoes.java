package NelioExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class aulaExcecoes {

	public static void main(String[] args) {
		
		method2();
		System.out.println("Fim programa.");
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Começo programa.");
		try {String vetor[] = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vetor[(position)]);
		
		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Número inválido");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada");
			
		}
	
	sc.close();
	System.out.println("Fim método.");
	}
}
