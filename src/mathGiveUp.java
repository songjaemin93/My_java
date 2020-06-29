import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class mathGiveUp {
    public static void main(String[] args){
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {1, 3, 2, 4, 2};
        int[] answer3 = {5, 5, 5, 5, 1};
        int[] result1;
        int[] result2;
        int[] result3;

        result1 = solution(answer1);
        result2 = solution(answer2);
        result3 = solution(answer3);
        for(int i = 0; i < result1.length; i++){
            System.out.println(result1[i]);
        }
        for(int i = 0; i < result2.length; i++){
            System.out.println(result2[i]);
        }
        System.out.println("result3" + result3.length);
        for(int i = 0; i < result3.length; i++){
            System.out.println(" result 3 "+result3[i]);
        }
    }
    public static int[] solution(int[] answers){

        int[] answer = {};
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = {0, 0, 0};

        for(int i = 0; i < answers.length; i++){
            if(answers[i] == pattern1[i%5]){
                cnt[0]++;
            }
            if(answers[i] == pattern2[i%8]){
                cnt[1]++;
            }
            if(answers[i] == pattern3[i%10]){
                cnt[2]++;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        if(max == cnt[0]) arrayList.add(1);
        if(max == cnt[1]) arrayList.add(2);
        if(max == cnt[2]) arrayList.add(3);

        answer = new int[arrayList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
