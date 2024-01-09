package AulaNove;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import AulaArrays.Aluno;

public class Reduce2 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 8.1);
		Aluno a2 = new Aluno("Gui", 6.1);
		Aluno a3 = new Aluno("Isa", 9.1);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3);
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Function<Aluno, Double> apenasNota = aluno -> aluno.nota;
		BinaryOperator<Double> somatorio = (acumulador, b) -> acumulador + b;
		
		alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(somatorio).ifPresent(System.out::print);
		
	}

}
