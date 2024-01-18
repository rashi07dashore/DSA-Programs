import java.util.Scanner;

class BinaryTree
{
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
            this.left = this.right= null;
        }
    }
    private Node root;

    //insert elements
    public void populate(Scanner sc)
    {
        System.out.println("Enter the root node value: ");
        int data = sc.nextInt();
        root = new Node(data);
        populate(sc, root);
    }
    
    //to add nodes other than root
    private void populate(Scanner sc, Node node) {
       System.out.println("Do you want to add left node of  "+node.data);
       boolean confirm = sc.nextBoolean();
       if(confirm)
       {
        System.out.println("Enter the left node of "+ node.data);
        int data = sc.nextInt();
        node.left = new Node(data);
        populate(sc, node.left);
       }

       System.out.println("Do you want to add right node of  "+node.data);
       boolean confirm1 = sc.nextBoolean();
       if(confirm1)
       {
        System.out.println("Enter the right node of "+ node.data);
        int data = sc.nextInt();
        node.right = new Node(data);
        populate(sc, node.right);
    }
}

void display()
  {
    display(root, "");
  }

private void display(Node node, String indent) {
    if(node== null)
    return;
    System.out.println(indent+ node.data);
    display(node.left, indent+ "\t");
    display(node.right, indent+ "\t");
}
public void prettyDisplay()
{
    
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);
    tree.display();
  }
}