import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("input rol :: ");
        int row = scn.nextInt();

        int[] arr = new int[row];
        for(int i=0; i<row; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println();
        for(int i=0; i<row; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
