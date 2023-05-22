package estudando_strings;

import java.util.Scanner;

public class estudandoSwitchStrg {

	public static void main(String[] args) {

		/*Scanner sc = new Scanner(System.in);
		System.out.print("Digite o comando: ");
		String command = sc.next();
		
		switch(command) {
		
		case "cancel":
			System.out.println("Cancelling...");
			break;
			
		case "conect":
			System.out.println("Conecting...");
			break;	
			
		case "disconect":
			System.out.println("Disconecting...");
			break;	
		
		default: 
			System.out.println("Command Error!");
		break; 

					
			
		}
		sc.close();*/
		System.out.println("There are " + args.length +  " command-line arguments."); 
		System.out.println("They are:"); 
		for(int i=0; i<args.length; i++) 
		System.out.println("arg[" + i +"]: " + args[i]); 

	
		
	}

}
