import java.util.Scanner;
class array4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give row and column for 2D array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Give values of array : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.println("a["+i+"]["+j+"]: "+a[i][j]);
            }
        }
        System.out.println("Matrix format : ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}