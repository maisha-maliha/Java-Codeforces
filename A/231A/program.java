import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        short inp = inpu.nextShort();
        short i, b = 0, c = 0;
        if (inp >= 1 && inp <= 1000) {
            for (i = 1; i <= inp * 3; i++) {
                short a = inpu.nextShort();
                b += a;
                if (i % 3 == 0) {
                    if (b >= 2) {
                        c++;
                        b = 0;
                    } else {
                        b = 0;
                    }
                }
            }
            System.out.print(c);
        }
        inpu.close();
    }
}