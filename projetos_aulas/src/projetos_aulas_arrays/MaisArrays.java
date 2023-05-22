package projetos_aulas_arrays;

import java.util.Scanner;

public class MaisArrays {

	public static void main(String[] args) {
		
		Scanner scRendas = new Scanner(System.in);
		
		System.out.println("Digite o número de famílias:");
		
		int numeroDeFamilias = scRendas.nextInt();
		
		int[] rendas = new int[numeroDeFamilias];
				
		for (int i = 0; i<numeroDeFamilias;i++) {
			System.out.println("Digite a renda da " + (i+1) + "ª família: ");
			rendas[i] = scRendas.nextInt();
		}
			
		int rendaTotalFamilias = 0;
		for (int i = 0; i<numeroDeFamilias;i++) {
			rendaTotalFamilias = rendaTotalFamilias + rendas[i];
		}
		
		int mediaRendaFamilias = rendaTotalFamilias /rendas.length;
		System.out.println("Renda total das famílias: " + rendaTotalFamilias +"."+
				"\nRenda média das famílias: " + mediaRendaFamilias +".");
		
		int menorRenda, maiorRenda;
		menorRenda = maiorRenda = rendas[0];
		
		for (int i = 0; i<numeroDeFamilias;i++) {
			if (rendas[i] < menorRenda) menorRenda = rendas[i];
			if (rendas[i] > maiorRenda) maiorRenda = rendas[i];
		}
		
		System.out.println("Maior renda: " + maiorRenda +"."+
				"\nMenor renda: " + menorRenda +".");
		
		int a, b, t;
		
		System.out.print("Médias:");
		for (int i = 0; i<numeroDeFamilias;i++)
			System.out.print(" " + rendas[i]);
		System.out.print(".");
		
		for (a=1; a<numeroDeFamilias; a++) 
			for (b = numeroDeFamilias-1; b >= a; b--) {
				if (rendas[b-1] > rendas[b]) {
					t= rendas[b-1];
					rendas[b-1]=rendas[b];
					rendas[b]=t;
				
			}
		}
			System.out.print("\nRendas ordenadas:");
			for (int i = 0; i< numeroDeFamilias; i++) 
				System.out.print(" " + rendas[i]);
			System.out.print(".");
		
		
		
		

		scRendas.close();
		}
		
	}


