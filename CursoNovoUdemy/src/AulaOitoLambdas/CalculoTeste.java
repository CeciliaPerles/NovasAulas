package AulaOitoLambdas;

public class CalculoTeste {

	public static void main(String[] args) {

//		Calculo soma = new Somar();
//		System.out.println(soma.executar(4,5));
//		
//		
		Calculo soma2 = (x,y) -> x+y;;
		System.out.println(soma2.executar(4,5));
	}

}
