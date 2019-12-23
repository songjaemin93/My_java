import java.util.*;

public class dp_v2 {
    public static void main(String[] args){
        ArrayList<Long> dp = new ArrayList<Long>(Arrays.asList(1L, 1L, 1L));
        List<Integer> num = new ArrayList<Integer>();
        int input_num = 0;
        int temp_num=0;
        Scanner scan = new Scanner(System.in);
        input_num=scan.nextInt();
        while(input_num > num.size()){
            temp_num = scan.nextInt();
            if(temp_num>=0 && temp_num <= 100){
                num.add(temp_num);
            }
        }
        for(int i = 3; i < Collections.max(num); i++){
            dp.add(dp.get(i-2)+dp.get(i-3));
        }
        for(int j = 0; j < num.size(); j++){
            System.out.println(dp.get(num.get(j)-1));
        }
    }
}
