import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class fiboDP {
    public static int fibonacci(int n, int dp[])
    {
        //base case
        if(n<=1)
        return n;
        
        //dp check
        if(dp[n] != -1)
        return dp[n];

        //recursion
        return dp[n] = fibonacci(n-1, dp)+ fibonacci(n-2, dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give n: ");
        int n=sc.nextInt();

        //Memoization
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibonacci(n, dp));

        //To save space use this 
        System.out.println("To save space method, give one more: ");
        int m = sc.nextInt();
        if(m<=1)
        System.out.println(m);
        else{
            int prev2=0;
            int prev1 =1;
        for(int i=2; i<=m; i++)
        {
            int curr = prev1 + prev2;
            prev2= prev1;
            prev1= curr;
        }
        System.out.println(prev1);
        }


    }
}
