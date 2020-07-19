package chap06;

public class insertionSort {
    public static void main(String[] args){
        int[] a = new int[7];
        a[0] = 22;
        a[1] = 5;
        a[2] = 11;
        a[3] = 32;
        a[4] = 120;
        a[5] = 68;
        a[6] = 70;

        for(int i = 0; i < a.length-1; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        insertionSort(a);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
    static void insertionSort(int[] a){
        int temp = 0;
        for(int i = 0; i < a.length-1; i++){
            int j;
            temp = a[i];
            for(j = i+1; j < a.length && a[j] < temp; j++){
                a[j-1] = a[j];
            }
            a[j-1] = temp;
        }
    }
}
