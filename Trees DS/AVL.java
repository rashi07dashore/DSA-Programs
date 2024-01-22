import java.util.Scanner;

public class AVL {
    public class Node 
    {
        private int value;
        private int height;
        private Node left, right;

        public Node(int value)
        {
            this.value = value;
            this.left= this.right= null;
        }
        public int getValue()
        {
        return value;
        }

    }
    private Node root;
    public AVL()
    {
        //constructor
    }
    public int height(Node node)
    {
        if(node== null)
        return -1;

        return node.height;
    }
    public boolean isEmpty()
    {
        return root== null;
    }
    public void display()
    {
        display(root, "Root Node: ");
    }
    private void display(Node node, String details) {
        if(node == null)
        return;

        System.out.println(details+ node.getValue());

        display(node.left, "Left child of " + node.getValue() + ": ");
        display(node.right, "Right child of " + node.getValue() +": ");
    }
    public void insert(int value)
    {
        root= insert(value, root);
    }
    private Node insert(int value, Node node)
    {
        if(node == null)
        {
            node = new Node(value);
            return node;
        }
        if(value <= node.value){
            node.left = insert(value, node.left);
        }
        if(value> node.value){
            node.right= insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) +1;

        //To fix the structure of tree and return that node
        //In this case it is returning node only but before checking and fixing it if needed
        return rotate(node);
    }

    //DRAW TO UNDERSTAND BETTER
    //TO ROTATE THE NODES
    private Node rotate(Node node)
    {
        //left heavy
        if(height(node.left)- height(node.right) > 1)
        {
            if(height(node.left.left)- height(node.left.right) > 0)
            {
                //left-left case
                return rightRotate(node);
            }
            if(height(node.left.left)- height(node.left.right) < 0)
            {
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        //right heavy
        if(height(node.left)- height(node.right) < -1)
        {
            if(height(node.right.left)- height(node.right.right) < 0)
            {
                //right-right case
                return leftRotate(node);
            }
            if(height(node.right.left)- height(node.right.right) > 0)
            {
                //right-left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    //Node p == parent, c= child, t = other trees
    private Node rightRotate(Node p)
    {
        Node c = p.left;
        Node t = c.right;

        c.right= p;
        p.left = t;

        p.height= Math.max(height(p.left), height(p.right)) +1;
        c.height= Math.max(height(c.left), height(c.right)) +1;
        System.out.println("Right rotation done");
        return c; //New node is c
    }
    private Node leftRotate(Node c)
    {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height= Math.max(height(p.left), height(p.right)) +1;
        c.height= Math.max(height(c.left), height(c.right)) +1;
        System.out.println("Left rotation done");
        return p;
    }
    public void populate(int nums[])
    {
        for(int i=0; i<nums.length; i++)
        {
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums)
    {
        populateSorted(nums, 0, nums.length-1);
    }
    private void populateSorted(int[] nums,int start, int end) 
    {
        if(start>= end)
        return;

        int mid = (start+ end)/2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }
    public boolean balanaced()
    {
        return balanaced(root);
    }
    private boolean balanaced(Node node) {
        if(node == null)
        {
            System.out.println("The BST is balaced");
            return true;
        }

        return Math.abs(height(node.left)- height(node.right)) <=1 && balanaced(node.left) && balanaced(node.right);
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
        System.out.println("|---------->" +node.value);
    }
    else{
        System.out.println(node.value);
    }
    prettyDisplay(node.left, level+1);
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AVL tree = new AVL();
        int nums[]= {1, 2, 3, 4, 5};
        tree.populateSorted(nums);
        tree.prettyDisplay();
        //tree.balanaced();
        tree.insert(15);
        tree.prettyDisplay();
        tree.insert(5);
        tree.insert(19);
        tree.insert(27);
        tree.prettyDisplay();
    }
}
