/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //creating stack to store the LL values
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        //sum will store the temporary sum of stack tops
        int carry=0, sum=0;
        ListNode temp = l1;
        while(temp!= null)
        {
            s1.push(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp!= null)
        {
            s2.push(temp.val);
            temp = temp.next;
        }
        ListNode ans = new ListNode();
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(!s1.isEmpty())
            {
                sum = sum+ s1.pop();
            }
            if(!s2.isEmpty())
            {
                sum = sum+ s2.pop();
            }
            ans.val = sum%10;
            carry = sum/10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            sum = carry;
        }
        if(carry ==0)
        return ans.next;
    return ans;

    }
}