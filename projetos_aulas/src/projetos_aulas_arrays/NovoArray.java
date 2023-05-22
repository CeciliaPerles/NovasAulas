package projetos_aulas_arrays;

public class NovoArray {

	static boolean osArraysSaoIguais(int[] vetorA, int[] vetorB) {
		boolean existeCorrespondente = false;
		for (int i = 0; i < vetorA.length; i++) {
			existeCorrespondente = false;
			for (int j = 0; j < vetorB.length; j++) {

				if (vetorA[i] == vetorB[j]) {
					existeCorrespondente = true;
				}
				
			}
			if(existeCorrespondente == false) {
				break;
			}

		}

		return existeCorrespondente;

	}

	public static void main(String[] args) {

		int[] vetorUm = { 2, 8, 5 };
		int[] vetorDois = { 2, 5, 8 };

		ManipulandoArrays.imprimirArray(vetorUm);
		System.out.println("\n");
		ManipulandoArrays.imprimirArray(vetorDois);
		
		boolean retorno = osArraysSaoIguais(vetorUm, vetorDois);
		System.out.println("\n" + retorno);

	}

}
