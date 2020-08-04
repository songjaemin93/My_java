import java.util.*;

public class gauss_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        int result = 0;
        a = scan.nextInt();
        result = gauss_sum(a);
        System.out.println(a + " of gauss sum = " + result);

    }
    //나누기 할 때 꼭 괄호를 쳐줘서 먼저 연산되도록 하자..
    static int gauss_sum(int a) {
        int sum = 0;
        // 의도치 않았지만 (1+a) * a/2; 식으로 홀짝 모두 제대로 된 값을 얻을 수 있었음.
        System.out.println((1 + a) * a / 2);
        if (a % 2 == 0) {
            sum = (1 + a) * (a / 2);

        } else {
            sum = (1 + a) * (a / 2) + (a/2 + 1);
        }

        return sum;
    }
}
