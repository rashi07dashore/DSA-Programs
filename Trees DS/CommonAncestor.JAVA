// Lowest Common Ancestor
//LINK : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

//Solution 1 : Optimal solution using recurssion
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       //base case
       if(root == null || root ==p || root == q)
       return root;
       TreeNode left = lowestCommonAncestor(root.left, p, q);
       TreeNode right = lowestCommonAncestor(root.right, p, q);
       //result
       if(left == null)
       return right;
       if(right == null)
       return left;
       else //when both are non null(that is common ancestor found)
       return root;
    }
}

//Solution 2: Brute Force
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> st1 = new ArrayList<>();
        ArrayList<TreeNode> st2 = new ArrayList<>();
        TreeNode ans = null;
        function(root, p.val, st1);
        function(root, q.val, st2);
        
         int i=st1.size()-1;
        int j=st2.size()-1;

        while(i>=0 && j>=0){
            
            if(st1.get(i).val != st2.get(j).val) break;
            ans = st1.get(i);

            i--;
            j--;
        }
        return ans;
    }
    private boolean function(TreeNode root, int data, ArrayList<TreeNode> list)
    {
        if(root== null)
        return false;

        if(root.val == data)
        {
            list.add(root);
            return true;
        }
         boolean lp = function(root.left, data, list); 
        if(lp){
            list.add(root);
            return true;
        }
        boolean rp = function(root.right, data, list);
        if(rp){
            list.add(root);
            return true;
        }

        return false;
    }
}