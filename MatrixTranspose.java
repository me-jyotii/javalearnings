import java.util.*;
public class MatrixTranspose {

    public static int[][] MatrixTranspose(int[][] arr,int r,int c){

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();
 
        int[][] arr = new int[row][col];

        MatrixTranspose(arr,row,col);

        int[][] temp = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                temp[j][i] = arr[i][j];
            }
        }

        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.err.print(arr[i][j]+" ");
                // System.err.print(temp[i][j]+" ");
            }
            System.err.println(); 
        }
    }
}
