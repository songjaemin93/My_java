import java.lang.reflect.Array;
import java.util.*;
public class maraton {
    public static void main(String[] args){
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(solution(participant, completion));
    }
    public static String solution(String[] participant, String[] completion){
        String answer ="";
        ArrayList<String> partiList = new ArrayList<String>();
        for(String temp : participant){
            partiList.add(temp);
        }
        ArrayList<String> compList = new ArrayList<String>();
        for(String temp : completion){
            compList.add(temp);
        }
        Collections.sort(partiList);
        Collections.sort(compList);
        for(int i = 0; i < compList.size(); i++){
            if(!compList.get(i).equals(partiList.get(i))){
                answer = partiList.get(i);
                break;
            }
            if(i == compList.size()-1){
                answer = partiList.get(i+1);
            }
        }
        return answer;
    }
}
