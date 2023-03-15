package InputOutputandQuadraticCalculation;

import java.util.Scanner; // Scanner가 java.util 안에 있다는걸 컴파일러한테 알려줌.

public class AXB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println(A*B);

        in.close();
    }
}
