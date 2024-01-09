package aulaUm;

import java.util.Scanner;

public class EstudandoSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma nota: ");
		int nota = sc.nextInt();
		String conceito = null;
		
		switch(nota) {
		case 10 : case 9 :
			conceito = "A";
			break;
		case 8 : case 7 :
			conceito = "B";
			break;
		case 6 : case 5 :
			conceito = "C";
			break;
		case 4 : case 3 :
			conceito = "D";
			break;
		case 2 : case 1 :
			conceito = "E";
			break;
		default :
			conceito = "Inválido";
		}
		
		System.out.println(conceito);
		
		if (conceito.equals("D") || conceito.contains("E") || nota == 5) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado!");
		}
			
		
		sc.close();
	}

}
