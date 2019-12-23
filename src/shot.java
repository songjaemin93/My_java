import java.util.*;

public class shot {
    public static void main(String[] args){
        String s = "aabbaccc";
        int result = 0;
        result = solution(s);
        System.out.println(result);
    }

    public static int solution(String s) {
        int answer = 0;
        String temp = "";
        String compareS = s;
        System.out.println(compareS);
        String shortS = "";
        int count = 0;

        for(int i = 1; i <= (s.length()/2);i++){
            temp = s.substring(0, i);
            //System.out.println(temp);
            for(int j = 0; j <= s.length()-i; j=j+i){

                //System.out.println(j + " " + s.length());
                if(s.substring(j, j+i).equals(temp)){
                    System.out.println(s.substring(j, j+i));
                    //System.out.println(temp);
                    count++;
                    //System.out.println("count : " + count);
                }
                else{
                    if(count == 1){
                        shortS = shortS.concat(temp);
                        //System.out.println("true"+shortS);
                    }
                    else{

                        shortS = shortS.concat(Integer.toString(count));
                        shortS = shortS.concat(temp);
                        //System.out.println("false"+shortS);
                    }
                    //System.out.println("temp1 : " + temp);
                    temp = s.substring(j, j+i);
                    //System.out.println("temp22 : " + temp);
                    count = 1;
                }
                if(j == s.length()-i){
                    if(count == 1){
                        shortS = shortS.concat(temp);
                    }
                    else {
                        shortS = shortS.concat(Integer.toString(count));
                        shortS = shortS.concat(temp);
                    }
                }
            }
            count = 0;
            System.out.println("여기");
            System.out.println(shortS);
            //System.out.println(shortS.length());
            //System.out.println(compareS.length());
            if(shortS.length() <= compareS.length()){
                compareS = shortS;
                System.out.println(" song jae min"+compareS);
            }
            shortS = "";
        }
        answer = compareS.length();
        return answer;
    }
}
