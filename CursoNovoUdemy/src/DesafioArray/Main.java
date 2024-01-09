package DesafioArray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos?");
		int quantidadeAlunos = sc.nextInt();
		
		System.out.println("Quantas notas cada?");
		int quantidadeNotas = sc.nextInt();
		
		double[][] notasTurma = new double[quantidadeAlunos][quantidadeNotas];
			
		double total = 0;
		for(int aluno = 0; aluno < notasTurma.length; aluno++) {
			for (int nota = 0; nota < notasTurma[aluno].length;nota++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (nota + 1), (aluno+1));
				notasTurma[aluno][nota]=sc.nextDouble();
				total += notasTurma[aluno][nota];
			}
		}
				
				
		double media = total / (quantidadeAlunos * quantidadeNotas);
		System.out.printf("A média da turma é: " + media);
		sc.close();
	}

}
