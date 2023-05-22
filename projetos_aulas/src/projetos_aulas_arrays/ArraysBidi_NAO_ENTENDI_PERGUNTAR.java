package projetos_aulas_arrays;

public class ArraysBidi_NAO_ENTENDI_PERGUNTAR {

	public static void main(String[] args) {
		
		int raizQuadrada[][] = {
						
				{1,1},
				{2,4},
				{3,9},
				{4,16},
				{5,25},
				{6,36},
				{7,49},
				{8,64},
				
				
		};
		
		int i, j;
		for (i=0; i<8;i++) {
			for (j=0; j<2; j++)
				System.out.println(raizQuadrada[i][j]);
			System.out.println();
		}
	}

}
