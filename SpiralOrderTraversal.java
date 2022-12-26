import java.util.*;
public class SpiralOrderTraversal {

    public static void spiralOrderTraversal(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int row_start = 0; int row_end = row - 1, col_start = 0, col_end = col - 1;
        while(row_start <= row_end && col_start <= col_end){

            // for 1st row
            for(int i=col_start; i<=col_end; i++){
                System.err.print(arr[row_start][i]+" ");
            }
            row_start++;

            // for last column
            for(int i=row_start; i<=row_end; i++){
                System.err.print(arr[i][col_end]+" ");
            }
            col_end--;

            // for last row
            for(int i=col_end; i>=col_start; i--){
                System.err.print(arr[row_end][i]+" ");
            }
            row_end--;

            // for 1st column
            for(int i=row_end; i>=row_start; i--){
                System.err.print(arr[i][col_start]+" ");
            }
            col_start++;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        spiralOrderTraversal(arr);
    }
}
