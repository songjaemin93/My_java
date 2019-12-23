import java.util.*;

public class starDrawTest {
    public static void main(String[] ar){
        int number;
        Scanner scan = new Scanner(System.in);
        starDraw star = new starDraw();
        System.out.print("input star size : ");
        number = scan.nextInt();

        if(number%2 == 0){
            star.evenStar(number);
        }
        else if(number%2 == 1){
            star.oddStar(number);
        }
    }
}
