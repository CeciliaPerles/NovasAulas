package AulaSeis;

import java.util.HashSet;

import AulaCinco.Usuario;

public class Hash {

	public static void main(String[] args) {

		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Cecília"));
		usuarios.add(new Usuario("Murilo"));
		usuarios.add(new Usuario("Ana"));

		
		boolean resultado = usuarios.contains(new Usuario("Ana"));
		System.out.println(resultado);
		
	}

}
