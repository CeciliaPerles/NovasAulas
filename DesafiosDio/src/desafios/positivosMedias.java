package desafios;

import java.util.Scanner;

public class positivosMedias {

	public static void main(String[] args) {
		
		System.out.println("Quantos números?");
		
		Scanner sc = new Scanner(System.in);
		
		int numeroEntrada = sc.nextInt();
		int numeroPositivo = 0;
		double mediaPositivos = 0;
				
		for (int i=0; i<numeroEntrada; i++) {
			System.out.print("Número " + (i+1) + ": " );
				double novaEntrada = sc.nextInt();
				
				if (novaEntrada > 0) {
					numeroPositivo++;
				
				}
				
				}
			System.out.print("Números positivos: " + numeroPositivo);
			
			for (int i=0; i<numeroEntrada; i++) {
				System.out.print("Número " + (i+1) + ": " );
					double novaEntrada = sc.nextInt();
					
					if (novaEntrada > 0) {
						numeroPositivo++;
					
					}
					
					}
			
			System.out.println();
		
	}
		
		
		
		
	

}
