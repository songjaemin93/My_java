import java.util.*;

public class friend_2 {
    //floyd - warshall
    public static final int INF = 100000000;

    public static void main(String args[]){
        int numberOfPeople = 0;
        int count = 0;
        int max = 0;
        Scanner scan = new Scanner(System.in);
        numberOfPeople = scan.nextInt();

        String[][] friend = new String[numberOfPeople][numberOfPeople];
        int[][] friendValue = new int[numberOfPeople][numberOfPeople];
        for(int i = 0; i < numberOfPeople; i++){
            friend[i] = scan.next().split("");
        }
        for(int i = 0; i < friend.length; i++){
            for(int j = 0; j < friend.length; j++){
                friendValue[i][j] = friend[i][j].charAt(0) == 'Y' ? 1 : INF;
            }
        }

        friendValue = floyd(friendValue);
        for(int i = 0; i < friendValue.length; i++){
            count = 0;
            for(int j = 0; j < friendValue.length; j++){
                if(friendValue[i][j] <= 2){
                    count++;
                }

            }
            if(count == numberOfPeople-1){
                max = count;
                break;
            }
            else if(count > max){
                max = count;
            }
        }
        System.out.println(max);
//        for(int i = 0; i < friend.length; i++){
//            for(int j = 0; j < friend[i].length; j++){
//                if(i == j){
//                    continue;
//                }
//                else if(friend[i][j].equals('Y')){
//                    count++;
//                }
//                else{
//
//                }
//            }
//        }
    }
    public static int[][] floyd(int[][] friendValue){
        for(int i = 0; i < friendValue.length; i++){
            for(int j = 0; j < friendValue.length; j++){
                for(int k = 0; k < friendValue.length; k++){
                    if(i==j || j == k || k == i){
                        continue;
                    }
                    else if(friendValue[i][j] > friendValue[i][k] + friendValue[k][j]){
                        friendValue[i][j] = friendValue[i][k] + friendValue[k][j];
                    }
                }
            }
        }

        return friendValue;
    }
}
