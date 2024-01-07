public class AllPair {
//    ALL SOURCE SHORTEST PATH using floyd warshall algorithm which is implemented through dynamic programming 

    static int infinite = 9999;// infinite value in the graph 
    static int v = 4;  /// no. of nodes 

    static int k, i, j;

    static void allShortPath(int dist[][]) {

        for (k = 0; k < v; k++) { // k is the inserted node 

            for (i = 0; i < v; i++) {

                for (j = 0; j < v; j++) {

                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);

                 

                } // first loop close
            } // second close
        } // third close

        show(dist);
    }

    static void show(int dist[][]) {
        for (i = 0; i < v; i++) {

            for (j = 0; j < v; j++) {
                
                if(dist[i][j]==infinite)
                System.out.print("# ");
                else
                System.out.print(dist[i][j] + " ");

            } // first loop close
            System.out.println("");
        } // second close
    }

    public static void main(String[] args) {
        int dist[][] = {
                { 0, 3, infinite, 7 },
                { 8, 0, 2, infinite },
                { 5, infinite, 0, 1 },
                { 2, infinite, infinite, 0 }

        };
       allShortPath(dist);

    }
}