package JavaCodePractice;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateCountCollection {

	public static void main(String[] args) {
		
		
		String[] p = {"avi", "roy", "roy","pol","pol"};
		
		HashSet <String> set = new HashSet<>();
		
		HashSet <String> duplicate = new HashSet<>();
		
		for (int i = 0; i <= p.length-1; i++) {
			
			if(!set.add(p[i])) {
				
				duplicate.add(p[i]);
				
			}
			
		}
		System.out.print(duplicate + " ");

	}

}
