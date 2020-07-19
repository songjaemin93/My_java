package pracAndExer;

import java.util.*;

public class fromToSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int b = 0;
        a = scan.nextInt();
        b = scan.nextInt();
        int result = 0;
        result = fromToSum(a , b);
        System.out.println("from a to b of sum = " + result);
    }
    static int fromToSum(int a, int b){
        int sum = 0;
        int temp = 0;
        if(a > b){
            temp = b;
            b = a;
            a = temp;
        }
        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }
}
