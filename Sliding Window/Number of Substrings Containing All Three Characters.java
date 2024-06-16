
//LEETCODE - 1358

class Solution {
    public int numberOfSubstrings(String s) {
        //with every character there is a substring that ends.
       int[] hash={-1,-1,-1};
        int cnt=0;
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=i;
            if(hash[0]!=-1 && hash[1]!=-1 &&hash[2]!=-1){
                cnt=cnt+(1+Math.min(hash[0],Math.min(hash[1],hash[2])));
            }
        }
        return cnt;

    }
}

/*
Optimised Using HashMap

class Solution {
    public int numberOfSubstrings(String s) {
        //with every character there is a substring that ends.
        int count=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', -1);
        map.put('b', -1);
        map.put('c', -1);
        for(int i=0; i<s.length(); i++)
        {
            map.put(s.charAt(i), i);
            if(map.get('a')!= -1 && map.get('b')!= -1 && map.get('c')!= -1)
            {
                int steps = Math.min(map.get('a'), map.get('b'));
                int finaly = Math.min(steps, map.get('c'));
                count = count + (1+ finaly);
            }
        }
        return count;

    }
}
*/

/*
TIME LIMIT EXCEEDED 53/54 Testcases passed
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
           int[] hash= new int[3];
            for(int j=i; j<s.length(); j++)
            {
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+ hash[1]+ hash[2] == 3)
                {
                    count = count + (s.length() - j);
                    break;
                }
            }
        }
        return count;
    }
}
*/


/*
BRUTE FORCE
class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
           int[] hash= new int[3];
            for(int j=i; j<s.length(); j++)
            {
                hash[s.charAt(j)-'a']=1;
                if(hash[0]+ hash[1]+ hash[2] == 3)
                {
                    count++;
                }
            }
        }
        return count;
    }
}

*/