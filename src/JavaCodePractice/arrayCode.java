package JavaCodePractice;


public class arrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String p = "madam";
				
		for (int i =0; i <= p.length()-1; i++) {
			
			
			for (int j =i+1; j <= p.length()-1; j++) {
				
				
			if (p.charAt(i) != p.charAt(j)) {
				
				
				System.out.print(p.charAt(i));
				
			}
				
				
			}
			
			
		}		

		
		
	}

}
