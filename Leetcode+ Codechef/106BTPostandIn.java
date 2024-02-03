class Solution {
    //106 Leetcode question
    //construct binary tree from inorder and postorder
        public TreeNode buildTree(int[] inorder, int[] postorder) {
            //inorder: LEFT ROOT RIGHT
            //postorder: LEFT RIGHT ROOT
            //Hence last element of postorder will be root node
            //and left values of root in inorder will be left to it
            //and right values of root in inorder will be right of it
            Map<Integer, Integer> map = new HashMap<>();
           //hashmap to store inorder values with indexes
           for(int i=0; i<inorder.length; i++)
           {
               map.put(inorder[i], i);
           }
           TreeNode root = helper(postorder, 0, postorder.length-1, inorder, 0, inorder.length-1, map);
           return root;
        }
        private TreeNode helper(int[] postorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map)
       {
            if(ps > pe || is> ie)
            return null;
            TreeNode root = new TreeNode(postorder[pe]);
            int inRoot = map.get(root.val);
            int numsLeft = inRoot - is;
            root.left = helper(postorder, ps, ps+ numsLeft-1, inorder, is, inRoot-1, map);
            root.right = helper(postorder, ps+numsLeft, pe-1, inorder, inRoot+1, ie, map);
            return root;
       }
    }