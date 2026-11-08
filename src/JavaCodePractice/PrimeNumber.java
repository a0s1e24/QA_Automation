package JavaCodePractice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
	int n = 19;
	
	int Count = 0;
	
	for (int i = 1; i <= n; i++ ) {
		
		if (n % i == 0) {
			
			Count++;
		}
		
		
	}
	
	if (Count == 2) {
	 System.out.print("prime");
		
	}
	else {
		 System.out.print("Not prime");
			
		}
		

	}

}
