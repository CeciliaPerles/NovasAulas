package projetos_aulas_arrays;

import java.io.IOException;

public class HelpJava {

	public static void main(String[] args) throws IOException {
		/*System.out.println("Help on: \n1. if\n2. switch\nChose one:");
		char choise = (char) System.in.read();
		
		switch (choise) {
		case '1': System.out.println("if (condition)\nstatement\nelse statement");
		break;
		
		
		case '2': System.out.println("switch (expression){\ncase constant\nstatement sequence\nbreak\n}");
		break;
		
		default: System.out.println("Invalid!");
		
		}
		
		double num;
		for (num = 100; num > -96; num -=5) {
			
			System.out.println("O numero é " + num);
		}
		int i;
		for (i = 2; i < 10; i++) {
			System.out.println("Pass #" + i);
			}
			
			
		int sum = 0;
		int fact = 1;
		
		for (int i = 1; i<=5; i++) {
			//sum += i;
			fact *= i;
		}
		
		//System.out.println("Sum is: " + sum);
		System.out.println("Fact is: " + fact);
		*/
		
		/*char ch = '0';
		while (ch != 'z') {
			ch++;
			System.out.println("ch = " + ch);
			
		}*/
		
		int potencia;
		int resultado;
		
		
		for (int i = 0; i < 10; i++) {
			resultado = 1;
			potencia = i;
			
		//	for (int j=0; j < i; j++) {	resultado *=2;	}
			
			potencia = 0;
			while (potencia < i) {
				resultado *=2;
				potencia++;
			}
			
			
			
			System.out.println("2 elevado a " + i + " resultado = " + resultado);}
			
			
			
			
		//	for (int i = 0; i < 5; i++) {System.out.println("Murilo");}
				
	}

}
