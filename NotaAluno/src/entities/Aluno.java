package entities;

public class Aluno {
	
	public String nome;
	public int notaUm, notaDois, notaTres;
	public static final int NOTA_CORTE = 60;
	
	public int notaFinal() {
		return notaUm + notaDois + notaTres;
		
	}
	public void imprimirNotaFinal() {
		int notaAluno = notaFinal();
		System.out.println("Nota final: " + notaAluno);
		
	}
	
	public static void agradecer() {
		System.out.println("Obrigado por realizar a prova! A nota de corte foi " + NOTA_CORTE + ".");
		
	}
			
	public void situacao() {
		if (notaFinal()<60) {
			
			System.out.println("Reprovado! Faltam " + (NOTA_CORTE - notaFinal()) + " pontos.");
					
		} else {
			System.out.println("Aprovado!");
		}
	}

}
