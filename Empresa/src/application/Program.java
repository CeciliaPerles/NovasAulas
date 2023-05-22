package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutsoucerdEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados funcionário " + i + ":");
			
			System.out.print("É terceirizado? (y/n) ");
			char ch = sc.next().charAt(0);
		
			System.out.println("Nome: ");
			sc.next();
			String name = sc.nextLine();
			
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			
			System.out.print("Valor por horas: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Adicional: ");
				double additionalCharge = sc.nextDouble();
				
				 Employee emp = new OutsoucerdEmployee(name, hours, valuePerHour, additionalCharge);
				 list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				 list.add(emp);
			}
			
			
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
