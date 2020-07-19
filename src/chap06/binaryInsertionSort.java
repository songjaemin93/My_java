package chap06;

public class binaryInsertionSort {
    public static void main(String[] args){
        int[] a = new int[7];
        a[0] = 1;
        a[1] = 3;
        a[2] = 7;
        a[3] = 4;
        a[4] = 6;
        a[5] = 2;
        a[6] = 5;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        binarySort(a, a.length);

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void binarySort(int[] a, int n){
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int pl = 0; // 검색범위 맨 앞의 인덱스
            int pr = i - 1; // 검색범위 맨 뒤의 인덱스
            int pc; // 〃 중앙의 인덱스
            int pd; // 삽입하는 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key) // 검색성공
                    break;
                else if (a[pc] < key)
                    pl = pc + 1;
                else
                    pr = pc - 1;
            } while (pl <= pr);
            //mid보다 작으면 그 위치!(pr+1 ==> mid), 크면 그 다음 위치!(pr+1 ==> mid+1)
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--)
                a[j] = a[j - 1];
            a[pd] = key;
        }

    }
}
