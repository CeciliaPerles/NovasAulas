package AulaSeis;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Cecília");
		usuarios.put(2, "Murilo");
		usuarios.put(3, "Maria");
		
		System.out.println(usuarios.get(3));
		
		System.out.println(usuarios.entrySet());
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " -> ");
			System.out.println(registro.getValue());
		}
		
	}

}
