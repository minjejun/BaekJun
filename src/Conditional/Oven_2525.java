package Conditional;

import java.util.Scanner;

public class Oven_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt(); // 시
        int B = in.nextInt(); // 분

        int C = in.nextInt(); // 걸린 시간(분)

        int min = 60 * A + B; // min 정수를 60 X A + B로 정의.
        min += C; // 요리하는데 걸린 시간 더하기.

        int hour = (min / 60) % 24; // 시 (24시 이상이 될 경우 0시 부터 시작하도록 함)
        int minute = min % 60; // 분

        in.close();

        System.out.println(hour + " " + minute);

    }
}
