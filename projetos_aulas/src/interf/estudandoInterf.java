package interf;

import java.util.Scanner;

public class estudandoInterf {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int num;
		int maiorNum = 0;
		int soma = 0;
		int count = 0;
		
		do {System.out.println("Num: ");
		num = sc.nextInt();
		
		soma = soma + num;
		
		
		if(num > maiorNum) {
			maiorNum=num;
		}
		
		
		
		count++;
				
			}while(count < 5);
	
		System.out.println("Maior num: " + maiorNum);
		System.out.println("Soma: " + soma);
}
}