package entitities;

import java.util.Arrays;

public class Aluno extends Pessoa{
		
	private String curso;
	private int[] notas;
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int[] getNotas() {
		return notas;
	}
	
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}

	@Override
	public String toString() {
		String s = curso + " ";
		for (int nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	
	
	
	
	
	
	
	
}
