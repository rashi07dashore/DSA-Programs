import java.math.*;
import java.util.*;
public class BST {
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
    public BST()
    {
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
        return node;
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

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {1, 2, 3, 4, 5, 6, 7,8, 9, 10};
        tree.populateSorted(nums);
        tree.display();
        tree.balanaced();
    }
}
