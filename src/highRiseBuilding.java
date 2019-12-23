import java.util.Scanner;

public class highRiseBuilding {
    public static void main(String[] args) {
        int n=0;
        int hight=0;
        Scanner scan = new Scanner(System.in);
        while(true){
            n = scan.nextInt();
            if(n <= 50){
                break;
            }
        }
        int[] building = new int[n];
        for(int i = 0; i < building.length; i++){
            hight = scan.nextInt();
            if(hight <= 1000000000) {
                building[i] = hight;
            }
            else{
                i--;
            }
        }
        /*for(int i = 0; i < building.length; i++){
            System.out.print(building[i] + " ");
        }*/
        buildingSearch(building);

    }
    public static int buildingSearch(int[] building){
        int counter = 0;
        int biggestNum = 0;
        int findSeat = 0;
        for(int i = 0; i < building.length; i++){
            for(int j = 0; j <building.length; j++){
                if(i == j){
                    continue;
                }
                else if(Math.abs(i-j) == 1){
                    counter++;
                }
                else if(j < i){// 조건
                    for(int k = j+1; k < i-1; k++){
                        if(Math.sqrt((int)Math.pow(Math.abs(i-j), 2) + (int)Math.pow(Math.abs(building[i]-building[j]), 2))*k/Math.abs(i-j) < building[k]){
                            break;
                        }
                    }
                    System.out.println(Math.sqrt((int)Math.pow(Math.abs(i-j), 2) + (int)Math.pow(Math.abs(building[i]-building[j]), 2)));

                    //조건에 맞으면 count++
                }
                else if(j > i){

                }
            }
            //biggest와 비교하고 최대 자리도 저장
        }
        return 1;
    }
}
