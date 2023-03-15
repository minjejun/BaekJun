package Conditional;

import java.util.Scanner;

public class compare_1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        if(A > B) {
            System.out.println(">");
        }
        if(A < B) {
            System.out.println("<");
        }
        if(A == B) {
            System.out.println("==");
        }

        in.close();
    }
}