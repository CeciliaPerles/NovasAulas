package projetos_aulas_arrays;

import java.io.IOException;

public class Fatorial {

	public static void main(String[] args) throws IOException {


		/*for (int i=2; i<=100; i++) {
			System.out.println("Fatorial de " + i + ": ");
			for (int j=2; j<i; j++)
				if((i%j)==0) System.out.println(j + " ");
			System.out.println();
		}

		for (int i=1000; i>=0; i=i-2) {
			System.out.println(i);
		}*/
		
		
		char caracter;
		int numeroCaracteres = 0;
		int numeroEspacos = 0;
		
		System.out.println("Digite um .(ponto) para parar:");
		
		do {
			caracter =(char)System.in.read();
			if (caracter >= 'a' && caracter <= 'z') numeroCaracteres++;
			if (caracter == ' ') numeroEspacos++;
		
		
		}while(caracter!='.' && caracter!='!' && caracter!='?');
		System.out.println("Número caracteres = " + numeroCaracteres + " e número de espaços = " + numeroEspacos);
	}

}
