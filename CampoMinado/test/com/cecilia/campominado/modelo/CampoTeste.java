package com.cecilia.campominado.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void inicarCampo(){
		campo = new Campo (0,3);
	}
	
	@Test
	void testeVizinhoReal() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertFalse(resultado);
	}
	
	@Test
	void testeValorAtribuidoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlterarMarcacao() {
		campo.alterarMarcacao();
		assertTrue(campo.isMarcado());
	}
}
