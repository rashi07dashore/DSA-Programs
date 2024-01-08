class CustomQueue
{
   protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int front =0, end = 0; 
    private int size=0;
    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size)
    {
        this.data = new int[size];
    }
    private boolean isFull() {
       return size == data.length; //size will determine the fullness of circular queue
    }
    private boolean isEmpty(){
        return end==0;  //end is at initial position 
        //Queue is empty condition
    }
    public boolean insert(int item)
    {
       if(isFull())
       {
        return false;
       }
       data[end++] = item;
       end = end % data.length;
       size++; 
       return true;
    }
    public int remove()
    {
        if(isEmpty()){
            return -1;
        }
        int a = data[front++];  //removing from front
        front= front % data.length;
        size--;
        return a;
    }
    public void display(){
        if(isEmpty())
        {
            System.out.println("\nQueue is empty");
            return;
        }
      
        System.out.println("\ndisplaying data");
        int i= front;
        do{
            System.out.print(data[i]+ "-> ");
            i++;
            i = i% data.length;
        }while(i!= end);
        System.out.println("END");
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
    public void displayFront()
    {
        if(isEmpty()){
            System.out.println("Queue is empty, front and rear at same position");
            return;
        }
        System.out.println("\nData at front is: "+data[front]);
        return;
    }
}
public class CircularQueue {
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
    queue.displayFront();
    System.out.println("\nRemoved item: "+queue.remove());
    System.out.println("\nRemoved item: "+queue.remove());
    System.out.println("\nRemoved item: "+queue.remove());
    queue.display();
    System.out.println("\nRemoved item: "+queue.remove());
    queue.display();
    
    }
}
