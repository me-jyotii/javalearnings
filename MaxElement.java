import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol :: ");
        int row = scn.nextInt();
        int pos = 0;
        int maxm=Integer.MIN_VALUE;

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println();

        for(int i=0; i<row; i++){
            // maxm = Math.max(maxm, arr[i]);
            if(arr[i] > maxm){
                maxm = arr[i];
                pos = i+1;
            }
        }

        System.out.print("Max = "+maxm+" pos = "+pos);
    } 
}
