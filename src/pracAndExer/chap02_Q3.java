package pracAndExer;
import java.util.*;
public class chap02_Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        System.out.print("size of array : ");
        num = scanner.nextInt();
        System.out.println(num);
        int[] array = new int[num];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.print("original array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("reverse start------------------------------------");
        reverse(array);
        System.out.println("reverse end--------------------------------------");
    }
    static void reverse(int[] array){
        for(int i = 0; i < (array.length / 2); i++){
            swap(array, i, array.length-(i+1));
            for(int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[] array, int i, int j){
        System.out.println("array[" + i + "] and array[" + j + "] swap");
        int temp = 0;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
