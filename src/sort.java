import java.util.*;

public class sort {
    public static void main(String[] ar){
        int i;


        Scanner scan = new Scanner(System.in);
        System.out.print("input dot's size : ");

        i = scan.nextInt();
        for(int j = 1; j <= (i*2); j++){
            if(j <= i) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
            }
            else{
                for(int k = j-i; k <= i; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}