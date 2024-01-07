class CustomQueue
{
   protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    private boolean isFull() {
       return end == data.length-1; //end is at last index i.e. Queue is full
    }
    private boolean isEmpty(){
        return end == -1;  //end is at initial position 
        //Queue is empty condition
    }
}
public class QueueMain {
    public static void main(String[] args) {
        
    }
}
