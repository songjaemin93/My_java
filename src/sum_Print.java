import java.util.*;

public class sum_Print {
    static int sum_int(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int result = 0;
        a = scan.nextInt();
        result = sum_int(a);
        for(int i = 1; i <= a; i++){
            if(i == a){
                System.out.println(i + " = " + result);
            }
            else{
                System.out.print(i + " + ");
            }
        }
    }
}
