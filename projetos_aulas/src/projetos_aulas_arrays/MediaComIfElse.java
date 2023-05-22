package projetos_aulas_arrays;

import java.io.InputStream;
import java.util.Scanner;

public class MediaComIfElse {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua nota: (0-10)");
		int nota = sc.nextInt();
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota inválida!");
		} else {
			if (nota < 7) {
				System.out.println("Reprovado!");
			}else {
				System.out.println("Aprovado!");
			}
		}*/

				
				
				
	//	sc.close();
		
	/*	int inicial = 1;
		int razao = 3;
		int termo = inicial;
		int valorMax=20;
		
		System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, valorMax );
        while(termo<=valorMax){
            System.out.println(termo);
            termo += razao;*/
            
        int inicialP =1;
        int razaoP = 2;
        int termoP = inicialP;
        int valorMaxP = 32;
            
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicialP, razaoP, valorMaxP );
        while(termoP<=valorMaxP){
            System.out.println(termoP);
            termoP *= razaoP;  
            
            
		}
	}
	
}


