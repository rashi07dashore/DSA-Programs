//Minimum depth of binary Tree
//Leetcode Question 111

class Solution {
    
    public int minDepth(TreeNode root) {
        if(root== null)
        return 0;
        if(root.left== null && root.right== null)
        return 1;
        if(root.left== null)
        return 1+ minDepth(root.right);
        if(root.right== null)
        return 1+ minDepth(root.left);

        //Minimum depth of the tree
        return 1+ Math.min(minDepth(root.left), minDepth(root.right));
    }
    
}