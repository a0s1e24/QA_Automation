package JavaCodePractice;

public class ReverceTwo {
	
	public static void main (String[] args) {
		
		String[] s = {"xyz", "abc", "ball"};
		
		
		for (int i = 0; i <= s.length-1; i++) {
			
			
			String t = s[i];
			
			
			for (int j = t.length()-1; j >= 0; j--) {
				
				
				System.out.print( t.charAt(j));
				
			}
			System.out.print( " ");
			
			
		}	
		
		
	}

}
