class Solution {
    public boolean closeStrings(String word1, String word2) {
        int w1[] = new int[26];
        int w2[] = new int[26];

        //storing the frequences as per the alphabet index
        for(char c: word1.toCharArray())
        w1[c- 'a']++;
        for(char c: word2.toCharArray())
        w2[c- 'a']++;

        //if one char is present in a word and another does not contains it then both operation fails
        for(int i=0; i<26; i++)
        {
            if((w1[i]==0) != (w2[i]==0))  
            // If one count is zero and the other is not, return false
            return false;
        }

        //if frequences are same then we can swap
        Arrays.sort(w1);
        Arrays.sort(w2);
        
        return Arrays.equals(w1, w2);
    }
}