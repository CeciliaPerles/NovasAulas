package estudando_classes;


public class Veiculo {

	int numeroPassageiros;
	int quantidadeCombustivel;
	int milhasPorGalao;
	
				
	public Veiculo(int numeroPassageiros, int quantidadeCombustivel, int milhasPorGalao) {
		this.numeroPassageiros = numeroPassageiros;
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.milhasPorGalao = milhasPorGalao;
	}

	public int calcularAutonomia() {
		int autonomia = quantidadeCombustivel * milhasPorGalao;
				
		return autonomia;
		
	}
	public double calcularCombustivelNecessario(int milhas) {
		double combustivelNecessario = milhas/milhasPorGalao;
				
		return (double)combustivelNecessario;
				};
	
	public void imprimirAutonomia() {
		System.out.println("A autonomia é de " + calcularAutonomia() + ".");
	}
	
	
}
