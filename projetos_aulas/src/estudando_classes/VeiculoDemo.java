package estudando_classes;

public class VeiculoDemo {

	public static void main(String[] args) {

		Veiculo minivan = new Veiculo(7, 16, 21);
				
	/*	minivan.numeroPassageiros = 7;
		minivan.quantidadeCombustivel = 16;
		minivan.milhasPorGalao = 21;*/
		
	//	int calcularAutonomiaMinivan = minivan.calcularAutonomia();
	//	int calcularCombustivelNecessarioMinivan = (int) minivan.calcularCombustivelNecessario(252);
		
		Veiculo carroEsportivo = new Veiculo(2, 14, 12);
		
		/*carroEsportivo.numeroPassageiros = 2;
		carroEsportivo.quantidadeCombustivel = 14;
		carroEsportivo.milhasPorGalao = 12;*/
					
	//	int calcularAutonomiaCarroEsportivo = carroEsportivo.calcularAutonomia();
	//	int calcularCombustivelNecessarioCarroEsportivo = (int) carroEsportivo.calcularCombustivelNecessario(252);
	
		Veiculo palio = new Veiculo(5, 11, 13);
		
	//	int calcularAutonomiaPalio = palio.calcularAutonomia();
	//	int calcularCombustivelNecessarioPalio = (int) palio.calcularCombustivelNecessario(252);
	
		int autonomiaPalio = palio.calcularAutonomia();
		palio.imprimirAutonomia();
		
		
	}
	
	
}
