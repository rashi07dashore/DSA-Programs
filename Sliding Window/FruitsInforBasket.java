class Solution {

    //Leetcode 904
    
    public int totalFruit(int[] fruits) {
        //max length subarray with atmost 2 types of numbers(fruits)
        //Time complexity : O(2n)
       HashMap<Integer, Integer> mpp = new HashMap<>();
       int left=0, right=0, maxLen=0;
       while(right< fruits.length)
       {
          mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);
          while (mpp.size() > 2) 
          {
            mpp.put(fruits[left],mpp.get(fruits[left])-1);
            //if any fruits frequency is zero we simply remove it
            if(mpp.get(fruits[left])==0)
            {
                mpp.remove(fruits[left]);
            }
            left++;
          }
            if(mpp.size() <=2)
            {
                 maxLen = Math.max(maxLen,right-left+1);
            }
        
        right++;
    }
    return maxLen;
}

}

//TIME LIMIT EXCEEDED : BRUTE FORCE
// class Solution {
//     public int totalFruit(int[] fruits) {
//         //max length subarray with atmost 2 types of numbers(fruits)
//         int maxLen = Integer.MIN_VALUE;
//         for(int i=0; i< fruits.length; i++)
//         {
//             Set<Integer> set = new HashSet<Integer>();
//             for(int j=i; j< fruits.length; j++)
//             {
//                 set.add(fruits[j]);

//                 if(set.size() <= 2) 
//                 {
//                     maxLen = Math.max(maxLen, j-i+1);
//                 }
//                 else
//                 break;
//             }
//         }
//         return maxLen;

//     }
// }
