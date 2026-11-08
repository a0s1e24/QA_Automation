package JavaCodePractice;

 class test {
	

	public void methodA()
		 {

		System.out.print("callingA");
		
		}
	
	public void methodB()
	 {

	System.out.print("callingB");
	
	}
	
	
	public static void main(String[] args) {
		
		
		test L = new test();
		
		L.methodB();
	}
		

}