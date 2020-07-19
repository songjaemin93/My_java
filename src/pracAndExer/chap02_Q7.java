package pracAndExer;
import java.util.*;
public class chap02_Q7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        int jinsu = 0;
        int cont = 1;
        int rep = 0;
        char[] jinsuArray = new char[32];
        while(cont == 1){
            System.out.println("10진수를 기수 변환합니다.");
            num = random.nextInt(10000);
            System.out.println("변환하는 음이 아닌 정수 : " + num);
            System.out.print("어떤 진수로 변환할까요?(2 ~ 36) : ");
            jinsu = scanner.nextInt();
            rep = cardConv(num, jinsu, jinsuArray);

            System.out.print("2진수로 ");
            for(int i = rep-1; i >= 0 ; i--){
                System.out.print(jinsuArray[i]);
            }
            System.out.println("입니다.");
            System.out.print("한 번 더 할까요? (1.예 / 0. 아니오) : ");
            cont = scanner.nextInt();

        }

    }
    static int cardConv(int x, int y, char[] jinsuArray){
        int count = 0;
        int copy_x = x;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for( ; x!=0 ; count++){
            jinsuArray[count] = dchar.charAt(x % y);
            if(x == copy_x){
                System.out.println(y + "|     " + x);
                System.out.println(" +-----------");
            }
            else{
                System.out.println(y + "|     " + x + "  ··· " + jinsuArray[count-1]);
                System.out.println(" +-----------");
            }
            x /= y;
            System.out.println();
        }
        System.out.println("       0" +  "  ··· " + jinsuArray[count-1]);

        return count;
    }
}
