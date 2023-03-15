package Conditional;

import java.util.Scanner;

public class testscore_9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int S = in.nextInt();

        if(S>=90) System.out.println("A");

        else if(S>=80) System.out.println("B");

        else if(S>=70) System.out.println("C");

        else if(S>=60) System.out.println("D");

        else System.out.println("F");

        in.close();
    }
}