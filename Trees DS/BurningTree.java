// LINK: https://www.geeksforgeeks.org/problems/burning-tree/1

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BurningTree {
    //Algorithm: 
    //Step 1: Node to parent maping
    // map<Node, Node> 
    // Step 2: Find initial Node 
    //Step 3: Visited Check of a node (set and queue)
    static Node tar=null;
    public static void parentlink(HashMap<Node,Node> map,Node root,int target){
        
        Queue<Node> qq=new LinkedList<>();
        
        if(root==null){
            return;
        }
        
        qq.add(root);
        
        while(!qq.isEmpty()){
            
            int n=qq.size();
            
            for(int i=0;i<n;i++){
                Node cur=qq.remove();
                if(cur.data==target){
                    tar=cur;
                }
                
                if(cur.left!=null){
                    map.put(cur.left,cur);
                    qq.add(cur.left);
                }
                if(cur.right!=null){
                    map.put(cur.right,cur);
                     qq.add(cur.right);
                }
            }
        }
        
    }
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
    HashMap<Node, Node> map = new HashMap<>();
    parentlink(map, root, target);
    Queue<Node> qq = new LinkedList<>();
    Set<Node> set = new HashSet<>();
    qq.add(tar);
    int count = -1;

    while (!qq.isEmpty()) {
        int n = qq.size();
        for (int i = 0; i < n; i++) {
            Node cur = qq.remove();
            set.add(cur);

            if (cur.left != null && !set.contains(cur.left)) {
                qq.add(cur.left);
            }
            if (cur.right != null && !set.contains(cur.right)) {
                qq.add(cur.right);
            }
            if (map.containsKey(cur) && !set.contains(map.get(cur))) {
                qq.add(map.get(cur));
            }
        }
        count++;
    }

    return count;
    }
}

