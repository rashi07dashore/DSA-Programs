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
    System.out.println("Pretty display");
    prettyDisplay(root, 0);  //0 is the level of root node
}
  private void prettyDisplay(Node node, int level) 
  {
    if(node== null)
    return;

    prettyDisplay(node.right , level+1);      //increase a level if right exists
    if(level!= 0)
    {
        //to add spaces according to levels
        for(int i=0; i<level-1 ; i++)
        {
            System.out.print("|\t\t");
        }
        System.out.println("|---------->" +node.data);
    }
    else{
        System.out.println(node.data);
    }
    prettyDisplay(node.left, level+1);
  }

  public void preorder()
  {
    System.out.println("\nPreorder Traversal of Tree(ROOT, LEFT, RIGHT): ");
    preorder(root);
  }

private void preorder(Node node) {
    if(node == null)
    return;

    System.out.print(node.data+",");
    preorder(node.left);
    preorder(node.right);
}
public void inorder()
{
  System.out.println("\nInorder Traversal of Tree(LEFT, ROOT, RIGHT): ");
  inorder(root);
}
private void inorder(Node node) {
 if(node== null)
 return;
 inorder(node.left);
 System.out.print(node.data+" , ");
 inorder(node.right);
}
public void postorder()
{
  System.out.println("\nPostorder Traversal of Tree(LEFT, RIGHT, ROOT): ");
  postorder(root);
}
private void postorder(Node node) {
 if(node== null)
 return;
 postorder(node.left);
 postorder(node.right);
 System.out.print(node.data+" , ");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(sc);
    // tree.display();
    tree.prettyDisplay();
    tree.preorder();
    tree.inorder();
    tree.postorder();
  }
}