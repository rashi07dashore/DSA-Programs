//GFG count leaves of a binary tree.
class Tree
{
    int count=0;
    int countLeaves(Node node) 
    {
         // Your code 
         preorder(node);
         return count;
    }
    void preorder(Node node)
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
        preorder(node.left);
        preorder(node.right);
    }
}
