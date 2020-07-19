package chap06;

public class selectionSort {
    public static void main(String[] args){
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 4;
        a[2] = 2;
        a[3] = 3;
        a[4] = 1;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        selectionSort(a);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(int[] a){
        int min = 0;
        for(int i = 0; i < a.length-1; i++){
            //min까지는 정렬되었다고 봄
            min = i;
            for(int j = i+1; j < a.length; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }
    static void swap(int[] a, int i, int min){
        int temp = 0;
        temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}
