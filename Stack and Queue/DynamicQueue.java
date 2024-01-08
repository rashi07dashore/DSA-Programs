class CustomQueue
{
   private class Node
   {
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
   }
   Node front, end;
   CustomQueue()
   {
    this.front = null;
    this.end = null;
   }
   public void insert(int item) {
    Node temp = new Node(item);
    if(end== null){
        front= end = temp;
        return;
    }
    end.next = temp;
    end = temp;
    return;
   }

   public int remove(){
    if(front ==null){
        System.out.println("Queue is empty");
        return -1;
    }
    int removed = front.data;
    front = front.next;
    if(front == null){
        end = null;
    }
    return removed;
   }
   public void display()
   {
    if(front==null){
        System.out.println("Queue is empty");
        return;
    }
    Node temp = front;
    System.out.println("Displaying data: ");
    while(temp!= null)
    {
        System.out.print(temp.data+ " ->" );
        temp = temp.next;
    }
    System.out.print("END");
   }
}
public class DynamicQueue {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.display();
        System.out.println("\n Removed node from queue: "+queue.remove());
        queue.display();
        queue.insert(80);
        queue.insert(70);
        queue.insert(30);
        queue.insert(40);
        queue.display();
    }
}
