public class 1750TwoPointerLeetcode {
    class Solution {
        public int minimumLength(String s) {
            //TWO POINTER APPROACH
            if(s.length()==1)
            return 1;
            int l=0, r=s.length()-1;
            while(l<r && s.charAt(l)==s.charAt(r))
            {
                char c = s.charAt(l);
                while (l <= r && s.charAt(l) == c) l++;
                while (l <= r && s.charAt(r) == c) r--;
            }
            return r-l+1;
        }
    }   
}
