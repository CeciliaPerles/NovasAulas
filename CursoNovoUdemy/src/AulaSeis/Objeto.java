package AulaSeis;

public class Objeto {
	String name;
	String email;
	
	public boolean equals(Object obj) {
		Objeto outro = (Objeto) obj;
		
		boolean nomeIgual = outro.name.equals(this.name);
		boolean emailIgual = outro.email.equals(this.email);
		
		return nomeIgual && emailIgual;
		
		
	}
	
}
