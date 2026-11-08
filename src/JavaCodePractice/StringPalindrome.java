
package JavaCodePractice;

public class StringPalindrome {

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		String str = "madam";
		String str1 = "";
		

		
		for (int i = str.length()-1; i >=  0 ; i--) {
			
			 str1 = str1 + str.charAt(i);
			
		}
		
		if (str == str1) {
		
         System.out.println("Given string is palindrom");
         }
		else {
			
	         System.out.println("Given string is not palindrom");
	         }
	}

}