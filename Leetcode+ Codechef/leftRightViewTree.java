class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result = new ArrayList<Integer>();
      
      if(root == null)
      return result;
      preorder(root, result, 0);
      return result;
    }
    public void preorder(Node root, ArrayList<Integer> result, int level)
    {
        if(root== null)
        return;
        
        if(level == result.size())
        result.add(root.data);
        

        //AGAR RIGHT VIEW CHAHIYE TO RIGHT UPAR LIKH DO LEFT K
        preorder(root.left, result, level+1);
        preorder(root.right, result , level+1);
    }
}