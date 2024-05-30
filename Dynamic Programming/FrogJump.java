import java.util.* ;
import java.io.*; 

public class FrogJump {
   
  public static int f(int ind, int height[], int dp[])
  {
    if(ind ==0) return 0;

    if(dp[ind]!= -1)
    return dp[ind];
    
      int left = f(ind-1, height, dp) + Math.abs(height[ind]- height[ind-1]);
      int right= Integer.MAX_VALUE;
      if(ind> 1)
      right = f(ind-2, height, dp) + Math.abs(height[ind] - height[ind-2]);
    
    return dp[ind] = Math.min(left, right);
  }

  public static int frogJump(int n, int height[]) {

    //Memoization method
  int dp[] = new int [n+1];
  Arrays.fill(dp, -1);
  return f(n-1, height, dp);

   /* Tabulation save space:  
    int prev=0;
  int prev2=0;
  for(int i=1;i<height.length;i++){
      
      int jumpTwo = Integer.MAX_VALUE;
      int jumpOne= prev + Math.abs(height[i]-height[i-1]);
      if(i>1)
        jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);
    
      int cur_i=Math.min(jumpOne, jumpTwo);
      prev2=prev;
      prev=cur_i;
  }
      return prev;*/  


      /* 
      Tabulation Method: 
      int dp[] = new int[n];
      dp[0] =0;
      for(int i=1; i<n; i++)
      {
        int fs = dp[i-1] + Math.abs(height[i-1]- height[i]);
        int ss = Integer.MAX_VALUE;
        if(i> 1) ss = dp[i-2] + Math.abs(height[i-2] - height[i]);

        dp[i] = Math.min(fs, ss);
      }
      return dp[n-1]; */
    }

}
