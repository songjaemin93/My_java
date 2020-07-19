package pracAndExer;

import java.util.Random;

public class chap02_Q1 {
    public static void main(String[] args){
        Random random = new Random();
        System.out.println("키의  최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int peopleNum = random.nextInt(20);
        System.out.println(peopleNum);
        int[] height = new int[peopleNum];
        for(int i = 0; i < peopleNum; i++){
            height[i] = 100 + random.nextInt(100);
            System.out.println("height[" + i + "] : " + height[i]);
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
