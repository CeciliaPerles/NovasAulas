package projetos_aulas_arrays;

public class TabelaVerdade {

	public static void main(String[] args) {


		System.out.println("P\tQ\tAND\tOR\tXOR\tNOTp\tNOTq" );
		
		boolean p, q;
		p=true;
		q=true;
		
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p) + "\t" + (!q));
		
		p=true;
		q=false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)+ "\t" + (!q));
		
		p=false;
		q=true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)+ "\t" + (!q));
		
		p=false;
		q=false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p)+ "\t" + (!q));
		
	}

}
