import java.util.Scanner;

public class SingleLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Give data : ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                System.out.println("Enter 1 to insert at beginning.");
                System.out.println("Enter 2 to insert at end.");
                System.out.println("Enter 3 to insert at a particular position.");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;
                    case 3:
                        System.out.println("Give the position to insert new node: ");
                        int pos = sc.nextInt();

                        Node temp1 = head;
                        for (int i = 0; i < pos - 2; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("Want to add more nodes? If yes, Enter 1: ");
            n = sc.nextInt();
        } while (n == 1);
    }

    // insert using recursion
    public void insertRecursion(int val, int index) {
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val);
            temp.next = node;
            return temp;
        }
        node.next = insertRecursion(val, index-1, node.next);
        return node;
    }

    public void traversal() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        } else {
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void delete() {
        int a = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 to delete from beginning");
            System.out.println("Press 2 to delete from end");
            System.out.println("Press 3 to delete from a particular position.");
            int c = sc.nextInt();
            if (head == null) {
                System.out.println("LL is empty.");
            } else {
                switch (c) {
                    case 1:
                        head = head.next;
                        break;
                    case 2:
                        Node t = head;
                        Node p = head.next;
                        while (p.next != null) {
                            t = p;
                            p = p.next;
                        }
                        t.next = null;
                        break;
                    case 3:
                        Node t1 = head;
                        Node p1 = head.next;
                        System.out.println("Pos to delete the Node: ");
                        int m = sc.nextInt();
                        for (int i = 0; i < m - 2; i++) {
                            t1 = p1;
                            p1 = p1.next;
                        }
                        t1.next = p1.next;
                        p1.next = null;
                        break;
                }
            }
            System.out.println("Want to delete more nodes? If yes, Enter 1: ");
            a = sc.nextInt();
        } while (a == 1);
    }

    public static void main(String args[]) {
        SingleLL ll = new SingleLL();
        ll.creation();
        ll.traversal();
        ll.delete();
        ll.traversal();
        ll.insertRecursion(10, 3);
        System.out.println("adding through recursion");
        ll.traversal();
    }
}
