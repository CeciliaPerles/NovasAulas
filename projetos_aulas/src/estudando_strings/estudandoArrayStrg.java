package estudando_strings;

public class estudandoArrayStrg {

	public static void main(String[] args) {

	/*	String strs[] = {"This", "is", "a", "test."}; 
		System.out.println("Original array:"); 
		
		for(String s: strs)
		System.out.print(s + " "); 
		System.out.println("\n");  
		// altera um string  
		
		strs[1] = "was";  strs[3] = "test, too!"; 
		
		System.out.println("Modified array:");  
		
		for(String s: strs) 
		System.out.print(s + " ");   */
		
		String orgstr = "Java makes the Web move.";  // constrói um substring 
		String substr = orgstr.substring(5, 18); 
		
		System.out.println("orgstr: " + orgstr); 
		System.out.println("substr: " + substr); 

				
		

	}

}
