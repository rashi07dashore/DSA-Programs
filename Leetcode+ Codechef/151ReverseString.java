class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" +");
       StringBuilder sb = new StringBuilder();
       for(int i=words.length-1; i>=0; i--)
       {
           sb.append(words[i]);
           sb.append(" ");
       }
       return sb.toString().trim();
    }
}

//Using Stack with string
/* class Solution {
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
*/