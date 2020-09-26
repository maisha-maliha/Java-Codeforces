import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        byte n = inpu.nextByte();
        byte k = inpu.nextByte();
        byte i, j, p, b = 0;
        byte[] a = new byte[n];
        boolean t = true;
        if (n >= 1 && n < 100 && n >= k) {
            for (i = 0; i < n; i++) {
                a[i] = inpu.nextByte();
            }
            for (i = 0; i < n; i++) {
                for (j = i; j < n - 1; j++) {
                    if (a[j] < a[j + 1]) {
                        p = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = p;
                    }
                }
                if (a[i] == 0) {
                    b++;
                }
            }
            for (i = 0; i < n; i++) {
                if (a[i] == 0) {
                    if (i < k) {
                        System.out.print(i);
                        t = false;
                        break;
                    }
                }
            }
            if (t) {
                k--;
                for (i = k; i < n - 1; i++) {
                    if (a[i] == a[i + 1]) {
                        continue;
                    } else {
                        break;
                    }
                }
                if (b < n) {
                    System.out.print(i + 1);
                } else {
                    System.out.print('0');
                }
            }

        }
        inpu.close();
    }
}
