import java.util.*;

class Stack {
    ArrayList<Integer> arr = new ArrayList<>();
    int top = -1;
    Scanner sc = new Scanner(System.in);

    void push() {
        System.out.println("Enter data: ");
        int i = sc.nextInt();
        arr.add(i);
        top++;
        System.out.println("Data inserted.");
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int i = arr.get(top);
            arr.remove(top);
            top--;
            System.out.println(i + " Value popped.");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            for (int j = top; j >= 0; j--) {
                System.out.println(arr.get(j));
            }
        }
    }
}

public class StackArrayList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int x;
        do {
            System.out.println("Enter 1 to push, 2 to pop, and 3 to display the stack");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Want to do more operations? Enter 1 if yes.");
            x = sc.nextInt();
        } while (x == 1);
    }
}
