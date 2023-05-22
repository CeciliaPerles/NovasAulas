package projetos_aulas_arrays;

public class FilaForEach {

	public static void main(String[] args) {


		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		for (int x: nums) {
			System.out.println("Valor é = " + x);
			sum += x;
			if (x==5)break;
		}
		
		System.out.println("Soma total = " + sum);
		
	}

}
