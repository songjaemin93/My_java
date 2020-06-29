import java.util.*;

public class cockTail {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        num = scanner.nextInt();
        String[][] ratio = new String[num-1][4];
        scanner.nextLine();
        for(int i=0; i < ratio.length; i++){
            ratio[i] = scanner.nextLine().replace(" ", "").split("");
        }
        int targetNum = 0;
        for(int i = 1; ; i++){
            for(int j = 0; j < ratio.length; j++){
                if(j == ratio.length-1 && i % (Integer.parseInt(ratio[j][2])/ Integer.parseInt(ratio[j][3])) == 0){
                    targetNum = i;
                    break;
                }
                if(i % (Integer.parseInt(ratio[j][2])/ Integer.parseInt(ratio[j][3])) != 0){
                    break;
                }
            }
            if(targetNum != 0){
                break;
            }
        }
        for(int i = 0; i < ratio.length; i++){
            if(i == Integer.parseInt(ratio[0][0])){
                System.out.print(targetNum+ " ");
            }
            else if(Integer.parseInt(ratio[0][0]) == ratio.length && i == ratio.length-1){
                System.out.print(targetNum / ((Integer.parseInt(ratio[i][2])/Integer.parseInt(ratio[i][3])))+ " " + targetNum);
                break;
            }
            System.out.print(targetNum / ((Integer.parseInt(ratio[i][2])/Integer.parseInt(ratio[i][3])))+ " ");
        }
    }
}
