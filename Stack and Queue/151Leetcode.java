class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        Stack<String> stack = new Stack<>();
        for(String w: words)
        {
            if(w!="")
            {
                stack.push(w);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(stack.size()> 0)
        {
            String ss = stack.pop();
            if(stack.size()==0)
            {
                sb.append(ss);
            }
            else
            sb.append(ss).append(" ");
        }
          return sb.toString();
    }
}