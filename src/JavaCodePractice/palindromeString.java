package JavaCodePractice;

public class palindromeString {
	
	public static void main (String[] args) {
		
		
		String T = "madam";
		String R = "";
		
		for (int i =T.length()-1; i >= 0; i--) {
			
		
		 R = R + T.charAt(i);
		
			
		}	
		if (T.equals(R)) {
			
			System.out.print("Given string is palindrome");
			
		}
		else {
		System.out.print(" not palindrome");
		}
		
	}

}
