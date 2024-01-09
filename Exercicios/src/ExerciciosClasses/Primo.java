package ExerciciosClasses;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		int numero = 4;
		
		if (numero % 1 == 0 && numero % numero == 0) {
			System.out.println(numero + " é primo.");
			
		}
		
		sc.close();
	}
	
	
	
	
	
}
