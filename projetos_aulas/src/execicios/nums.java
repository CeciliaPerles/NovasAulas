package execicios;

import java.util.Scanner;

public class nums {
		
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Informe um saldo: ");
	float saldoInformadoNoPrograma = sc.nextInt();
	float guardadoAqui = calcularSaldoReajustado(saldoInformadoNoPrograma);
	
	imprimirSaldoReajustado(guardadoAqui);

	
	sc.close();
	
	}
	
	private static float calcularSaldoReajustado(float saldoInformado) {
		return (float) (saldoInformado + (saldoInformado * 0.01));
		
	}
	private static void imprimirSaldoReajustado(float saldoReajustado) {
		System.out.println(saldoReajustado);
	}
	
	
}
