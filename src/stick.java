import java.util.Scanner;

public class stick {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int number = 64;
        int temp=0;
        int x = 0;
        x = scanner.nextInt();
        //scanner.nextLine();
        while(true){
            if(number == 1 || x == number){
                break;
            }
            number = number/2;
            if(x > temp + number){
                temp += number;
                count++;
                System.out.println(temp);

            }
            if(x == temp+number){
                break;
            }

        }
        System.out.println(count);
    }
}
