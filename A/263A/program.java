// Codeforces problem - 263A
import java.util.Scanner;

public class program {
// BY maisha_maliha_
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        byte i, j, k = 0, l = 0, m = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                byte p = inp.nextByte();
                if (p == 1) {
                    k = i;
                    l = j;
                }
            }
        }
        while (k > 2) {
            m++;
            k--;
        }
        while (k < 2) {
            m++;
            k++;
        }
        while (l > 2) {
            m++;
            l--;
        }
        while (l < 2) {
            m++;
            l++;
        }
        System.out.print(m);
        inp.close();
    }
}
