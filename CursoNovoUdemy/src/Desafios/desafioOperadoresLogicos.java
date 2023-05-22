package Desafios;

public class desafioOperadoresLogicos {

	public static void main(String[] args) {
		
		
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		System.out.println(tv50);
		
		boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
		System.out.println(tv32);
		
		boolean sorvete = trabalhoTerca || trabalhoQuinta;
		System.out.println(sorvete);
		
		boolean casa = !sorvete;
		System.out.println(casa);
		
		
	}

}
