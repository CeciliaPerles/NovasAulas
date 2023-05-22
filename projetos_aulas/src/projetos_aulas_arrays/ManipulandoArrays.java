package projetos_aulas_arrays;

public class ManipulandoArrays {
	
	static void imprimirArray(int[] vetor) {
		for (int i=0; i< vetor.length; i++) {
		System.out.println(vetor[i]);
		}
	}
	
	static void imprimirMaiorNumero(int[] vetor) {
		int maiorValor = 0;
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] > maiorValor) {
				maiorValor = vetor[i];
			}
			
		}
		System.out.println("\n");
		System.out.println("Maior Valor: " + maiorValor);
	}
	
	static int quantidadeNumerosPares(int[]vetor) {
		int numerosPares = 0;
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] % 2 ==0) {
				numerosPares++;
			}
		}
		
		return numerosPares;
		
	}
	
	/*static void imprimirMaiorNumeroArray(int[] vetor, int tamanho) {
		
		for (int i=0; i<tamanho; i++) {


			
		System.out.println(vetor[i]);
		}
	}
	
	
	
	
	
	static void imprimirMaisArray(double[] vetor, int tamanho) {
		for (int i=0; i<tamanho; i++) {
		System.out.printf("%.2f \n", vetor[i]);
		}
	}
	
	static int[] criarVetor(int tamanho){
		
		int[] vect = new int[tamanho];
		for (int i=0; i<tamanho; i++) {
			vect[i]=i;
		}
		
		return vect;
	}*/
	
	
	static int[] criarVetorAleatorio(int tamanho) {
		int[] vect = new int[tamanho];
		for (int i=0; i<tamanho; i++) {
			vect[i]=(int) (Math.random()*100);
		}		
		
		return vect;
		
	}
	
	/*static double[] criarMaisVetorAleatorio(int tamanho) {
		double[] vect = new double[tamanho];
		for (int i=0; i<tamanho; i++) {
			vect[i]=Math.random();
		}		
		
		return vect;
		
	}*/
	
	public static void main(String[] args) {
		
		int n = 10;
		
		/*
		int[] numeros = new int[n];
		
		for (int i=0; i<n; i++) {
			numeros[i]=i;
		}*/
		
		/*int[] numeros = criarVetor(n);
				
		imprimirArray(numeros, n);
		
		System.out.println("\n");
		
		double[] maisNovoNumeros = criarMaisVetorAleatorio(n);
		
		imprimirMaisArray(maisNovoNumeros, n);
		*
		*
		*/
		
		int[] novosNumeros = criarVetorAleatorio(n);
		
		imprimirArray(novosNumeros);
		
		imprimirMaiorNumero(novosNumeros);
		
		int retornoNumerosPares = quantidadeNumerosPares(novosNumeros);
		
		System.out.println("\n");
		System.out.println("Quantidade números pares: " + retornoNumerosPares);		
		
	
	}

}
