package AulaNove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

import AulaArrays.Aluno;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gui", 6.1);
		Aluno a3 = new Aluno("Isa", 6.1);
		
//		Aluno[] lista = new Aluno[3];
//		lista[0] = a1;
//		lista[0] = a2;
//		lista[0] = a3;
		
					
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3); // como usamos a classe Arrays com u mmetodo utilitario, 
		//ele cria um array[] por baixo dos panos que tem tamanho fixo. mas os valores nas posicoes já existentes podem ser mudados.
		
		List<Aluno> alunos2 = List.of(a1,a2,a3); // Essa list é um ArrayList por baixo mas é IMUTTABLE, nao muda de tamanho e os valores nas posicoes também não
		
		
		List<Aluno> alunos3 = new ArrayList(Arrays.asList(a1, a2, a3));
		
		
		try {
			alunos.set(0, a1); // Sem erro, apesar de não poder mudar de tamanho por ser um Array por baixo, ele pode ter as posições alteradas.
			
			alunos.add(a3); // COM ERRO, array não pode ter o tamanho alterado, adicionar uma posicao quebra.
		} catch(Exception ex) {
			System.out.println("Erro tentando aumentar o tamanho de um array");
		}
		
		try {
			alunos2.set(0, a3); // COM ERRO, usando o List.of() nos dá um IMMUTABLE arraylist, não pode ter valores nem tamanho alterado.
		} catch(Exception ex) {
			System.out.println("Erro tentando aumentar o tamanho de um arraylist criado pelo List.of()");
		}
		
		try {
			alunos3.add(a3);   // Sem erro, usando new arrayList() passando uma outra lista(mesmo que ela sendo unmodifiable
			alunos3.set(0, a3); // é gerada uma nova arraylist com o new, ou seja, uma array list normal com os valores da arraylist que voce passaou
		} catch(Exception ex) {
			//Sem erros nesse cenário
		}
		
		
		
		
		Predicate<Aluno> aprovado = aluno -> {
			return aluno.nota >= 7;
					};
		
//		Function<Integer, Integer> fx = (x) -> 2 * x;
//		
//		fx(2); // tem que retornar o 4.
		
		Function<Aluno, String> nomes = (Aluno aluno) -> {
			String nome = aluno.nome;
			return nome;
		};
		

		System.out.println("Nenhum aluno aprovado: " + alunos.stream().noneMatch(aprovado));
		
		List<Aluno> alunosAprovados = alunos.stream().filter(aprovado).toList();
		
		String aprovados = "";
		
//		List<String> nomesAprovados =alunosAprovados.stream().map(nomes).toList();
		
		BinaryOperator<String> nomesConcatenados = (nomesLista, nome) -> {
			nomesLista+=nome;
			return nomesLista;
		};
		
		aprovados = alunosAprovados.stream().map(nomes).reduce("", nomesConcatenados);
		
		
		
//		for(Aluno aluno : alunosAprovados) {
//			aprovados+=aluno.nome+" - ";
//		}
		
		
		System.out.println("Alunos aprovados: "+ aprovados);
		
		
	}

}
