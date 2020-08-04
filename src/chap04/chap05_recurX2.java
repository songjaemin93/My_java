package chap04;

public class chap05_recurX2 {
    public static void main(String[] args){
        int i = 4;
        recur(4);
    }
    static void recur(int n){
        IntStack s = new IntStack(n);

        while(true){
            if(n > 0){
                s.push(n);
                n = n - 1;
                continue;
            }
            if(s.isEmpty() != true){
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
}
