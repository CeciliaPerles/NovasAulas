package projetos_aulas_arrays;

import java.util.Scanner;

public class AulaLogica {

	public static void main(String[] args) {

		
		/*String listaDeAlunos[] = {"Maria", "João"};
		
		listaDeAlunos[0]= "Pedro";
		int quantidadeDeAlunos = listaDeAlunos.length;
		int ultimoAluno = listaDeAlunos.length - 1;

				
		for (int i = 0; i< listaDeAlunos.length; i++) {
			System.out.println(listaDeAlunos[i]);
			
		}
		
		
		
		System.out.println(listaDeAlunos[0]);
		System.out.println(quantidadeDeAlunos);
		System.out.println(ultimoAluno);
		System.out.println(listaDeAlunos[ultimoAluno]);*/
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Qual a nota final?");
		int notaFinal = sc.nextInt();
		
		/*if (notaFinal >= 6) {
			System.out.println("Aprovado!");
		} 
		else if (notaFinal >= 3) {
			System.out.println("Recuperação.");
		}
		else {
			System.out.println("Reprovado.");
		}	*/
		
		switch (notaFinal) {
		case 0:
			System.out.println("Estou aqui caso precise de ajuda.");
		break;

		case 5:
			System.out.println("Essa foi por pouco.");
		break;

		case 10:
			System.out.println("Aluno exemplar!");
		break;

		default:
			System.out.println("Nada a declarar...");

		}
		
		
		sc.close();
	}

}
