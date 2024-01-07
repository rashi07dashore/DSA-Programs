import java.util.*;
public class DoublyLL
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)          //constructor
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head= null;

    public void creation()
    {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Give data : ");
        data = sc.nextInt();
        Node new_node = new Node(data);
        if(head==null)
        {
            head = new_node;
        }
        else
        {
            System.out.println("Enter 1 to insert at beginning.");
            System.out.println("Enter 2 to insert at end.");
            System.out.println("Enter 3 to insert at a particular position.");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    head.prev = new_node;
                    new_node.next= head;
                    head = new_node;
                    break;
                case 2:
                    Node temp1 = head;
                    while(temp1.next!= null)
                    temp1= temp1.next;

                    temp1.next= new_node;
                    new_node.prev = temp1;
                    break;
                case 3:
                    System.out.println("Give the position to insert new node{Take 1 indexed}: ");
                    int p= sc.nextInt();
                    Node temp2= head;
                    Node ptr2 = head.next;
                    for(int i=1; i<p-1; i++)
                    {
                        temp2 = ptr2;
                        ptr2= ptr2.next;
                    }
                    new_node.prev = temp2;
                    new_node.next= ptr2;
                    temp2.next= new_node;
                    ptr2.prev = new_node;
                    break;
            }
        }
       System.out.println("Want to add more nodes? If yes, Enter 1: ");
        n = sc.nextInt();
        }
        while(n==1);
    }
    public void traversal()
    {
        Node temp = head;
        if(head==null)
        {
            System.out.println("Doubly LL is empty");
        }
        else
        {
            while(temp!= null)
            {
                System.out.print(temp.data+"<-->");
                temp= temp.next;
            }
        }
    }
    public void deletion()
    {
        int a =0;
        do
        {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("DELETION");
        System.out.println("Press 1 to delete from begenning");
        System.out.println("Press 2 to delete from end");
        System.out.println("Press 3 to delete from a particular position.");
        int c = sc.nextInt();
        if(head== null)
        {
            System.out.println("DLL is empty.");
        }
        else{
            switch(c)
            {
            case 1:
                head = head.next;
                head.prev = null;
                break;
            case 2:
                Node t = head;
                while(t.next.next!= null)
                {
                    t = t.next;
                }
                t.next = null;
                break;
            case 3:
                Node t1 = head;
                Node p1= t1.next;
                System.out.println("Pos to delete the Node: ");
                int m = sc.nextInt();
                for(int i=1; i<m-1; i++)
                {
                    t1 = p1;
                    p1= p1.next;
                }
                t1.next= p1.next;
                p1.next.prev = t1;
        } 
    }
        System.out.println("Want to delete more nodes? If yes, Enter 1: ");
         a = sc.nextInt();
        }
        while(a==1);
    }

    public static void main(String args[])
    {
        DoublyLL dll = new DoublyLL();
        dll.creation();
        dll.traversal();
        dll.deletion();
        dll.traversal();
    }
}