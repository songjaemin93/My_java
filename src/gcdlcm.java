import java.util.*;

public class gcdlcm {
    public static void main(String[] args){
        int var1;
        int var2;
        int r = 1;
        int LCM;

        Scanner scanner = new Scanner(System.in);
        var1 = scanner.nextInt();
        var2 = scanner.nextInt();
        scanner.nextLine();

        int temp1 = var1, temp2 = var2;
        if(var1 < var2){
            var1 = temp2;
            var2 = temp1;
        }
        while(r>0){
            r = var1 % var2;
            var1 = var2;
            var2 = r;
        }
        LCM = temp1*temp2 / var1;
        System.out.println(var1);
        System.out.println(LCM);
    }
}
