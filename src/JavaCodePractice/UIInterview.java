package JavaCodePractice;

import java.util.HashSet;

public class UIInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int p = 91
				;
		int count = 0;
		
		for (int i = 1; i <= p; i ++) {
			
			if (p % i == 0) {
				
				count++;
			}
			
		}	
		
		
		if (count == 2) {
			
			System.out.print("primeNumber");
		}
		else {
			System.out.print("Not primeNumber");
			
		}

	}

}
