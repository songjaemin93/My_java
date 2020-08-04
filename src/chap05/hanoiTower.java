package chap05;

import java.util.Scanner;

public class hanoiTower {
    public static void move(int n, int x, int y){
        if(n > 1){
            //1~n-1까지의 원반을 1기둥에서 2기둥으로 옮김
            move(n-1, x, 6-x-y);
        }
        //n 원반을 1기둥에서 3기둥으로 옮김
        System.out.println("원반[" + n + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

        //1~n-1까지의 원반을 2기둥에서 3기둥으로 옮김
        if(n > 1){
            move(n-1, 6-x-y, y);
        }
    }

    public static void moveChar(int n, char from, char mid, char to){
        if(n == 1)
            System.out.println("원반[" + n + "]을 " + from + "기둥에서 " + to + "기둥으로 옮김");
        else{
            moveChar(n-1, from, to, mid);
            System.out.println("원반[" + n + "]을 " + from + "기둥에서 " + to + "기둥으로 옮김");
            moveChar(n-1, mid, from, to);
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = stdIn.nextInt();

        move(n, 1, 3);
        System.out.println("--------------------------------------");
        moveChar(n, 'A', 'B',  'C');
    }

}
