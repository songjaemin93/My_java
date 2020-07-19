package chap06;

public class bubbleSort {
    public static void main(String[] args){
        int[] array = new int[7];
        array[0] = 22;
        array[1] = 5;
        array[2] = 11;
        array[3] = 32;
        array[4] = 120;
        array[5] = 68;
        array[6] = 70;
        System.out.print("original array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        bubbleSort(array);
        System.out.print("sorted array : ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    static void bubbleSort(int[] array){
        for(int i = 0; i < array.length-1; i++){
            System.out.println("패스" + (i+1) + ":");
            for(int j = 0; j < array.length-i-1; j++){
                for(int k = 0; k < array.length; k++){
                    /*
                    if(k == j && array[k] > array[k+1]){
                        System.out.print(array[k] + "+");
                    }
                    else if(k == j && array[k] <= array[k+1]){
                        System.out.print(array[k] + "-");
                    }
                    else{
                        System.out.print(array[k] + " ");
                    }
                     */
                    //조건이 많지 않을 경우 3항 연산자를 사용하면 코드를 줄일 수 있다!
                    System.out.print((k!= j) ? array[k] + " " : (array[k] > array[k+1]) ? array[k] + "+" : array[k] + "-");
                }
                System.out.println();

                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }

            }
            for(int m = 0; m < array.length; m++){
                System.out.print(array[m] + " ");
            }
            System.out.println();
            System.out.println();
        }

    }

    static void swap(int[] array, int i, int j){
        int temp = 0;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
