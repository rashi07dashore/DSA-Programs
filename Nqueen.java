import java.util.Scanner;

public class Nqueen {
    // static int n = 4;

    static void show(int board[][]) {
        for (int temp[] : board) {
            for (int e : temp) {
                System.out.print(" " + e);
            }
            System.out.println("");
        }
        System.out.println();
    }

    static boolean isSafe( int [][] board,int row, int col,int n) {
        int i, j;
        i = row;
        j = col;

        while (j >= 0) {  // checking for row 
            if (board[i][j] == 1)
                return false;

            j--;
        }
        i = row;
        j = col;
        while (i < n && j >= 0) { // checking for lower diagonal
            if (board[i][j] == 1)
                return false;

            j--;
            i++;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) { // checking the upper diagonal
            if (board[i][j] == 1)
                return false;

            j--;
            i--;
        }

        return true;

    }

    static int[][] queen(  int [][] board ,int col,int n) {

        if (col >= n) { // if all the queens places then return 
            show(board);
            return board;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe( board , i, col,n)) { // if its safe to place a queen on this indexes
                board[i][col] = 1;

                queen( board, col + 1,n);

                board[i][col] = 0; // performing the backtracking 
            }
        }

        return board;
    }

 static void userInput(){
        Scanner s=new Scanner(System.in);
        System.out.println(" enter the number of queens you want to place :");
        int n=s.nextInt();

       int [][]board=new int[n][n];

       queen(board,0,n);
     
        // show(board);
    }
    public static void main(String[] args) {

        userInput();
        // queen(board, 0);
    }
}