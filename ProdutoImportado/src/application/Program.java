package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import entities.Produto;
import entities.UsedProduct;
import entities.ImportedProduct;


public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Quantos produtos?");
		int n = sc.nextInt();
		
		List<Produto> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Dados produto " + i + ":");
			
			System.out.print("Comum/usado/importado (c/u/i) ");
			char tipo = sc.next().charAt(0);
		
			System.out.println("Nome: ");
			sc.next();
			String name = sc.nextLine();
			
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			if (tipo == 'c') {
				list.add(new Produto(name, price));	
			}
				
			else if (tipo == 'u') {
				System.out.print("Data manufatura(DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
				
			} else {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Produto prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		sc.close();
	}

}
