import java.util.*;
//SELECTION SORT ALGORITHM
public class SelectionSort
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
        //Sorting algo
        for(int i=0; i<n-1; i++)        //till n-1 tak because last element will aready be sorted
        {
            int loc = i;
            for(int j=i+1 ; j<n; j++) //unsorted array indices
            {
                if(a[j] < a[loc])
                {
                    loc = j;
                }
            }
            int temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        System.out.println("Sorted array is: ");
        for(int x: a)
        {
            System.out.print(x+" ");
        }
    }
}