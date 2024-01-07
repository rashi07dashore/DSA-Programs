import java.util.Scanner;
public class CircularLL
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)          //constructor
        {
            this.data=data;
            this.next= null;
        }
    }
    Node head = null;
    Node tail = null;

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
            tail = new_node;
            new_node.next= head;
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
                    new_node.next= head;
                    head = new_node;
                    tail = head;
                    break;
                case 2:
                    tail.next= new_node;
                    tail = new_node;
                    new_node.next = head;
                    break;
                case 3:
                    System.out.println("Give the position to insert new node: ");
                    int pos = sc.nextInt();
                    
                    Node temp1 = head;
                    for(int i=0; i<pos-2;i++)     //pos-2 is correct
                    {
                        temp1= temp1.next;
                    }
                    new_node.next = temp1.next;
                    temp1.next = new_node;
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
        if(head == null)
        {
            System.out.println("Linked List is empty");
        }
        else
        {
            do
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            while(temp != head); //head coming again means one cycle is complete
        }
    }
    public void delete()
    {
        int a=0;
        do
        {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to delete from begenning");
        System.out.println("Press 2 to delete from end");
        System.out.println("Press 3 to delete from a particular position.");
        int c = sc.nextInt();
        if(head== null)
        {
            System.out.println("LL is empty.");
        }
        else
        {
            switch(c)
            {
            case 1:
                Node temp = head.next;
                head = temp;
                tail.next= head;
                break;
            case 2:
                Node t = head;
                Node p = t.next;
                while(p.next != head)
                {
                    t = p;
                    p = p.next;
                }
                t.next = head;
                tail=t;
                break;
            case 3:
                Node t1 = head;
                Node p1= head.next;
                System.out.println("Pos to delete the Node: ");
                int m = sc.nextInt();
                for(int i=0; i<m-2; i++)
                {
                    t1 = p1;
                    p1= p1.next;
                }
                t1.next= p1.next;
                //p1.next = null;
            } 
        }
        System.out.println("Want to delete more nodes? If yes, Enter 1: ");
         a = sc.nextInt();
    }
        while(a==1);
    }
public static void main(String args[])
    {
        CircularLL cll = new CircularLL();
        cll.creation();
        cll.traversal();
        cll.delete();
        cll.traversal();
    }
    }