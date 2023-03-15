package Conditional;

import java.util.Scanner;

public class Clock_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        in.close();

        if(M<45) { // 분이 45분보다 작을 때
            H--; // 시간 1이 줄어듬.
            M = 60 - (45 - M);
            // 분이 60분 이므로 총 분에서 45-일어나려는 분 빼기
            if(H<0) { // 시간이 0보다 작아질 때
                H = 23; // 23시로 되돌아감.
            }
            System.out.println(H + " " + M);
            // 위의 조건으로 출력.
        }
        else { // 위의 조건들이 아니라면
            System.out.println(H + " " + (M - 45));
            // 시간은 그대로, 분에서 45분 뺀 값을 출력.
        }
    }
}
