import java.util.*;

public class primeNumberFind {
    static ArrayList<String> arrayList = new ArrayList<String>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        int result = solution(st);
        System.out.println(result);
    }
    public static void per(String prefix, String str){
        int n = str.length();
        String temp = prefix;
        if(prefix != ""){
            while(true) {
                if (temp.length() > 1 && temp.charAt(0) == '0') {
                    temp = temp.substring(1, temp.length());
                }
                else{
                    break;
                }
            }
            if(!arrayList.contains(temp)){
                arrayList.add(temp);
            }
        }
        if(n!=0){
            for(int i = 0; i < n; i++){
                per(prefix+str.charAt(i), str.substring(0,i)+str.substring(i+1));
            }
        }
    }
    public static int solution(String numbers){
        int answer = 0;

        per("",numbers);
        boolean isPrime = true;
        for(int i = 0; i < arrayList.size(); i++){
            int temp = Integer.parseInt(arrayList.get(i));

            if(temp == 1 || temp == 0){
                continue;
            }
            for(int j = 2; j <= Math.sqrt(temp); j++){
                if(temp%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == false){
                isPrime = true;
                continue;
            }
            answer++;
        }
        return answer;
    }
}
