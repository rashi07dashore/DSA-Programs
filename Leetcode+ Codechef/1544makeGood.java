class Solution {
    public String makeGood1(String s) {
        //Stack approach
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray())
        {
            if(!stack.isEmpty() && Math.abs(stack.peek()-c)==32)
            {
                stack.pop();
            }
            else
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder("");
        while(stack.size() > 0)
        {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    }
    public String makeGood(String s) {
        //Recusive approach
        for(int i=0; i<s.length()-1; i++)
        {
            int dif = Math.abs(s.charAt(i)-s.charAt(i+1));
            if(dif==32)
            {
                return makeGood(s.substring(0,i)+ s.substring(i+2));
            }
        }
        return s;
    }
}