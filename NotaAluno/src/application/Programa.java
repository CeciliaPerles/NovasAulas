package application;

import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {

		Aluno alunoUm = new Aluno();
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o nome do aluno: ");
		alunoUm.nome = sc.next();
		System.out.println("Digite as notas: ");
		alunoUm.notaUm = sc.nextInt();
		alunoUm.notaDois = sc.nextInt();
		alunoUm.notaTres = sc.nextInt();
		
		alunoUm.imprimirNotaFinal();
		Aluno.agradecer(); //chamar pela classe o método estático (Aluno) e não pelo objeto (alunoUm)
		alunoUm.situacao();
		
				
		sc.close();
	}

}
