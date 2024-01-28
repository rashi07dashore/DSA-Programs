import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    Node() {
    }
}
public class IterativeTraversal {
    //use of stack
    //Iterative Traversal of Binary Tree

    static List<Integer> Iterativepreorder(Node root, ArrayList < Integer > preorder)
    {
        // root left right
        if(root== null)
        return preorder;
        Stack<Node> st = new Stack<>();
        st.push(root);
        while( ! st.isEmpty())
        {
            root = st.pop();
            preorder.add(root.data);
            if(root.right != null)
            {
                st.push(root.right);
            }
            if(root.left != null)
            {
                st.push(root.left);
            }
        }
        return preorder;
    }
    static List<Integer> iterativeInorder(Node root, ArrayList<Integer> inorder)
    {
        //left root right
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(true)
        {
            if(node != null)
            {
                st.push(node);
                node = node.left;
            }
            else{
                if(st.isEmpty()) break;

                node = st.pop();
                inorder.add(node.data);
                node = node.right;
            }
        }
        return inorder;
    }
    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        ArrayList < Integer > preOrder = new ArrayList <> ();
        Iterativepreorder(root, preOrder);

        System.out.print("The Preorder Traversal using Iterative method is: ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }

        ArrayList < Integer > inorder = new ArrayList <> ();
        iterativeInorder(root, inorder);

        System.out.print("\nThe Inorder Traversal using Iterative method is: ");
        for (int i = 0; i < inorder.size(); i++) {
            System.out.print(inorder.get(i) + " ");
        }

}
}
