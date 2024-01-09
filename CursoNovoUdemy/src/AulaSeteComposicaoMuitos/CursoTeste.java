package AulaSeteComposicaoMuitos;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("JS");
		Curso curso3 = new Curso("HTML");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno3);
		curso3.adicionarAluno(aluno1);
		
		aluno1.adicionarCurso(curso2);
		
		for (Aluno aluno : curso3.alunos) {
		System.out.println("Meu nome é " + aluno.nome + " e estou matriculado no curso de " + curso3.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
	}

}
