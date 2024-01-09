package application;
import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do funcionário: ");
		String nomeFuncionario = sc.next();

		System.out.print("Salário funcionário: ");
		double salarioFuncionario = sc.nextDouble();
	
		double novoSalario = 0;
		
		if (salarioFuncionario <= 150) {
			novoSalario = salarioFuncionario * 1.25;
		}
		else if (salarioFuncionario > 150 && salarioFuncionario <= 300) {
			novoSalario = salarioFuncionario * 1.2;
		}
		else if (salarioFuncionario > 300 && salarioFuncionario <= 600) {
			novoSalario = salarioFuncionario * 1.15;
		}
		else {
			novoSalario = salarioFuncionario * 1.1;
		}
		
		System.out.println("O nome do funcionário é " + nomeFuncionario + ", seu antigo salário era de " + salarioFuncionario
				+ " e seu novo salário é de " + novoSalario + ".");
		
		sc.close();
	}

}
