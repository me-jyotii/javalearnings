import java.util.*;
public class InputOutput2d {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.err.print(arr[i][j]+" ");
            }
            System.err.println();
        }
    }
}
