import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol :: ");
        int row = scn.nextInt();
        float sum=0;

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
            sum+=arr[i];
        }

        System.out.println("\nAvg = "+(sum/row));
    }    
}
