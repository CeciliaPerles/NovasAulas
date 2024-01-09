package com.cecilia.campominado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.cecilia.campominado.Excecao.ExplosaoException;

public class Tabuleiro {
	
	private int quantidadeLinhas;
	private int quantidadeColunas;
	private int quantidadeMinas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int quantidadeLinhas, int quantidadeColunas, int quantidadeMinas) {
		
		this.quantidadeLinhas = quantidadeLinhas;
		this.quantidadeColunas = quantidadeColunas;
		this.quantidadeMinas = quantidadeMinas;
	
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void abrir(int linha, int coluna) {
		
		try {
			campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna()== coluna)
			.findFirst()
			.ifPresent(c -> c.abrir());
		}catch(ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
		
		
	}
	
	public void alterarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna()== coluna)
		.findFirst()
		.ifPresent(c -> c.alterarMarcacao());
	}
	
	private void gerarCampos() {
		for (int linha = 0; linha < quantidadeLinhas; linha++) {
			for (int coluna = 0; coluna < quantidadeColunas; coluna++) {
			campos.add(new Campo(linha,coluna));
			}
		}
	}
	private void associarVizinhos() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
				
	}
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		do {
			
			int aleatorio = (int) (Math.random()* campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
			
		}while(minasArmadas < quantidadeMinas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}
	
	public void reiniciarJogo() {
		campos.stream().forEach(campo -> campo.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		int i = 0;
		for(int l = 0; l < quantidadeLinhas; l++) {
			for (int c = 0; c <quantidadeColunas; c++) {
				
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	};
}
