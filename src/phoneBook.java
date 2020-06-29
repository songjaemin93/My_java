import java.util.*;
public class phoneBook {
    public static void main(String[] args){
        String[] phone_book = {"12", "123", "1235", "567", "88"};
        String[] phone_book1 = {"12","57","578", "998", "132"};
        //System.out.println(solution(phone_book));
        System.out.println(solution(phone_book1));
    }
    //시간 나면 바로 다음 것과 비교!!!
    public static boolean solution(String[] phone_book){
        boolean answer = true;
        ArrayList<String> phoneList = new ArrayList<>();
        for(String temp : phone_book){
            phoneList.add(temp);
        }
        for(int i = 0; i < phoneList.size(); i++){
            System.out.print(phoneList.get(i) + " ");
        }
        System.out.println();
        Collections.sort(phoneList);
        //phoneList.contains는 내용 포함하면 됨. startsWith는 앞에 들어가는지 확인
        for(int i = 1; i < phoneList.size(); i++){
            if(phoneList.get(i).startsWith(phoneList.get(0))){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
