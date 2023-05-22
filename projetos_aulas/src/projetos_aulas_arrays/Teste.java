package projetos_aulas_arrays;

public class Teste {

	public static void main(String[] args) {
		double pés = 12;
		double polegadas;
		double metros;
				
		int contadorDeLinhas = 0;
		
		for (pés = 1; pés <=100; pés++){
			polegadas = pés * 12;
			metros = polegadas / 39.37;
			
			
			System.out.println("O numero de pés é: " + pés + ", o numero de polegadas é: " + polegadas + 
					"o numero de metros é: " + metros
					
					);
			
			contadorDeLinhas++;
			if (contadorDeLinhas == 12){
			System.out.println();
			contadorDeLinhas = 0;
			}
		}
		
		
		
		
		

	}

}
