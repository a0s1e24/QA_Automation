package JavaCodePractice;

public class CodeOne {

    public static void main(String[] args) {

        String[] a = {"xyz", "lp", "wr"};

        for (int i = 0; i < a.length; i++) {

            String s = a[i];
            String rev = "";
        

            for (int j = s.length() - 1; j >= 0; j--) {
                rev = rev + s.charAt(j);
            }

            System.out.println(rev);
        }
    }
}
