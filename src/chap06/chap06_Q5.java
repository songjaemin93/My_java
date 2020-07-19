package chap06;

public class chap06_Q5 {
    public static void main(String[] args){
        int[] array = new int[7];
        array[0] = 9;
        array[1] = 1;
        array[2] = 3;
        array[3] = 4;
        array[4] = 6;
        array[5] = 7;
        array[6] = 8;

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();

        bidirectionbs(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();
    }
    static void bidirectionbs(int[] array){
        int left = 0;
        int right= array.length-1;
        int last = 0;
        while(left < right){
            for(int i = right; i > left; i--){
                if(array[i-1] > array[i]){
                    swap(array, i-1, i);
                    last = i;
                }
            }
            left = last;
            for(int i = left; i < right; i++){
                if(array[i] > array[i+1]){
                    swap(array, i, i+1);
                    last = i;
                }
            }
            right= last;
        }

    }
    static void swap(int[] array, int i, int j){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
