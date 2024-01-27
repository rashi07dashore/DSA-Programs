import java.util.ArrayList;
//GFG Question
class Solution
{
    boolean isLeaf(Node node) 
    {
        if (node == null)
        return false;    
    if (node.right == null && node.left == null)
        return true;
    return false; 
        
    }
    private void addLeftBoundary(Node node, ArrayList<Integer> res)
    {
        Node curr = node.left;
        while(curr!= null)
        {
            if(isLeaf(curr)== false) 
            {
                res.add(curr.data);
            }
            if(curr.left!= null)
            {
                curr= curr.left;
            }
            else 
            curr = curr.right;
        }
    }
    private void addLeaves(Node node, ArrayList<Integer> res)
    {
        if(isLeaf(node))
        {
            res.add(node.data);
            return;
        }
        if(node.left!= null) addLeaves(node.left, res);
        if(node.right!= null) addLeaves(node.right, res);
    }
    private void addRightBoundary(Node node, ArrayList<Integer> res)
    {
        Node curr = node.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr!= null)
        {
            if(isLeaf(curr)==false)
            {
                temp.add(curr.data);
            }
            if(curr.right!= null)
            {
                curr = curr.right;
            }
            else
            curr = curr.left;
        }
        int i;
        for(i = temp.size()-1; i>=0; --i)
        {
            res.add(temp.get(i));
        }
    }
	ArrayList <Integer> boundary(Node node)
	{
	    //Left Boundary excluding leafs
	    //leaf nodes => Inorder traversal
	    //right boundary in reverse excluding the leaf nodes => using stack
	    ArrayList<Integer> ans = new ArrayList<>();
	    if(isLeaf(node)== false) ans.add(node.data);
	    addLeftBoundary(node, ans);
	    addLeaves(node, ans);
	    addRightBoundary(node, ans);
	    return ans;
	}
}
