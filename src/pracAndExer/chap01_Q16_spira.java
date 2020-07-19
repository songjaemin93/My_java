package pracAndExer;
import java.util.Scanner;

public class chap01_Q16_spira {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        spria(n);
        npira(n);
    }
    static void spria(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void npira(int n){
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < (2*i)+1; j++){
                System.out.print((i+1)%10);
            }
            System.out.println();
        }
    }
}
