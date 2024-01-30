// 105. Construct Binary Tree from Preorder and Inorder Traversal
//Leetcode Question

import java.util.Map;

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       Map<Integer, Integer> map = new HashMap<>();
       //hashmap to store inorder values with indexes
       for(int i=0; i<inorder.length; i++)
       {
           map.put(inorder[i], i);
       }
       TreeNode root = helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
       return root;
    }

    private TreeNode helper(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map)
    {
        //ps : preorderStart, pe: preorderEnd, is: inorderStart, ie: inorderEnd

        if(ps > pe || is> ie)
        return null;

        TreeNode root = new TreeNode(preorder[ps]);
        int inRoot = map.get(root.val);
        int numsLeft = inRoot - is;
        root.left = helper(preorder, ps+1, ps+ numsLeft, inorder, is, inRoot-1, map);
        root.right = helper(preorder, ps+numsLeft+1, pe, inorder, inRoot+1, ie, map);
        return root;
    }
}