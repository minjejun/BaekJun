package Conditional;

import java.util.Scanner;

public class Dice_2480 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        // 만약 모든 변수가 다른 경우
        if (A != B && B != C && A != C) {
            int max;
            // 만약 a > b 라면
            if (A > B) {
                // c > a > b 라면
                if (C > A) {
                    max = C;
                }
                // a > (b, c)
                else {
                    max = A;
                }
            }
            // b > a 라면
            else {
                // c > b > a 라면
                if (C > B) {
                    max = C;
                }
                // b > (a, c)
                else {
                    max = B;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (A == B && A == C) {
                System.out.println(10000 + A * 1000);
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(A == B || A == C) {
                    System.out.println(1000 + A * 100);
                }
                // b가 c랑 같은 경우
                else {
                    System.out.println(1000 + B * 100);
                }
            }
        }
    }
}
