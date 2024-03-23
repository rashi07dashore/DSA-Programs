// LINK: https://leetcode.com/problems/distribute-coins-in-binary-tree/

class Solution {
    int ans =0;
    public int distributeCoins(TreeNode root) {
        countSteps(root);
        return ans;

    }
    private int countSteps(TreeNode root)
    {
        if(root== null)
        return 0;

        int leftSteps = countSteps(root.left);
        int rightSteps = countSteps(root.right);
        ans += Math.abs(leftSteps) + Math.abs(rightSteps);
        return root.val + leftSteps+ rightSteps -1;
    }
}