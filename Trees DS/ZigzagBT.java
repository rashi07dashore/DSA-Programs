import java.util.*;
class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
class ZigzagBT {
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<ArrayList<Integer>> wrapList = new ArrayList<>();

        if (root == null) return wrapList;

        queue.offer(root);
        boolean flag = true;
        //flag used to keep record of direction

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            ArrayList<Integer> subList = new ArrayList<Integer>(levelNum);
            for (int i = 0; i < levelNum; i++) {
                int index = i;
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (flag == true) subList.add(queue.poll().val);
                else subList.add(0, queue.poll().val);
            }
            flag = !flag; //changing direction of flag 
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void main(String args[]) {
        int i, j;
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        ArrayList < ArrayList < Integer >> ans;
        ans = zigzagLevelOrder(root);
        System.out.println("Zig Zag Traversal of Binary Tree ");
        for (i = 0; i < ans.size(); i++) {
            for (j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
}