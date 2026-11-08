package JavaCodePractice;

import java.util.HashSet;

public class RemovedDuplicates {
	
	public static void main (String[] args) {
		
		
		int[] a = {1,1, 2, 3,4, 5, 6,6 };
		
		
		HashSet <Integer> set = new HashSet<>();
		
		for (int i = 0; i <= a.length-1; i++) {
			
			set.add(a[i]);
			
		}
		System.out.print(set);
	}

}
