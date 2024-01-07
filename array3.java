import java.util.Scanner;
public class array3 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("give number of elements of array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("give array elements: ");
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("value to delete from which index: ");
        int delIndex = sc.nextInt();
        int b[] = new int[n-1];
        for(int i=0; i<n-1; i++)
        {
            if(i<delIndex)
            {
                b[i] = a[i];
            }
            else if(i>= delIndex)
            {
                b[i] = a[i+1];
            }
            
        }
        for(int bTraverse : b)
        {
            System.out.print(bTraverse+ " : ");
        }
    }}