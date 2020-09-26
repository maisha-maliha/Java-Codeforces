import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long n = inp.nextLong();
        long s = n + 1;
        long p = s / 2;
        if (n > 0) {
            if (s % 2 == 0) {
                System.out.print(p);
            } else {
                System.out.print(s);
            }
        } else {
            System.out.print(n);
        }

        inp.close();
    }
}