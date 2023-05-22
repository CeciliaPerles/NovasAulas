package estudando_classes;

import java.util.Scanner;

public class Natal {

	public static void main(String[] args) {
		System.out.print("Oi, Murilo! Feliz Natal!\n\n"
				+ "Nem todos os presentes podem ser criativos. Isso tiraria a mágica dos realmente bons.\n"
				+ "Alguns são apenas presentes. Como este.\n"
				+ "Sim, eu queria ter feito um programa mais legal, mas foi o que consegui.\n"
				+ "Maybe next year!\n\n"
				
				+ "Para o primeiro presente, aqui vão algumas dicas:\n"
				+ "1. Não vai ser a primeira vez que você ganha!\n"
				+ "2. Mas eu espero que dessa vez dure...\n"
				+ "3. É um acessório pra ficar bonito :)\n\n"
				+ "Vamos lá. "
				);
		
		Boolean auxiliar = true;
		String presenteCerto;
		Scanner sc = new Scanner(System.in);

		while(auxiliar){
            
            System.out.print("Digite o presente: ");
            presenteCerto = sc.next();
           
            if(presenteCerto.equals("pulseira")){
                auxiliar=false;
                System.out.println("\nEssa foi fácil!");
            }
            else{
                System.out.println("\nEssa estava fácil demais para errar, hein... Tenta de novo aí:");
            };
        }
		System.out.println("\n~Sim, aquele '.equals' me salvou hehe~\n\n"
				+ "Vamos para o próximo!\n"
				+ "Para receber o próximo presente, lembra do seu castelo e daquela data importante (neste formato: ddmm).\n"
				);

		
		Boolean auxiliarDois = true;
		java.lang.String dataCerta;
		
		while(auxiliarDois){
            
            System.out.print("Digita ela aqui: ");
            dataCerta = sc.next();
           
            if(dataCerta.equals("0511")){
                auxiliarDois=false;
                System.out.println("\nSimmm! Que data mais que especial! <3\n"
                		+ "Seu segundo presente é um livro! Você também já ganhou livros.\n"
                		+ "Mas esse é de uma página que você ama: O Grande Panda e o Pequeno Dragão!!!\n \n");
            }
            else{
                System.out.println("\nVocê esqueceu? Os Power Rangers nas Torres Gêmeas. Go go:");
            };
        }
 
		System.out.println("Já o último presente não tem nenhuma validação.\n"
				+ "É mais pra te lembrar que você pode continuar andando sempre cheiroso.\n"
				+ "Pois se o perfume acabar, te dou outro.\n"
				+ "Prometo um amor desse jeitinho aqui ó: (digita 0).");
		
		int auxiliarTres = sc.nextInt();
        while(auxiliarTres == 0){
       		while (true)
	            System.out.println("Infinito! ");
	        }
		
		

		sc.close();

	}

}
