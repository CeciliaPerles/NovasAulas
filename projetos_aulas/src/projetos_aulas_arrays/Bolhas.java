package projetos_aulas_arrays;

public class Bolhas {

	public static void main(String[] args) {
		
		int nums[]= {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t;
		int size;
		size=10;
		
		System.out.print("Array original:");
		for (int i = 0; i< size; i++) 
			System.out.print(" " + nums[i]);
		
		
		for (a=1; a<size; a++) 
			for (b=size-1; b >=a; b--) {
				if (nums[b-1]>nums[b]) {
					t= nums[b-1];
					nums[b-1]=nums[b];
					nums[b]=t;
				
			}
		}
			System.out.print("\nArray ordenado:");
			for (int i = 0; i< size; i++) 
				System.out.print(" " + nums[i]);
		
			
		}
	}
