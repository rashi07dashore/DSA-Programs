import java.util.*;
public class InsertionSort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[], n;
        System.out.println("How many elements you want to enter: ");
        n= sc.nextInt();
        a = new int[n];

        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        //Insertion Sort Algorithm
        for(int i=1; i<n; i++)
        {
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j] > key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        System.out.println("Insertion Sorted array is: ");
        for(int x : a)
        {
            System.out.print(x+ " ");
        }
    }
}