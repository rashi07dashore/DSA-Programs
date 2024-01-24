class Solution {
    //Function to find the height of a binary tree.
    //gfg question
    int height(Node node) 
    {
        if(node == null)
        return 0;

        int h1 = height(node.left);
        int h2 = height(node.right);
        return Math.max(h1, h2)+1;
    }
    
}
