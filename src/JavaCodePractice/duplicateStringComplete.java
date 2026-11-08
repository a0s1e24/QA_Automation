package JavaCodePractice;

public class duplicateStringComplete {
	
	
	public static void main (String args[]) {
		
		
		String a ="amazzonlll";
		
		int i , j ;
		
		for (i = 0; i <= a.length()-1 ; i++) {
			int count = 1;
			
			
			for (j = i+1 ; j <= a.length()-1 ; j++) {
				
				
				if (a.charAt(i) == a.charAt(j)) {
					
					count++;					
					
				}		
				
			}
			if (count > 1) {
				System.out.print(a.charAt(i)+"=" + count+ "  ");
			}
			
			
			
		}
		
	}

}
