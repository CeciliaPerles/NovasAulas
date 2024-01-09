package AulaSeis;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<String> alunos = new ArrayList<String>();
		alunos.add("Maria");
		alunos.add("Joana");
		alunos.add("Cida");
		
		
//		for (String aluno : alunos) {
//			System.out.println("Meu nome é " + aluno + ".");
//		}
		
		alunos.remove(1);
		for (String aluno : alunos) {
			System.out.println("Meu nome é " + aluno + ".");
		}
	}

}
