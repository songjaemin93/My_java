import java.util.*;

public class biggestNum {
    static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args){
        int[] array = {0, 0, 1, 1111111111};

        System.out.println(solution(array));
    }
    public static String solution(int[] numbers){
        String answer  = "";
        permutation(numbers, 0, numbers.length, numbers.length);
        answer=Integer.toString(Collections.max(arrayList));
        return answer;
    }
    public static void permutation(int[] arr, int depth, int n, int r){
        if(depth == r){
            String temp ="";
            temp = strAdd(arr, r);
            arrayList.add(Integer.parseInt(temp));
            return;
        }
        for(int i = depth; i < n; i++){
            swap(arr, depth, i);
            permutation(arr, depth+1, n, r);
            swap(arr, depth, i);
        }
    }
    public static void swap(int[] arr, int depth, int i){
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }
    public static String strAdd(int[] arr, int r){
        String temp = "";
        for(int i = 0; i < r; i++){
            temp += arr[i];
        }
        return  temp;
    }
}
