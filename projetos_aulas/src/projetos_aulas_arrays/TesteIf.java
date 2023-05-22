package projetos_aulas_arrays;

import java.io.IOException;
import java.util.Scanner;

public class TesteIf {

	public static void main(String[] args) throws IOException {

		/*int a = 2; 
		int b = 3;
		int c;
		if (a<b) {
			System.out.println("a é menor que b");
		}
		
		c = b - a;
		if (c >= 0) {
			System.out.println("c é positivo");
		} else {
			System.out.println("c é negativo");
		}
		
		double a, b, c;
		
		a = 10;
		b = 5;
		
		if (b != 0) {
			System.out.println("divisor é diferente de 0");
			c = a/b;
			System.out.println("resultado é: " + c);
		} else {
			System.out.println("invalido");
		}*/
		
//		System.out.println("One\nTwo\nTree");

		/*
		
		int a, b, d;
		a=10;
		b=0;
		
		if(b!=0 && (a%b)==0) {
		d = a/b;
		System.out.println("resultado " + d + " e " + b + " is a factor of " + a);
		
		}else {
			System.out.println("não pode dividir");
		}*/
		
		int answer = 'C';
		int digitado = 'C';
		System.out.println("Digite um caracter: ");
		
		digitado = System.in.read();
				
		if(digitado == answer) {
			System.out.println("***Right***");
		}else {
			System.out.println("***Wrong***");
		}
		
		
}
	}