package ExerciciosClasses;

public class Aluno {

	private String matricula;
	private String nome;
	private int notaProvaUm;
	private int notaProvaDois;
	private int notaTrabalho;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNotaProvaUm() {
		return notaProvaUm;
	}
	public void setNotaProvaUm(int notaProvaUm) {
		this.notaProvaUm = notaProvaUm;
	}
	public int getNotaProvaDois() {
		return notaProvaDois;
	}
	public void setNotaProvaDois(int notaProvaDois) {
		this.notaProvaDois = notaProvaDois;
	}
	public int getNotaTrabalho() {
		return notaTrabalho;
	}
	public void setNotaTrabalho(int notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}
	
	public int calcularMediaFinal(int notaProvaUm, int notaProvaDois, int notaTrabalho) {
		int mediaFinal = (int) (notaProvaUm * 4) + (int) (notaProvaDois * 4) + (int) (notaTrabalho * 2)/10;
		return mediaFinal;
		
	}
}
