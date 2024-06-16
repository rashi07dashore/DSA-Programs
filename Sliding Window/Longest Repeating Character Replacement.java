
//LEETCODE 424 
// LONGEST REPEATING CHARACTER REPLACEMENT

//OPTIMAL SOLUTION
// O(n) Time Complexity

class Solution {
    public int characterReplacement(String s, int k) {

        int hash[] = new int[26];
        int maxLen=0;
        int l=0, r=0;
        int maxFreq=0;
        while(r < s.length())
        {
            hash[s.charAt(r)-'A']++;
            maxFreq= Math.max( maxFreq, hash[s.charAt(r)-'A'] );
            while( (r-l+1) - maxFreq > k)
            {
                hash[s.charAt(l)-'A']--;
                maxFreq=0;
                for(int i=0; i<25; i++)
                {
                    maxFreq = Math.max(maxFreq, hash[i]);
                }
                l++;
            }

            if( (r-l+1) - maxFreq <= k)
            {
                maxLen = Math.max(maxLen, (r-l+1));
            }

            r++;
        }
        return maxLen;
    }
}











//BRUTE FORCE
class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLen=0;
        for(int i=0; i<s.length(); i++)
        {
            int hash[] = new int[26];
            int maxf = 0;
            for(int j=i; j<s.length(); j++)
            {
                hash[s.charAt(j)-'A']++ ;
                maxf = Math.max(maxf, hash[s.charAt(j)-'A']);
               int changes = (j-i+1) - maxf;
               if(changes <=k)
               {
                maxLen = Math.max(maxLen, j-i+1);
               } 
               else
               break;
            }
        }
        return maxLen;
    }
}