class Solution {
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
     if(root== null)
     return 0;
     helper(root);
     return d;
    }
    private int helper(TreeNode node)
    {
        if(node == null)
        return 0;

        int left = helper(node.left);
        int right = helper(node.right);           //finding height to calculate diameter
        int dia = left+ right;              //diameter is sum of left height+ right height
        // (adding +1 is important too but in this case it is not taking root node count)
        
        //int dia = left+ right+1 (in most cases like gfg)
        d = Math.max(d, dia);         //setting maximun diameter as answer
        return Math.max(left, right) +1;   //returning heights
    }
}


/*
//o(n^2) time complexity
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
     if(root== null)
     return 0;

     int op1 = diameterOfBinaryTree(root.left);
     int op2= diameterOfBinaryTree(root.right);
     int op3 = height(root.left) + height(root.right); //+1 but excluded it because of not taking the root node
     
     int ans = Math.max(op3, Math.max(op1, op2));
     return ans;
    }
    private int height(TreeNode node)
    {
        if(node == null)
        return 0;

        return Math.max(height(node.left), height(node.right)) +1;
    }
}
*/
