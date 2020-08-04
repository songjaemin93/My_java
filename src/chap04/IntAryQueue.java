package chap04;

public class IntAryQueue {
    private int max;
    private int num;
    private int[] que;

    public class EmptyIntAryQueueException extends RuntimeException{
        public EmptyIntAryQueueException(){

        }
    }
    public class OverflowIntAryQueueException extends RuntimeException{
        public OverflowIntAryQueueException(){

        }
    }

    public IntAryQueue(int max){
        this.max = max;
        this.num = 0;
        try {
            que = new int[max];
        }catch (OutOfMemoryError e){
            this.max = 0;
        }
    }

    public int enque(int x) throws OverflowIntAryQueueException{
        if(num >= max)
            throw new OverflowIntAryQueueException();
        return que[num++] = x;
        //return x;
    }

    public int deque() throws EmptyIntAryQueueException{
        if(num <= 0)
            throw new EmptyIntAryQueueException();
        int temp = que[0];
        for(int i = num-1; i > 0; i--){
            que[i-1] = que[i];
        }
        num--;
        return temp;
    }

    public int peek() throws EmptyIntAryQueueException{
        if(num <= 0)
            throw  new EmptyIntAryQueueException();
        return que[num-1];
    }
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            if(x == que[i])
                return i;
        }
        return -1;
    }

    public void dump(){
        if(num <= 0){
            System.out.println("queue is empty");
        }
        else{
            for(int i = 0; i < num; i++){
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }

    public void clear(){
        num = 0;
    }

    public int capacitiy(){
        return this.max;
    }

    public int size(){
        return this.num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }
}
