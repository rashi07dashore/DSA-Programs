import java.util.*;

public class InBuiltExamples
{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(43);
        stack.push(25);
        stack.push(100);
        stack.pop();
        System.out.println(stack.peek());
        for(int s: stack)
        {
            System.out.println(s);
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(100);
        queue.add(250);
        queue.add(700);
        for(int q: queue)
        {
            System.out.println(q);
        }
       int a = queue.remove();
       System.out.println("Removed value: "+a);
       
       Deque<Integer> deque = new ArrayDeque<>();
       deque.addLast(2);
       deque.addFirst(1);
       deque.addFirst(19);
       deque.addFirst(43);
       System.out.println("Deque Elements");
       for(int d: deque)
       {
        System.out.println(d);
       }
       System.out.println(deque.removeFirst());
    }
}