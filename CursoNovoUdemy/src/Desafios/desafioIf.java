package Desafios;

import javax.swing.JOptionPane;

public class desafioIf {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Digite...");
		int numero = Integer.parseInt(valor);
		
		if(numero%2 ==0) {
			System.out.println("Par");
			}
			else {
				System.out.println("Ímpar");	
			}
		}

	}


