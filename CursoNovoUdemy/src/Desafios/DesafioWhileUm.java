package Desafios;

import java.util.Scanner;

public class DesafioWhileUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite:");
		
		String digitada = "";
		
		
		while(!digitada.equalsIgnoreCase("sair")) {
			System.out.println("vc diz:");
			digitada = sc.nextLine();
			}
		
		
		
		sc.close();
	}

}
