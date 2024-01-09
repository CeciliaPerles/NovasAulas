package com.cecilia.campominado;

import com.cecilia.campominado.Visao.TabuleiroConsole;
import com.cecilia.campominado.modelo.Tabuleiro;

public class Application {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		
		new TabuleiroConsole(tabuleiro);
		
		
	}

}
