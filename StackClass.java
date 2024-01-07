import java.util.*;

public class StackClass {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
            } 
            else {
                int top = head.data;
                head = head.next;
                System.out.println(top + " Popped");
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // You can choose a different value to indicate an error or use exceptions.
            } 
            else {
                int top = head.data;
                System.out.println(top + " Peeked.");
                return top;
            }
        }
        void display()
        {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return; // You can choose a different value to indicate an error or use exceptions.
            } 
            else {
                Node temp = head;
                while(temp!= null)
                {
                    System.out.println(temp.data);
                    temp = temp.next;
                }
            }
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.pop();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.peek();
        s.pop();
        s.display();
    }
}
