package AulaSeis;

public class EqualsHash {

	public static void main(String[] args) {

		Objeto objeto = new Objeto();
		objeto.name = "caneta";
		
		Objeto objeto2 = new Objeto();
		objeto2.name = "caneta";
		System.out.println(objeto2.name.equals(objeto.name));
		
		
		
	}

}
