import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String w = inp.next();
        char[] c = w.toCharArray();
        String u = w.toUpperCase();
        char[] p = u.toCharArray();
        c[0] = p[0];
        System.out.print(c);
        inp.close();
    }
}