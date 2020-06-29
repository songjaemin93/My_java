import java.util.Scanner;

public class starTournament {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int kim = 0;
        int im = 0;
        int count = 0;
        number = scanner.nextInt();
        kim = scanner.nextInt();
        im = scanner.nextInt();

        while(kim  != im) {
            kim = kim/2 + kim%2;
            im = im/2 + im%2;
            count++;
        }
        System.out.println(count);
    }
}
