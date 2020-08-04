package chap04;

public class IntRingQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int que[];

    public class EmptyIntRingQueueException extends RuntimeException{
        public  EmptyIntRingQueueException(){ }
    }

    public class OverflowIntRingQueueException extends RuntimeException{
        public OverflowIntRingQueueException(){ }
    }

    public IntRingQueue(int max){
        num = front = rear = 0;
        this.max = max;
        try{
            que = new int[max];
        }catch (OutOfMemoryError e){
            this.max = 0;
        }
    }

    public int enque(int x) throws OverflowIntRingQueueException{
        if(num >= max)
            throw new OverflowIntRingQueueException();
        que[rear++] = x;
        num++;
        if(rear == max)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyIntRingQueueException{
        if(num <= 0)
            throw new EmptyIntRingQueueException();
        int x = que[front++];
        num--;
        if(front == max)
            front = 0;
        return x;
    }
    public int peek() throws EmptyIntRingQueueException{
        if(num <= 0)
            throw new EmptyIntRingQueueException();
        return que[front];
    }

    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x)
                return idx;
        }
        return -1;
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
            System.out.println("큐가 비어 있습니다.");
        else{
            for(int i = 0; i < num; i++)
                System.out.print(que[(i+front) % max] + " ");
            System.out.println();
        }
    }

    public int search(int x){
        for(int i = 0; i < num; i++){
            if(que[i+front] % max == x)
                return i+1;
        }
        return 0;
    }
}
