package chap05;

import java.util.Scanner;
public class euclidGcd {
    static int gcd(int x, int y){
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("gcd");

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int y = stdIn.nextInt();
        System.out.println("gcd : " + gcd(x, y));

        System.out.println("forGcd : " + forGcd(x, y));
    }

    static int forGcd(int x, int y){
        System.out.println("되냐");
        int temp = 0;
        for(; y != 0;){
            temp = x;
            x = y;
            y = temp % y;
        }

        return x;
    }
}
