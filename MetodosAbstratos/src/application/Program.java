package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Retangle;
import entities.AbstractShape;
import entities.Circle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbstractShape s1 = new Circle(Color.BLACK, 2.0);
		AbstractShape s2 = new Retangle(Color.WHITE, 4.0, 3.0);
		
		System.out.println("circle color: " + s1.getColor() + " + circle color: " + s1.area());
		System.out.println("circle retangle: " + s2.getColor() + " + retangle color: " + s2.area());
		
		
		/*Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("número de formas: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("qual a forma: " + i + " (C/R)");
			char forma = sc.next().charAt(0);
			System.out.println("qual a cor (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
									
			if(forma == 'R'){
				System.out.println("digite altura: ");
				double altura = sc.nextDouble();
				System.out.println("qual a base: ");
				double base = sc.nextDouble();
				
				list.add(new Retangle(color, altura, base));
				
			} else {
				
				System.out.println("digite raio: ");
				double raio = sc.nextDouble();
				list.add(new Circle(color, raio));
			}
			
		}
		
		System.out.println("shape areas: ");
		for (Shape shape : list) {
			System.out.println(shape.area());
		}
		
		
		sc.close();*/
	}

}
