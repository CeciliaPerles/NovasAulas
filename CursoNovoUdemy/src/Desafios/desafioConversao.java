package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class desafioConversao {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seus três últimos salários:");
		
		String salarioUm = sc.next().replace(",", ".");
		
		String salarioDois = sc.next().replace(",", ".");
		
		String salarioTres = sc.next().replace(",", ".");
		
		double valorUm = Double.parseDouble(salarioUm);
		double valorDois = Double.parseDouble(salarioDois);
		double valorTres = Double.parseDouble(salarioTres);
				
		double media = (valorUm + valorDois + valorTres)/3;
		
		System.out.println("Média:" + media);
		/*for(int contador = 0; contador <3; contador++) {
			salarioUm = sc.nextLine();
		}*/
			
		
		
		sc.close();
			
		
	}

}
