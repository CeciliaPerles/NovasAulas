package aulaUm;

public class Ternario {

	public static void main(String[] args) {

		double nota = 4;
		String resultado = nota >= 7 ? "Aprovado" : "Recuperação";
		String recuperacao = nota >= 5 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultado);
		System.out.println(recuperacao);

	}

}
