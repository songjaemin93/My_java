package pracAndExer;

import java.util.Scanner;

public class chap02_maxOfArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("키의  최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = scanner.nextInt();

        int[] height = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("height[" + i + "] : ");
            height[i] = scanner.nextInt();
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }

    static int maxOf(int[] height){
        int max = height[0];
        for(int i = 1; i < height.length; i++){
            if(height[i] > max){
                max = height[i];
            }
        }

        return max;
    }
}
