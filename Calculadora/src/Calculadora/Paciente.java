package Calculadora;

public class Paciente {

	Double peso;
	Double altura;

	double calcularImc() {

		return this.peso / (this.altura * this.altura);

	}

	String diagnostico() {

		double resultado = this.calcularImc();

		if (resultado < 16.00) {
			return "Baixo peso muito grave";
		}
		else if (resultado >= 16.00 && resultado < 16.99) {
			return "Baixo peso grave";
		} else if (resultado >= 17.00 && resultado < 18.49) {
			return "Baixo peso";
		} else if (resultado >= 18.50 && resultado < 24.99) {
			return "Peso normal";
		} else if (resultado >= 25 && resultado < 29.99) {
			return "Sobrepeso";
		} else if (resultado >= 30 && resultado < 34.99) {
			return "Obesidade grau I";
		} else if (resultado >= 35 && resultado < 39.99) {
			return "Obesidade grau II";
		} else {
			return "Obesidade grau III (obesidade mórbida)";
		}
	}

	void imprimirImcDiagnostico() {
		double resultadoImc = this.calcularImc();
		String resultadoDiagnostico = this.diagnostico();
		
		System.out.println("O paciente tem IMC igual a " + resultadoImc + " e está com " + resultadoDiagnostico);
	}

	public Paciente(Double peso, Double altura) {
		this.peso = peso;
		this.altura = altura;
	}
}
