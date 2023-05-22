package projetos_aulas_arrays;

import java.util.Scanner;

public class NovaAulaLogica {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		/*System.out.println("Em que ano estamos?");
		int ano = sc.nextInt();
		System.out.println("Qual seu ano de nascimento?");
		int anoNascimento = sc.nextInt();
		int idadeCreuza = ano - anoNascimento;
		
		System.out.println("\nVocê tem " + idadeCreuza + " anos.");
		
		//DOLARES
		
		System.out.println("Quantos reais você tem?");
		int reais = sc.nextInt();
		int dolares = reais / 2;
		
		System.out.println("Você pode ter " + dolares + " dólares.");
		
		sc.close();
		
		//TEMPERATURA
		
		System.out.println("Qual a temperatura em graus F?");
		double f = sc.nextInt();
		
		double c =((f - 32)/1.8);
		
		System.out.printf("A temperatura em C é %.2f.", c);
		
		System.out.println("Qual valor do produto?");
		int precoProduto = sc.nextInt();
		
		int valorImposto = (precoProduto * 60)/100;
		System.out.println("Valor do imposto = " + valorImposto);
		
		int valorTotal = precoProduto + valorImposto;
		System.out.println("Valor total = " + valorTotal);
		
		//MAIORIDADE
		
		int anoAtual = 2023;
		System.out.println("Qual seu ano de nascimento?");
		int anoNascimento = sc.nextInt();
		int idade = anoAtual - anoNascimento;
		int maioridade = 18;
		
		if (idade > maioridade) {
			System.out.println("Você já é maior de idade! Sua idade: " + idade + ".");
		} else {
			System.out.println("Você ainda é menor e idade. Será maior em: " + (anoNascimento + maioridade) + ".");
		}*/
		
		
		//Calculo IMC
		
		/*System.out.println("Qual sua altura?");
		double altura = sc.nextDouble();
		System.out.println("Qual seu peso?");
		double peso = sc.nextDouble();
		
		
		double imc = peso / (altura * altura);
		System.out.printf("IMC = %.2f.", imc);
		System.out.println("\n");
		
		
		if (imc >= 18.50 && imc <= 24.99) {
			System.out.println("Peso normal.");
		}
		else if (imc >= 25 && imc <= 29.99) {
			System.out.println("Pré-obesidade.");
		}
		else if (imc >= 30 && imc <= 34.99) {
			System.out.println("Obesidade I.");
		}
		else if (imc >= 35 && imc <= 39.99) {
			System.out.println("Obesidade II.");
		}
		else if (imc >= 40) {
			System.out.println("Obesidade III.");
		}*/
		
		//VIAGEM 
		/*
		
		System.out.println("Quanto tem de dinheiro?");
		int dinheiro = sc.nextInt();


		if (dinheiro < 1000) {
			System.out.println("Melhor ficar em casa...");
		}
		else if (dinheiro >= 1000 && dinheiro < 10000) {
			System.out.println("Dá pra ir pra Bahia.");
		}
		else {
			System.out.println("Tchau! Pode ir pra Disney :)");
		}
	sc.close();
		
		
		int i = 0;
		System.out.println("Qual tabuada deseja ver?");
		int j = sc.nextInt();
		int resultado;
		while (i <10) {
			i++;
			resultado = i * j;
			System.out.println(i + " x " + j + " = " + resultado + ".");
			
		}
	

		
		int contador = 1;
		int maior = 0;
		
		
		while (contador <= 3){
			
			System.out.println("Digite o número " + contador + ": ");
			int n = sc.nextInt();
			
			if (n > maior) {
				maior = n;
			}
			
			;
		contador++;
		}
		System.out.println("Maior = " + maior);	*/
		
		int a = 7;
		int b = 2;
		int resultado = a%b;
		
		System.out.println(resultado);
		
		sc.close();
	}

}
