import java.util.Scanner;
import java.util.StringTokenizer;

public class lostbracket {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String bracket = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(bracket, "-");
        int result = 0;
        boolean isFirst = true;
        while(st.hasMoreTokens()){
            if(isFirst == false){
                result -= add(st.nextToken());
            }
            else{
                result += add(st.nextToken());
                isFirst = false;
            }
        }
        System.out.println(result);

    }
    public static int add(String token){
        int result = 0;
        StringTokenizer st = new StringTokenizer(token, "+");
        while(st.hasMoreTokens()){
            result += Integer.parseInt(st.nextToken());
        }
        return result;
    }
}
