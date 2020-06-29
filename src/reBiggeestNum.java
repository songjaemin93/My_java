import java.util.*;
public class reBiggeestNum {
    public static void main(String[] args){
        int[] numbers = {999, 8, 9, 998};

        System.out.println(solution(numbers));
    }
    public static String solution(int[] numbers){
        String answer = "";
        ArrayList<String> numArray = new ArrayList<>();
        for(int temp : numbers){
            numArray.add(Integer.toString(temp));
        }
        Collections.sort(numArray, Comparator.reverseOrder());
        String temp = "";
        String idx = "";
        String idx1 = "";
        idx = numArray.get(0);
        for(int i = 1; i < numArray.size(); i++){
            idx1 = numArray.get(i);
            if(Long.parseLong(temp + idx + idx1) > Long.parseLong(temp + idx1 + idx)){
                temp = temp + idx;
                idx = idx1;
            }
            else{
                temp = temp + idx1;
            }
            //temp = Long.parseLong(temp + idx + idx1) > Long.parseLong(temp + idx1 + idx) ? (temp + idx) : (temp + idx1);
        }
        if(Integer.parseInt(temp) != 0){
            temp += idx;
        }
        else{
            temp = "0";
        }
        answer = temp;
        return answer;
    }
}
