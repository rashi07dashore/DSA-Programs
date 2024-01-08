class CustomQueue
{
   protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0; //front will be 0th index always
    //rear will be end pointer. pointing at empty space near last pointer
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    private boolean isFull() {
       return end == data.length; //end is at last index i.e. Queue is full
    }
    private boolean isEmpty(){
        return end == 0;  //end is at initial position 
        //Queue is empty condition
    }
    public boolean insert(int item)
    {
       if(isFull())
       {
        return false;
       }
       data[end] = item;
       end++; 
       return true;
    }
    public int remove()
    {
        if(isEmpty()){
            return -1;
        }
        int a = data[0];  //removing from front
        for(int i=1; i<end; i++)
        {
            data[i-1] = data[i];
        }
        end--; //end pointer is decreased 
        return a;
    }
    public void display(){
        if(isEmpty())
        return;
        System.out.println("\ndisplaying data");
        for(int i=0; i<end; i++)
        {
            System.out.print(data[i]+"->");
        }
        System.out.print("END");
        return;
    }
    public void displayFront_Rear()
    {
        if(isEmpty()){
            System.out.println("Queue is empty, front and rear at same position");
            return;
        }
        System.out.println("\nfront is at index: 0 and rear(end) at index: "+end);
        return;
    }
}
public class QueueMain {
    public static void main(String[] args) {
    CustomQueue queue= new CustomQueue();
    queue.insert(90);
    queue.insert(80);
    queue.insert(53);
    queue.insert(31);
    queue.display();
    System.out.println("\nRemoved item: "+queue.remove());
    queue.display();
    queue.insert(10);
    queue.display();
    queue.displayFront_Rear();

    }
}
