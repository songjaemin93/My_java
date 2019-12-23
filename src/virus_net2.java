import java.util.*;
public class virus_net2 {
    public static void main(String[] args){
        ArrayList<Integer> net;
        ArrayList<Integer> visit;
        Scanner scan = new Scanner(System.in);
        int net_size = 0;
        while(true){
            net_size = scan.nextInt();
            if(net_size >=0 && net_size <= 100){
                break;
            }
        }
        net = new ArrayList<Integer>(Collections.nCopies(net_size+1, 0));
        visit = new ArrayList<Integer>(Collections.nCopies(net_size+1, 0));
        for(int i = 0; i < net.size(); i++){

        }

    }
}
