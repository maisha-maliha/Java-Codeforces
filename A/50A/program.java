import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        short m = inp.nextShort();
        short n = inp.nextShort();
        if (m <= n && n >= 1 && m >= 1 && n <= 16 && m <= 16) {
            short i = (short) (m * n);
            if (i % 2 == 0) {
                System.out.print(i / 2);
            } else {
                i = (short) ((i - 1) / 2);
                System.out.print(i);
            }
        }
        inp.close();
    }
}
