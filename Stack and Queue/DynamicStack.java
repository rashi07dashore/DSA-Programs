class CustomStack 
{
   private class Node
   {
    int data;
    Node next;
   }
   Node top;
   CustomStack()
   {
    this.top = null;
   }
   public void push(int item)
   {
    Node temp = new Node();
    temp.data= item;
    temp.next = top;
    top = temp;
   }
   public boolean isEmpty()
   {
    return top==null;
   }
   public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int pop() // remove at the beginning
    {
        // check for stack underflow
        if(isEmpty())
        {
            System.out.println("Stack underflow condintion");
            return -1;
        }
 
        // update the top pointer to point to the next node
        int i = top.data;
        top = top.next;
        return i;
    }
     public void display()
    {
        // check for stack underflow
        if(isEmpty())
        {
            System.out.println("Stack underflow condintion");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.print(temp.data);
 
                // assign temp link to temp
                temp = temp.next;
                if(temp != null)
                    System.out.print(" -> ");
            }
            return;
        }
    }
}
public class DynamicStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(100);
        stack.push(82);
        stack.push(42);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
    }
}
