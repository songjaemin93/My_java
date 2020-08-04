import java.util.*;
//별찍기를 할 때 양쪽을 다 생각하는게 아니다!!! 그냥 앞에 공백 채우고 필요한 만큼만 별을 찍어준다.
public class starDraw {
    int n = 1;
    int bool = 0;

    public void evenStar(int number){
        for(int j = 1; j <= number * 2; j++){
            for(int k = 1; (k <= number * 2); k++){
                if(j <= number){
                    if(number-j < k && k <= number+j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j-number <= k && k <= number+j-(n)){
                        bool = 1;
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            if(bool == 1) {
                n=n+2;

            }
            System.out.println();
        }
    }
    public void oddStar(int number){
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number*2-1; j++){
                if(number-i-1 <= j && j <= number+i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = number-1; i > 0; i--){
            for(int j = 0; j < number*2-1; j++){
                if(number-i <= j && j < number+i-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
