package InputOutputandQuadraticCalculation;

import java.util.Scanner; //Scanner가 java.util 안에 있다는걸 컴파일러한테 알려줌.
public class AminusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(x-y);

        in.close();
    }
}
