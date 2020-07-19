package chap06;

public class chap06_Q7 {
    public static void main(String[] args){
        int[] a = new int[8];
        a[1] = 22;
        a[2] = 5;
        a[3] = 11;
        a[4] = 32;
        a[5] = 120;
        a[6] = 68;
        a[7] = 70;

        for(int i = 0; i < a.length; i++){
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
        for(int i = 2; i < a.length; i++){
            int temp = a[0] = a[i];
            int j=i;
            //인덱스 1에 도달하면 0과 같기 때문에 종료
            for(;a[j-1] > temp; j--){
                a[j] = a[j-1];
            }
//            아래 if문이 왜 있는지 모르겠음. 어차피 보초법으로 0인덱스는 무조건 1인덱스보다는 같거나 작아서 j가 1보다 작아지지 않음.
//            if(j > 0){
            a[j] = temp;
//            }
        }
    }
}
