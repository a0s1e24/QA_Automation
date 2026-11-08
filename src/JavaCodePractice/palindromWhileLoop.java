package JavaCodePractice;

public class palindromWhileLoop {

	public static void main(String[] args) {
		
		
		int num = 101091;
		String c = Integer.toString(num);
	
		
//		String c = "10101" ;
		
		int i = 0 , j = c.length()-1;
		
      while (i < j) {
    	  
    	  if (c.charAt(i)!= c.charAt(j))
    		  
    	  {
    		  
    		  System.out.print("Given string is not palindrom");
    		  System.exit(0);
    	  }
    	  
    	  i++;
    	  j--;
    	  	  
    	  
      }
      
      System.out.print("Given string is palindrom");
		
		
		
	}

}
