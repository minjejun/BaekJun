package Conditional;

import java.util.Scanner;
public class Quadrant_14681 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        if(A>0 && B>0) System.out.println("1");
        else if(A<0 && B>0) System.out.println("2");
        else if(A<0 && B<0) System.out.println("3");
        else System.out.println("4");
    }
}
