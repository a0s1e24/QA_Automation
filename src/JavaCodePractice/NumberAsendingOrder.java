package JavaCodePractice;

import java.util.Arrays;

public class NumberAsendingOrder {

	public static void main(String[] args) {
	
		int[] P = {4, 9, 1}; 
		
		
//		Now print in asending order
		
		 Arrays.sort(P);
		
		
//		System.out.print(Arrays.toString(P));  if want output in bracket [1, 4, 9, 21]
		
		for (int U:P) {
			
			System.out.print(" "+U);  // if want just print  1 4 9 21
			
		}

	}

}
