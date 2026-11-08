
package JavaCodePractice;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "I want to switch my job in good company soon";
		String b = "Point";
		
		System.out.println("Length of string is:  "+a.length());
		
		
		//find letter on certain index position
		System.out.println(a.charAt(0));
		
		
        //Concatinating two string 
		System.out.println("Concatinating two strings:  "+a.concat(b));
		
		
		
		// use to find out letter in which index position 
		System.out.println(a.indexOf("n"));
		
		System.out.println(a.substring(1));
		
		System.out.println(false);
	}

}