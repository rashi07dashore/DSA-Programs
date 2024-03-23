//LINK: https://leetcode.com/problems/binary-tree-maximum-path-sum/
//LEETCODE: HARD
//Find Maximum path sum in binary tree

class Solution {
    int maxi=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int maxValue[] = new int[1];
        maxValue[0] = Integer.MIN_VALUE;
       helper(root, maxValue);
        
        return maxValue[0];
    }
    private int helper(TreeNode root, int[] maxValue)
    {
        if(root == null)
        return 0;
        int leftSum = Math.max(0, helper(root.left, maxValue));
        int rightSum = Math.max(0, helper(root.right, maxValue));

        maxValue[0] = Math.max(maxValue[0], leftSum + rightSum + root.val);
        return Math.max(leftSum, rightSum) + root.val;

    }
}