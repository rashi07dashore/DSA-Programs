import java.util.*;
//QUICK SORT ALGORITHM
class quick
{
    public int partition(int a[], int start, int end)
    {
        int pivot = a[end];
        int pindex = start;

        for(int i=start; i<= end-1; i++)
        {
            if(a[i] <=pivot)
            {
                int t = a[i];        //swapping a[i] and pindex
                a[i] = a[pindex];
                a[pindex] = t;
                pindex++ ; 
            }
            else 
            i++;
        }
        int t = a[pindex];
        a[pindex] = a[end];           // can also take pivot instead of a[end]
        a[end] = t;
        return (pindex);
    }

    public void quick1(int a[], int start, int end)
    {
        if(start< end)
        {
            int p = partition(a, start, end);
            quick1(a, start, p-1);
            quick1(a, p+1, end);
        }
    }
}
public class QuickSort
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

        quick q1 = new quick();
        q1.quick1(a, 0, n-1);

        System.out.println("Sorting done by QuickSort : ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}