import java.util.*;

public class rectangleToEscape {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0, w = 0, h = 0;
        x = scanner.nextInt();
        y = scanner.nextInt();
        w = scanner.nextInt();
        h = scanner.nextInt();

        int shortValue = 0;
        shortValue = findShort(x, y, w, h);
        System.out.println(shortValue);

    }
    public static int findShort(int x, int y, int w, int h){
        int shortValue = 0;
        shortValue = x - 0;
        if(shortValue > y - 0){
            shortValue = y - 0;
        }
        if(shortValue > w - x){
            shortValue = w - x;
        }
        if(shortValue > h - y){
            shortValue = h - y;
        }

        return shortValue;
    }
}
