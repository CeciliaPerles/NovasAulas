package AulaSeteComposicao;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c = new Carro();
		
		System.out.println(c.estaLigado());
		
		c.ligar();
		
		System.out.println(c.estaLigado());

	}

}
