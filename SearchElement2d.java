import java.util.*;

public class SearchElement2d {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int row = scn.nextInt();
        int col = scn.nextInt();
        int key  = scn.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j] == key){
                    System.err.println("element found");
                    return;
                }
            } 
        }
        System.err.println("not found");
    }
}
