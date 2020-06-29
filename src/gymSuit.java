import java.util.*;

public class gymSuit {
    public static void main(String[] args){
        int n = 8;
        int[] lost = {1,3,6,8};
        int[] reserve = {1,3,6,8};

        System.out.println(solution(n, lost, reserve));
    }
    public static int solution(int n, int[] lost, int[] reserve){
        int answer = 0;
        answer = n - lost.length;
        ArrayList<Integer> lostList = new ArrayList<>();
        for(int temp : lost){
            lostList.add(temp);
        }
        ArrayList<Integer> reserveList = new ArrayList<>();
        for(int temp : reserve){
            reserveList.add(temp);
        }

        Collections.sort(lostList);

        for(int i = 0; i < lostList.size(); i++){
            int temp = lostList.get(i);
            if(reserveList.contains(temp)){
                answer++;
                reserveList.remove(reserveList.indexOf(temp));
                lostList.remove(i);
                i--;
            }
        }
        for(int i = 0; i < lostList.size(); i++){
            int temp = lostList.get(i);
            if(reserveList.contains(temp-1)){
                answer++;
                reserveList.remove(reserveList.indexOf(temp-1));
                continue;
            }
            if(reserveList.contains(temp+1)){
                answer++;
                reserveList.remove(reserveList.indexOf(temp+1));
            }
        }
        return answer;
    }
}
