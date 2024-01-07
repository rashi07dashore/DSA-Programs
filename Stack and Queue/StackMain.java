import java.util.*;

class CustomStack 
{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];

    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack overflow");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop()
    {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int i = data[ptr];
        ptr--;
        return i;
    }
    public int peek(){
        return data[ptr];
    }
    private boolean isFull() {
       return ptr == data.length-1; //ptr is at last index
    }
    private boolean isEmpty(){
        return ptr == -1;  //ptr is at initial position 
        //Stack is empty condition
    }
}
public class StackMain
{
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(43);
        stack.push(25);
        stack.push(100);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
}