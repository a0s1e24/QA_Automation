package JavaCodePractice;

import java.util.Arrays;

public class ReverceInReverceString {

	public static void main(String[] args) {
		
		
		String[] T = {"xyz", "bca", "lpi"};
		

		
		for (int i = T.length-1 ; i >=0; i--) {
			
			String P = T[i];   //Reverce entire string and store and apply same condition in another loop
			
			for (int j = P.length()-1 ; j >=0; j--) {
				
				
				System.out.print(""+P.charAt(j));
				
			}
			
			System.out.print(" ");
			
		}	
		

	}

}
