import java.util.Scanner;
public class Fbonacci
{
    public static void main(String atgs[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci list till: ");
        int n= sc.nextInt();
        System.out.println("Fibonacci starting from 0:");
        int first=0, second=1;
        int ans=0;
        System.out.println(first);
        for(int i=0; i<n-1; i++)
        {
            ans= first+second;
            first = second;
            System.out.println(second);
            second = ans;
        }
    }
}