package pracAndExer;
import java.util.*;
public class chap02_Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        System.out.print("size of array :");
        num = scanner.nextInt();
        System.out.println(num);
        System.out.println();
        int[] a = new int[num];
        int[] b = new int[num];
        int[] c = new int[num];
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(50);
            System.out.println("a[" + i + "] : " + a[i]);
        }
        System.out.println("a) origin");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("=======================================");
        copy(b, a);
        System.out.println("b) a copy");
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println("=======================================");
        rcopy(c, a);
        System.out.println("c) a reverse copy");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
    static void copy(int[] a, int[] b){
        for(int i = 0; i < b.length; i++){
            a[i] = b[i];
        }
    }
    static void rcopy(int[]a, int[] b){
        for(int i = 0; i < b.length; i++){
            a[b.length-(i+1)] = b[i];
        }
    }
}
