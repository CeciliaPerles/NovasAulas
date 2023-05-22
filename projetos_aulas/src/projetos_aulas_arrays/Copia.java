package projetos_aulas_arrays;

import java.util.Scanner;

public class Copia {

	public static void main(String[] args) {

		 boolean continuar = true;
	        String opcao;
	        Scanner entrada = new Scanner(System.in);
	       
	        while(continuar){
	            System.out.println("Você está na matrix;");
	            System.out.print("Digite o caractere especial para sair da matrix: ");
	            opcao = entrada.nextLine();
	           
	            if(opcao.equals("murilo")){
	            	continuar=false;
	                System.out.println("Parabéns! Você conseguiu sair da Matrix!");
	            }
	            else{
	                System.out.println("Você não está autorizado a sair da Matrix. Estude Java.");
	            };
	        }

	}

}
