import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[], n;
        System.out.println("How many elements you want to enter: ");
        n= sc.nextInt();
        a = new int[n];

        System.out.println("Enter Elemente: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp=0;
        for(int i=0; i<n-1; i++)         //passes
        {
            for(int k=0; k<n-i-1; k++)         //internal comparision
            {
                if(a[k] > a[k+1])          //swapping
                {
                    temp=a[k];
                    a[k]= a[k+1];
                    a[k+1]= temp;
                }
            }
        }

        System.out.println("Sorted Array By Bubble Sort: ");
        for(int j: a)
        {
            System.out.print(j+ " ");
        }
    }
}