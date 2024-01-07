import java.util.Scanner;
public class array2 {
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
        System.out.println("new value to be added : ");
        int newValue = sc.nextInt();
        System.out.println("at what position : ");
        int newPosition = sc.nextInt();
        int b[] = new int[n+1];
        for(int i=0; i<n+1; i++)
        {
            if(i<newPosition)
            {
                b[i] = a[i];
            }
            else if(i==newPosition)
            {
                b[i] = newValue;
            }
            else {
                b[i] = a[i-1];
            }
        }
        for(int bArray: b)
        {
            System.out.print(bArray+ " : ");
        }
    }}