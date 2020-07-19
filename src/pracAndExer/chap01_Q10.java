package pracAndExer;

import java.util.Scanner;

public class chap01_Q10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a = scanner.nextInt();
        System.out.println("a의 값 : " + a);
        b = scanner.nextInt();

        while(a >= b){
            System.out.println("b의 값 : " + b);
            System.out.println("a보다 큰 값을 입력하세요!");
            b = scanner.nextInt();
        }
        System.out.println("b의 값 : " + b);
        System.out.println("b - a는 " + (b-a) + "입니다.");
    }
}
