package pracAndExer;
//printf : %d, %f 등을 사용할 때 이용
public class chap02_cloneArray {
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5};
        int[] b = a.clone();

        b[3] = 0;

        System.out.print("a = ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%3d", a[i]);
        }
        System.out.println();

        System.out.print("b = ");
        for(int i = 0; i < a.length; i++){
            System.out.printf("%3d", b[i]);
        }
        System.out.println();
    }
}
