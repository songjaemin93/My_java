import java.util.*;

public class virus_net {
    static boolean[] visit;
    static int count = 0;
    static int[][] net_array;
    public static void main(String[] arges){
        //ArrayList<Integer[]> net = new ArrayList<Integer[]>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int input_num = 0;
        int x = 0;
        int y = 0;

        while(true){
            num = scan.nextInt();
            if(num >=0 && num <= 100){
                break;
            }
        }
        input_num = scan.nextInt();
        visit = new boolean[num+1];
        net_array = new int[num+1][num+1];
        for(int i = 0; i < input_num; i++){
            x = scan.nextInt();
            y = scan.nextInt();

            net_array[x][y]=1;
            net_array[y][x]=1;
        }
        dfs(1);
        System.out.println(count-1);
    }
    public static void dfs(int i){
        visit[i] = true;
        count++;
        for(int j = 0; j < visit.length; j++){
            if(net_array[i][j] == 1 && visit[j] == false){
                dfs(j);
            }
        }
    }
}

