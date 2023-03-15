package InputOutputandQuadraticCalculation;

import java.util.Scanner;
public class AplusBplusC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        System.out.println(a+b+c);

        in.close();
    }
}
