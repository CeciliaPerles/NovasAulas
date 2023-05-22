package application;

import java.util.Scanner;

import entities.Conta;
import entities.ContaEmpresa;
import entities.Poupanca;

public class Program {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		Conta conta = null;
		
		System.out.println("Digite número da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Digite nome do titular da conta: ");
		String nomeTitular = sc.next();
		
		System.out.println("Deseja efetuar depósito inicial? (y/n)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.println("Qual valor deseja depositar?");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nomeTitular, numeroConta, depositoInicial);
		}
		else {
			conta = new Conta(nomeTitular, numeroConta);
		}
				
		System.out.println("Dados da conta: " + conta + "\n");
		
		System.out.println("Valor depósito:\n");
		double valorDeposito = sc.nextDouble();
		conta.depositarValor(valorDeposito);
		
		System.out.println("Dados da conta: " + conta + "\n");

		System.out.println("Deseja fazer saque?\n");
		double valorSaque = sc.nextDouble();
		conta.sacarValor(valorSaque);
		
		System.out.println("Dados da conta: " + conta + "\n");
			
		sc.close();
		
		Conta acc = new Conta ("Alex", 1001, 0.0);
		ContaEmpresa eacc = new ContaEmpresa ("Maria", 1002, 0.0, 500.00);
		
		//Upcasting
		
		Conta acc1 = eacc;
		Conta acc2 = new ContaEmpresa ("Bob", 1003, 0.0, 200.00);
		Conta acc3 = new Poupanca ("Ana", 1004, 0.0, 0.01);
		
		//Downcasting
		
		ContaEmpresa acc4 = (ContaEmpresa) acc2;
		acc4.emprestimo(100.00);*/
		
		
		Conta acc1 = new Conta("Alex", 1001, 1000.00);
		acc1.sacarValor(200.00);
		System.out.println(acc1.getExtrato());
		
	}
}
