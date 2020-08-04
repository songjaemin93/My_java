package chap04;

public class IntDeck {
    private int max;
    private int num;
    private int front;
    private int rear;
    private int[] que;

    public class EmptyIntDeckException extends RuntimeException{
        public EmptyIntDeckException(){

        }
    }
    public class OverflowIntDeckException extends RuntimeException{
        public OverflowIntDeckException(){

        }
    }
    public IntDeck(int x){
        num = front = rear = 0;
        max = x;
        try{
            que = new int[max];
        }catch(OutOfMemoryError e){
            max = 0;
        }
    }
    public int enqueFront(int x) throws OverflowIntDeckException{
        if(num >= max)
            throw new OverflowIntDeckException();
        num++;
        if(--front < 0)
            front = max - 1;
        que[front] = x;
        return x;
    }
    public int enqueRear(int x) throws OverflowIntDeckException{
        if(num >= max)
            throw new OverflowIntDeckException();
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x;
    }
    public int dequeFront() throws EmptyIntDeckException{
        if(num<= 0)
            throw new EmptyIntDeckException();
        int x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }
    public int dequeRear() throws EmptyIntDeckException{
        if(num <= 0)
            throw new EmptyIntDeckException();
        num--;
        if(--rear < 0)
            rear = max - 1;
        return que[rear];
    }
    public int peekFront() throws EmptyIntDeckException{
        if(num <= 0)
            throw new EmptyIntDeckException();
        return que[front];

    }
    public int peekRear() throws EmptyIntDeckException{
        if(num <= 0)
            throw new EmptyIntDeckException();
        return que[rear==0 ? max-1 : rear-1];
    }

    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            if(que[(i+front)%max] == x)
                return i+front;
        }
        return -1;
    }
    public int search(int x){
        for(int i = 0; i < num; i++){
            if(que[(i+front)%max] == x)
                return i+1;
        }
        return 0;
    }
    public void clear(){
        num = front = rear = 0;
    }
    public int capacity(){
        return max;
    }
    public int size(){
        return num;
    }
    public boolean isEmpty(){
        return num <= 0;
    }
    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if(num <= 0)
            System.out.println("Deck이 비었습니다.");
        else{
            for(int i = 0; i < num; i++){
                System.out.print(que[(i+front)%max] + " ");
            }
            System.out.println();
        }
    }
}
