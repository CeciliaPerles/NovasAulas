package Desafios;

public class desafioOperadores {

	public static void main(String[] args) {


		double a = (6 *(2 + 3 ));
		double b = (Math.pow(a, 2))/(2*3);
		
		
		double c = ((1-5)*(2-7))/2;
		double d = (Math.pow(c,2));
		
		double e = (b - d);
		double f = (Math.pow(e, 3)) / (Math.pow(10,3));
		int g = (int) f;
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(g);
	}

}
