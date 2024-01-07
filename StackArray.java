import java.util.*;

class Stack {
    int n = 10;
    int[] arr = new int[n];
    int top = -1;
    Scanner sc = new Scanner(System.in);

    void push() {
        if (top == n - 1) {
            System.out.println("Stack Overflow");
        } else {
            System.out.println("Enter data: ");
            int i = sc.nextInt();
            top++;
            arr[top] = i;
            System.out.println("Data inserted.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            int i = arr[top];
            top--;
            System.out.println(i + " Value popped.");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            for (int j = top; j >= 0; j--) {
                System.out.println(arr[j]);
            }
        }
    }
}

public class StackArray {
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
