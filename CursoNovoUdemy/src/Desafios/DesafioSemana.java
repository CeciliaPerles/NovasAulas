package Desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite o dia: ");
		String dia = sc.next();
			
		if("Domingo".equalsIgnoreCase(dia)) 
		{
			System.out.println("1");
			}
			else if("Segunda".equalsIgnoreCase(dia)){
				System.out.println("2");	
			}
			else if("Terça".equalsIgnoreCase(dia)){
				System.out.println("3");	
			}
			else if("Quarta".equalsIgnoreCase(dia)){
				System.out.println("4");	
			}
			else if("Quinta".equalsIgnoreCase(dia)){
				System.out.println("5");	
			}
			else if("Sexta".equalsIgnoreCase(dia)){
				System.out.println("6");	
			}
			else if("Sábado".equalsIgnoreCase(dia)){
				System.out.println("7");	
			}
			else {
				System.out.println("Digite dia válido: ");		
				
					}
					
						
				
			
				
		
			
		sc.close();
	}

}

