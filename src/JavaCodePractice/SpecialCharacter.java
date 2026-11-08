public class Main {
    public static void main(String[] args) {

     

        //find special character in string
        
    String a = "amarshinde01@gmail.com";

    for (int i = 0; i <= a.length()-1; i++){

        char  ch = a.charAt(i);
      if(!Character.isLetterOrDigit(ch)){

        System.out.print(ch);
      }

    }

    }
}