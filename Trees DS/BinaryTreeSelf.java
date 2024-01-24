import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeSelf {
   public class Node{
    int data;
    Node left, right;

    Node(int data)
    {
        this.data= data;
        this.left= this.right= null;
    }
   } 
   public Node buildTree(Node root)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data of node: ");
    int data = sc.nextInt();
    root = new Node(data);
    
    if(data == -1)
    return null;

    System.out.println("Enter data for left node of "+root.data+": ");
    root.left = buildTree(root.left);
    System.out.println("Enter data for right node of "+root.data+": ");
    root.right = buildTree(root.right);
    return root;
   }

   public void levelOrderTraversal(Node root)
   {
    Queue<Node> queue= new LinkedList<>();
    queue.add(root);
    
    //addinf seperator
    queue.add(null);

    while(! queue.isEmpty())
    {
        Node temp = queue.peek();
        queue.remove();
        if(temp== null)
        {
            System.out.println(" ");
            if(!queue.isEmpty())
            {
                //ADDING SEPERATOR TO PRINT PROPERLY
                queue.add(null);
            }
        }
            else
            {
                System.out.print(temp.data+" ");
                if(temp.left!= null)
                queue.add(temp.left);
        
                if(temp.right!= null)
                queue.add(temp.right);
            }

    }
   }
   void buildFromLevelOrder(Node root)
   {
    Queue<Node> queue= new LinkedList<>();
    System.out.println("Enter data for root: ");
    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();
    root = new Node(data);
    queue.add(root);
    while(!queue.isEmpty())
    {
        Node temp = queue.peek();
        queue.remove();

        System.out.println("Enter left node for "+root.data+": ");
        int leftData = sc.nextInt();

        if(leftData!= -1)
        {
            temp.left = new Node(leftData);
            queue.add(temp.left);
        }

        System.out.println("Enter right node for "+root.data+": ");
        int rightData = sc.nextInt();

        if(rightData!= -1)
        {
            temp.right = new Node(rightData);
            queue.add(temp.right);
        }
    }
    
   }
   void preorder(Node node)    //NLR
   {
    if(node== null)
    {
        return;
    }
    System.out.print(node.data+" ");
    
    preorder(node.left);
    preorder(node.right);
   }

   //counting the leaf nodes of a binary tree
   int count=0;
    int countLeaves(Node node) 
    {
         // Your code 
         countLeaf(node);
         return count;
    }
    void countLeaf(Node node)
    {
        if(node == null)
        {
            return;
        }
        if(node.left== null && node.right==null)
        {
            count++;
            return;
        }
        countLeaf(node.left);
        countLeaf(node.right);
    }

public static void main(String[] args) {
    BinaryTreeSelf tree = new BinaryTreeSelf();
    Node root = null;
    
    //creating a tree
   root= tree.buildTree(root);

   //creating a tree with its level order traversal
   //tree.buildFromLevelOrder(root);

    //level order traversal(Breadth first)
    System.out.println("Level oder Traversal of Tree: ");
    tree.levelOrderTraversal(root);
    System.out.println("preorder traversal: ");
    tree.preorder(root);

    System.out.println("Number of leaf nodes in tree are: "+tree.countLeaves(root));
   }
}
