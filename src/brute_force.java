import java.util.*;

public class brute_force {
    public static void main(String[] args){
        int i = 0;
        int result = 0;

        while(true) {
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            if(i>=0 && i <=1000000){
                break;
            }
        }
        for(int j = 1; j <= i; j++){
            int temp = j;
            result+=temp;
            for(int k = 10;temp!=0;){
                result += temp%k;
                temp = temp/k;
            }
            if(result == i){
                result = j;
                break;
            }
            result = 0;
        }
        System.out.println(result);
    }
}
