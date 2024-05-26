import java.util.List;
import java.util.Scanner;

public class Graph1 {

    static void addEdge(List<List<Integer>> adj, int u, int v )
    {
        adj.get(u).add(v);
    }
    static void printGraph(List<List<Integer>> adj, int u)
    {
        for(int i=1; i<u; i++)
        {
            for(int j=0; j< adj.get(i).size(); j++)
            {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int m = sc.nextInt();
        
    }
}
