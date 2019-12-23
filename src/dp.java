import java.util.*;
import java.util.ArrayList;
//파도반 수열은 어느 정도를 넘어가면 int의 범위를 넘어간다.
public class dp {
    public static void main(String[] args){
        ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(1, 1, 1));

        int[] num;
        int i = 0;
        int j = 0;
        int temp_num = 0;

        Scanner scan = new Scanner(System.in);
        num = new int[scan.nextInt()];

        while(i < num.length){
            temp_num = scan.nextInt();
            if(temp_num >= 1 && temp_num <= 100){
                num[i] = temp_num;
                i++;
            }
        }
        j = maxFind(num);
        if(j < 4){
            for(int k = 0; k < num.length; k++){
                System.out.println(arr1.get(num[k]-1));
            }
        }
        else{
            for(int k = 3; k < j; k++){
                arr1.add(arr1.get(k-2)+arr1.get(k-3));
            }
            for(int k = 0; k < num.length; k++){
                System.out.println(arr1.get(num[k]-1));
            }
        }
    }
    public static int maxFind(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
