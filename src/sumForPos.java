import java.util.*;

public class sumForPos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=0;
        System.out.println("1부터 n까지의 합을 구합니다.");

        do{
            System.out.println("n의 값 : ");
            n = scan.nextInt();
        }while(n <= 0);

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
