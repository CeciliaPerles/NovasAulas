package Calculadora;
public class Principal {

	public static void main(String[] args) {

		Paciente pacienteUm = new Paciente(50.00, 1.60);
		Paciente pacienteDois = new Paciente(120.00, 2.01);
		Paciente pacienteTres = new Paciente(70.00, 1.70);
		
		pacienteUm.imprimirImcDiagnostico();
		pacienteDois.imprimirImcDiagnostico();
		pacienteTres.imprimirImcDiagnostico();
		
//		System.out.println(pacienteUm.calcularImc());
//		System.out.println(pacienteUm.diagnostico());
//		
//		System.out.println(pacienteDois.calcularImc());
//		System.out.println(pacienteDois.diagnostico());
//		
//		System.out.println(pacienteTres.calcularImc());
//		System.out.println(pacienteTres.diagnostico());
//		
	
				
	}

}
