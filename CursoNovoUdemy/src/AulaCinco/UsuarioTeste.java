package AulaCinco;

public class UsuarioTeste {

	public static void main(String[] args) {

		Usuario u1 = new Usuario("Murilo");
		Usuario u2 = u1;
		
		u2.setName("Cecília");

		System.out.println(u1.getName());

	}

}
