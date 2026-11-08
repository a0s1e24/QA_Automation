// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] a = {11, 21, 9, 87,23};
        int max= a[0];
        
        for (int i = 1; i <= a.length-1; i++){
            
            if (a[i]>max){
                max = a[i];
            }
            
        }
        System.out.println(max);
        
        // code to find 2nd largest number
          int max_second_number = Integer.MIN_VALUE;

         for (int j = 1; j <= a.length-1; j++) {
             
        if (a[j] != max){
            
            if (a[j] > max_second_number){
                
                max_second_number = a[j];
                
                
            }
        }
         }
         System.out.println( max_second_number);
    }
}
