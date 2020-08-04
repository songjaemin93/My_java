import java.util.Scanner;
public class digit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int result = 0;

        do{
            a = scanner.nextInt();
            System.out.println("a의 값 : " + a);
        }while(a <= 0);
        result = digit(a);
        System.out.println(a + "의 자리수는 " + result + "입니다.");
    }

    static int digit(int a){
        int digit = 0;
        while(a != 0){
            a = (a/10);
            digit++;
        }
        return digit;
    }
}
