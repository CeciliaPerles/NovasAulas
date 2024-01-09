package AulaArrays;
import java.util.Scanner;

public class ManipulandoArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas notas deseja informar?");

		int quantidadeNotas = sc.nextInt();
		
		int[] notasAluno = new int[quantidadeNotas];
		int notaTotal = 0;			
		
		for(int i = 0; i < notasAluno.length; i++) {
			
			System.out.print("Digite a nota " + (i+1) + ": ");
			notasAluno[i] = sc.nextInt();
		}
			
				
		for (int nota : notasAluno) {
			notaTotal += nota;
			
		}
		int media = notaTotal / quantidadeNotas;
		System.out.print(media);
		
		
		sc.close();
		}

		

}
