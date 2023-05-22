package projetos_aulas_arrays;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			/*int numeroEscolhido = sc.nextInt();
			int numerosPares = 0;
			int numerosImpares = 0;
			
			while(numerosImpares <numeroEscolhido) {
				numerosImpares++;
				if (numerosImpares%2==0)
				System.out.println(numerosImpares);
				
					}
			while(numerosPares <numeroEscolhido) {
				numerosPares++;
				if (numerosPares%2!=0)
				System.out.println(numerosPares);
				
					}*/
			
			System.out.println("Digite o caracter correto: ");
			Boolean continuar = true;
			char charDigitado = sc.next().charAt(0);;
			char charEscolhido = 'j';
			while(charEscolhido !='j') {
			
				
				 while(continuar){
			            System.out.println("Você está na matrix;");
			            System.out.print("Digite o caractere especial para sair da matrix: ");
			            charEscolhido = sc.next().charAt(0);
			           
			            if(charDigitado=='j'){
			                continuar=false;
			                System.out.println("Parabéns! Você conseguiu sair da Matrix!");
			            }
			            else{
			                System.out.println("Você não está autorizado a sair da Matrix. Estude Java.");
			            };
			}
		
			sc.close();

	}

	}}
